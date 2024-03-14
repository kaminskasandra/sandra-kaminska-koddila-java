package com.kodilla.hibernate.manytomany.facade;

public class ProcessingException extends Exception{
    public static String ERR_EMPLOYEE_NOT_FOUND = "Employee with given lastname doesn't exist";
    public static String ERR_COMPANY_NOT_FOUND = "Company with given name doesn't exist";
    public ProcessingException(String message) {
        super(message);
    }
}
