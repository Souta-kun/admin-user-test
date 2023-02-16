package com.colsubsidio.testback.services.impl;

import com.colsubsidio.testback.models.Customer;
import com.colsubsidio.testback.models.dto.CustomerDto;
import com.colsubsidio.testback.models.mapper.CustomerMapper;
import com.colsubsidio.testback.repositories.ICustomerRepository;
import com.colsubsidio.testback.services.ICustomerService;
import com.colsubsidio.testback.services.IPhoneService;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private ICustomerRepository iCustomerRepository;
    @Autowired
    IPhoneService iPhoneService;

    private CustomerMapper mapper = Mappers.getMapper(CustomerMapper.class);

    @Override
    public CustomerDto save(CustomerDto customerDto) {
        Customer customerSave = iCustomerRepository.save(mapper.CustomerDtoToCustomer(customerDto));
        customerDto.getPhones().stream().forEach(phone -> {
            iPhoneService.save(phone,customerSave);
        });
        return mapper.customerToCustomerDto(customerSave);
    }

    @Override
    public List<CustomerDto> get() {
        return mapper.map(iCustomerRepository.findAll());
    }

    @Override
    public List<CustomerDto> getByName(String name) {
        return mapper.map(iCustomerRepository.findUserByNameParams(name));
    }
}
