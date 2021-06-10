package com.hendisantika.employeemanagement.service;

import com.hendisantika.employeemanagement.dto.UserRegistrationDto;
import com.hendisantika.employeemanagement.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * Created by IntelliJ IDEA.
 * Project : employee-management
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 10/06/21
 * Time: 09.23
 */
public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
