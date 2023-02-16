package com.colsubsidio.testback.models.mapper;

import com.colsubsidio.testback.models.Phone;
import com.colsubsidio.testback.models.dto.PhoneDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface PhoneMapper {
    PhoneDto phoneToPhoneDto(Phone phone);
    Phone PhoneDtoToPhone(PhoneDto phoneDto);
    List<PhoneDto> map(List<Phone> Phones);
}
