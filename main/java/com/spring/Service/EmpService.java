package com.spring.Service;

import com.spring.entity.EmpSalary;

import java.util.List;

public interface EmpService
{
    public EmpSalary saveEmpsalary(EmpSalary empSalary);
    public void deleteEmpsalary(Integer empId);
    public EmpSalary updateEmpsalary(EmpSalary  empSalary ,Integer empId );
    public List<EmpSalary> getAllEmpsalary();
    public EmpSalary getEmpsalary(Integer empId);

}
