package com.itschool.library.services;

import com.itschool.library.models.dtos.RequestCustomerDTO;
import com.itschool.library.models.dtos.ResponseCustomerDTO;

public interface CustomerService {

    ResponseCustomerDTO createCustomer(RequestCustomerDTO requestCustomerDTO);

    public void deleteCustomerById(Long id);
}