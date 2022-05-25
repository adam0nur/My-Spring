package com.example.repository;


import com.example.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department,String> {

    //Display all Departments in the furniture department
    List<Department> findByDepartment(String department);

    //Display all Departments in the Health Division
    List<Department> findByDivisionIs(String division);

    //Display top 3 departments with division name includes 'Hea', without duplicates
    List<Department> findDistinctTop3ByDivisionContains(String pattern);


    @Query// check Jpa
    List<Department> retrieveDepartmentByDivision(String division);

    @Query(nativeQuery = true)
    List<Department> retrieveDepartmentByDivisionContain(String pattern);




}
