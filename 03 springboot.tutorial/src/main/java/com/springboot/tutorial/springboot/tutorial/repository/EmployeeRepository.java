package com.springboot.tutorial.springboot.tutorial.repository;

import com.springboot.tutorial.springboot.tutorial.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository <EmployeeEntity, Long> {

}
