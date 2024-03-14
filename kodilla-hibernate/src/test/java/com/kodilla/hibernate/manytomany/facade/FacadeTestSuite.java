package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    private Facade facade;
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CompanyDao companyDao;

    @Test
    public void findEmployeesWithLastnameLike() {

        //Given
        Employee johnStanford = new Employee("John", "Stanford");
        Employee sarahSpectre = new Employee("Sarah", "Spectre");
        Employee markStanley = new Employee("Mark", "Stanley");
        employeeDao.save(johnStanford);
        employeeDao.save(sarahSpectre);
        employeeDao.save(markStanley);

        //When
        List<Employee> employees = facade.findEmployeesWithLastnameLike("Sta");

        //Then
        Assertions.assertEquals(2, employees.size());

        //CleanUp
        employeeDao.deleteAll();
    }

    @Test
    public void findCompaniesWithNameLike() {

        //Given
        Company foodie = new Company("Foodie");
        Company goodie = new Company("Goodie");
        Company uber = new Company("Uber");
        companyDao.save(foodie);
        companyDao.save(goodie);
        companyDao.save(uber);

        //When
        List<Company> companies = facade.findCompaniesWithNameLike("Foo");

        //Then
        Assertions.assertEquals(1, companies.size());

        //CleanUp
        companyDao.deleteAll();
    }
}

