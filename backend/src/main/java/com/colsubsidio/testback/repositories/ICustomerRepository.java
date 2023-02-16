package com.colsubsidio.testback.repositories;

import com.colsubsidio.testback.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {
    @Query(value = "SELECT u.* FROM CUSTOMER u WHERE u.NAME LIKE %:name%", nativeQuery = true)
    List<Customer> findUserByNameParams(@Param("name") String name);
}
