package com.example.ems_backend.service;

import com.example.ems_backend.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllemployees();

    EmployeeDto updateEmployee(Long employeeId, EmployeeDto updateEmployee);

    void deleteEmployee(Long employeeId);
}
