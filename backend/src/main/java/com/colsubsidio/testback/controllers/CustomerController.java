package com.colsubsidio.testback.controllers;

import com.colsubsidio.testback.models.dto.CustomerDto;
import com.colsubsidio.testback.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api")
@CrossOrigin(origins = "*")
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;

    @PostMapping("customer/")
    private ResponseEntity<CustomerDto> saveUser(@RequestBody CustomerDto customerDto)
    {
        return new ResponseEntity<>(iCustomerService.save(customerDto), HttpStatus.OK);
    }

    @GetMapping("customer/")
    private ResponseEntity<List<CustomerDto>> get()
    {
        return new ResponseEntity<>(iCustomerService.get(), HttpStatus.OK);
    }

    @GetMapping("customer/getByName")
    private ResponseEntity<List<CustomerDto>> getByName(@RequestParam String name)
    {
        return new ResponseEntity<>(iCustomerService.getByName(name), HttpStatus.OK);
    }
}
