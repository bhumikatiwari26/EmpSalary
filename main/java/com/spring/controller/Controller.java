package com.spring.controller;

import com.spring.Service.EmpService;
import com.spring.entity.EmpSalary;
import com.spring.repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller
{
    @Autowired
    private EmpService  empService;

    @PostMapping("/save")
    public String saveEmpsalary(@RequestBody EmpSalary empSalary){
        EmpSalary empSalary1 =empService.saveEmpsalary(empSalary);
        String msg = null;
        if(empSalary1!=null){
            msg="data is saved";
        }
        else{
            msg="data is not saved";
        }
        return msg;
    }
    @DeleteMapping("/delete/{empId}")
    public void deleteEmpsalary(@PathVariable  Integer empId){
        empService.deleteEmpsalary(empId);
    }
    @PutMapping("/update/{empId}")
    public EmpSalary updateEmpsalary(@RequestBody EmpSalary empSalary,@PathVariable Integer empId){
        EmpSalary e1 = empService.updateEmpsalary(empSalary,empId);
        return e1;
    }
    @GetMapping("/getAll")
    public List<EmpSalary>getAll(){
        List<EmpSalary> e11=empService.getAllEmpsalary();
        return e11;
    }
    @GetMapping("/get/{empId}")
    public EmpSalary getEmpsalary(@PathVariable Integer empId){
        EmpSalary e12 = empService.getEmpsalary(empId);
        return e12;
    }
}
