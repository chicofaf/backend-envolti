package com.envolti.personapi.repository;

import java.util.Optional;

import com.envolti.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends PagingAndSortingRepository<Person, Long>, JpaRepository<Person, Long>, JpaSpecificationExecutor<Person> {

}