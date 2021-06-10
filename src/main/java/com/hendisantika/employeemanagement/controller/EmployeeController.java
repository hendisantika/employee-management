package com.hendisantika.employeemanagement.controller;

import com.hendisantika.employeemanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by IntelliJ IDEA.
 * Project : employee-management
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 10/06/21
 * Time: 09.27
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

}
