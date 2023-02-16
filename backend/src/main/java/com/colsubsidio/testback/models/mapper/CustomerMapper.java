package com.colsubsidio.testback.models.mapper;

import com.colsubsidio.testback.models.Customer;
import com.colsubsidio.testback.models.dto.CustomerDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CustomerMapper {
    CustomerDto customerToCustomerDto(Customer customer);
    Customer CustomerDtoToCustomer(CustomerDto customerDto);
    List<CustomerDto> map(List<Customer> customers);
}
