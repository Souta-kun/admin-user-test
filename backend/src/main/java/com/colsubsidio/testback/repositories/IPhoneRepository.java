package com.colsubsidio.testback.repositories;

import com.colsubsidio.testback.models.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPhoneRepository extends JpaRepository<Phone, Long> {
}
