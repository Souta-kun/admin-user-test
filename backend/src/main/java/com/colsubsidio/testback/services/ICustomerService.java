package com.colsubsidio.testback.services;

import com.colsubsidio.testback.models.dto.CustomerDto;

import java.util.List;

public interface ICustomerService {
    CustomerDto save(CustomerDto customerDto);
    List<CustomerDto> get();
    List<CustomerDto> getByName(String name);
}
