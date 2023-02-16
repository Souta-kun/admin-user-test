package com.colsubsidio.testback.services.impl;

import com.colsubsidio.testback.models.Customer;
import com.colsubsidio.testback.models.Phone;
import com.colsubsidio.testback.models.dto.PhoneDto;
import com.colsubsidio.testback.models.mapper.PhoneMapper;
import com.colsubsidio.testback.repositories.IPhoneRepository;
import com.colsubsidio.testback.services.IPhoneService;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneServiceImpl implements IPhoneService {

    @Autowired
    private IPhoneRepository iPhoneRepository;

    private PhoneMapper mapper
            = Mappers.getMapper(PhoneMapper.class);
    @Override
    public Phone save(PhoneDto phoneDto, Customer customer) {
        Phone phone = mapper.PhoneDtoToPhone(phoneDto);
        phone.setCustomer(customer);
        return iPhoneRepository.save(phone);
    }
}
