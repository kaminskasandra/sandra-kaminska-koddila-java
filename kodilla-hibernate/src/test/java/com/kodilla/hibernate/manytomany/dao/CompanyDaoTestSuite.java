package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;
    @Autowired EmployeeDao employeeDao;

    @Test
    void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMaestersId);
        assertNotEquals(0, greyMatterId);

        //CleanUp
        //try {
        //    companyDao.deleteById(softwareMachineId);
        //    companyDao.deleteById(dataMaestersId);
        //    companyDao.deleteById(greyMatterId);
        //} catch (Exception e) {
        //    //do nothing
        //}
    }
    @Test
    public void testFindByFirstThreeCharacters() {
        Company company1 = new Company("First Company");
        Company company2 = new Company("Second Company");
        Company company3 = new Company("Third Company");

        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);

        List<Company> foundCompanies = companyDao.findByFirstThreeCharacters("Sec");

        Assertions.assertEquals(1, foundCompanies.size());

        Assertions.assertEquals("Second Company", foundCompanies.get(0).getName());
    }


    @Test
    void testFindByLastName() {
        // Given
        Employee employee1 = new Employee("Sarah", "Thomson");
        Employee employee2 = new Employee("John", "Smith");
        Employee employee3 = new Employee("George", "Stone");

        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);

        // When
        List<Employee> employeesWithLastnameDoe = employeeDao.findByLastname("Stone");

        // Then
        try {
            Assertions.assertEquals(1, employeesWithLastnameDoe.size());
            Assertions.assertEquals("Stone", employeesWithLastnameDoe.get(0).getLastname());

        } finally {
            // CleanUp
            employeeDao.deleteAll();
        }
    }
    @AfterEach
    void cleanUp() {
        employeeDao.deleteAll();
        companyDao.deleteAll();
    }
}
