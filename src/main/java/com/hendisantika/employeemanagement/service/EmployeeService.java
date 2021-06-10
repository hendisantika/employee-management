package com.hendisantika.employeemanagement.service;

import com.hendisantika.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : employee-management
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 10/06/21
 * Time: 09.10
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
}
