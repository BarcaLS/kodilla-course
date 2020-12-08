package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartialSearcherFacade {
    private final CompanyDao companyDao;
    private final EmployeeDao employeeDao;

    @Autowired
    private PartialSearcherFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public List<Company> searchCompanyByPartOfName(final String partOfName) {
        return companyDao.retrieveNameByPartOfName("%" + partOfName + "%");
    }

    public List<Employee> searchEmployeeByPartOfName(final String partOfName) {
        return employeeDao.retrieveNameByPartOfName("%" + partOfName + "%");
    }
}
