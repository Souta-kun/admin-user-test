package com.colsubsidio.testback.services;

import com.colsubsidio.testback.models.Customer;
import com.colsubsidio.testback.models.Phone;
import com.colsubsidio.testback.models.dto.PhoneDto;

public interface IPhoneService {
    Phone save(PhoneDto phoneDto, Customer customer);
}
