package com.hendisantika.employeemanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 * Project : employee-management
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 10/06/21
 * Time: 08.55
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRegistrationDto {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
