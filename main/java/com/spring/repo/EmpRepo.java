package com.spring.repo;

import com.spring.entity.EmpSalary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo extends JpaRepository<EmpSalary,Integer>
{
}
