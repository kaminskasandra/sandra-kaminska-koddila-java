package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {
    private final EmployeeDao employeeDao;
    private final CompanyDao companyDao;

    public Facade(EmployeeDao employeeDao, CompanyDao companyDao) {
        this.employeeDao = employeeDao;
        this.companyDao = companyDao;
    }

    public List<Employee> findEmployeesWithLastnameLike(String arg) {
        return employeeDao.findEmployeeWithLastnameLike(arg);

    }

    public List<Company> findCompaniesWithNameLike(String arg) {
        return companyDao.findCompaniesWithNameLike(arg);
    }
}