package com.hendisantika.employeemanagement.repository;

import com.hendisantika.employeemanagement.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * Project : employee-management
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 10/06/21
 * Time: 09.04
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
