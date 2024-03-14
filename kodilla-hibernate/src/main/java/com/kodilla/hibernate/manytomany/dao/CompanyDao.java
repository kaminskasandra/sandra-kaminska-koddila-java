package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.NamedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {
    @Query(name = "Company.findByFirstThreeCharacters")
    List<Company> findByFirstThreeCharacters(@Param("characters") String characters);

    @Query(name = "Company.findCompaniesWithNameLike")
    List<Company> findCompaniesWithNameLike(@Param("COMPANY_NAME") String arg);
}