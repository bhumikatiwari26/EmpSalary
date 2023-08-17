package com.spring.Service;

import com.spring.entity.EmpSalary;
import com.spring.repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImple implements EmpService
{
    @Autowired
    private EmpRepo empRepo;

    @Override
    public EmpSalary saveEmpsalary(EmpSalary empSalary)
    {
        double sal;
        double ta;
        double da;
        double hra;
        double pf;
        double gs;
        double ns;
//        empSalary.getEmpId();
//        empSalary.getEmpName();
//        empSalary.getEmpAddress();
        sal= empSalary.getEmpSal();
        EmpSalary e1=new EmpSalary();



        e1.setEmpId(empSalary.getEmpId());
        e1.setEmpName(empSalary.getEmpName());
        e1.setEmpAddress(empSalary.getEmpAddress());
        e1.setEmpSal(sal);


        if(sal<30000)
        {
             ta = sal*7/100;
            e1.setTa(ta);
            da =sal*9/100;
            e1.setDa(da);
             hra =sal*11/100;
            e1.setHra(hra);
             pf = sal*15/100;
            e1.setPf(pf);
             gs = sal+ta+hra+da;
            e1.setGsal(gs);
             ns =gs-pf;
            e1.setNsal(ns);
        }
        else if (sal>=30000 && sal <50000)
        {
             ta = sal*12/100;
            e1.setTa(ta);
             da =sal*13/100;
            e1.setDa(da);
             hra =sal*17/100;
            e1.setHra(hra);
             pf = sal*22/100;
            e1.setPf(pf);
             gs = sal+ta+hra+da;
            e1.setGsal(gs);
             ns =gs-pf;
            e1.setNsal(ns);
        }
        else{
             ta = sal*17/100;
            e1.setTa(ta);
             da =sal*19/100;
            e1.setDa(da);
             hra =sal*21/100;
            e1.setHra(hra);
             pf = sal*25/100;
            e1.setPf(pf);
             gs = sal+ta+hra+da;
            e1.setGsal(gs);
             ns =gs-pf;
            e1.setNsal(ns);
        }


        return empRepo.save(e1);
    }

    @Override
    public void deleteEmpsalary(Integer empId)
    {
        empRepo.deleteById(empId);
    }

    @Override
    public EmpSalary updateEmpsalary(EmpSalary empSalary, Integer empId)
    {
        EmpSalary e2 = empRepo.findById(empId).get();
        double sal;
        double ta;
        double da;
        double hra;
        double pf;
        double gs;
        double ns;
        sal= empSalary.getEmpSal();
        e2.setEmpId(empId);
        e2.setEmpName(empSalary.getEmpName());
        e2.setEmpAddress(empSalary.getEmpAddress());
        e2.setEmpSal(sal);
        if(sal<30000)
        {
            ta = sal*7/100;
            e2.setTa(ta);
            da =sal*9/100;
            e2.setDa(da);
            hra =sal*11/100;
            e2.setHra(hra);
            pf = sal*15/100;
            e2.setPf(pf);
            gs = sal+ta+hra+da;
            e2.setGsal(gs);
            ns =gs-pf;
            e2.setNsal(ns);
        }
        else if (sal>=30000 && sal <50000)
        {
            ta = sal*12/100;
            e2.setTa(ta);
            da =sal*13/100;
            e2.setDa(da);
            hra =sal*17/100;
            e2.setHra(hra);
            pf = sal*22/100;
            e2.setPf(pf);
            gs = sal+ta+hra+da;
            e2.setGsal(gs);
            ns =gs-pf;
            e2.setNsal(ns);
        }
        else{
            ta = sal*17/100;
            e2.setTa(ta);
            da =sal*19/100;
            e2.setDa(da);
            hra =sal*21/100;
            e2.setHra(hra);
            pf = sal*25/100;
            e2.setPf(pf);
            gs = sal+ta+hra+da;
            e2.setGsal(gs);
            ns =gs-pf;
            e2.setNsal(ns);
        }
        return empRepo.save(e2);
    }

    @Override
    public List<EmpSalary> getAllEmpsalary()
    {
        List<EmpSalary> empSalaries =empRepo.findAll();
        return empSalaries;
    }

    @Override
    public EmpSalary getEmpsalary(Integer empId)
    {
        EmpSalary empSalary = empRepo.findById(empId).get();
        return empSalary;
    }


}









