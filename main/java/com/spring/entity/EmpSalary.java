package com.spring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "empsal_tab")
public class EmpSalary
{
    @Id
    private int empId;
    private String empName;
    private String empAddress;
    private Double empSal;
    private Double ta;
    private Double hra;
    private  Double pf;
    private Double da;
    private Double gsal;
    private Double nsal;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public Double getEmpSal() {
        return empSal;
    }

    public void setEmpSal(Double empSal) {
        this.empSal = empSal;
    }

    public Double getTa() {
        return ta;
    }

    public void setTa(Double ta) {
        this.ta = ta;
    }

    public Double getHra() {
        return hra;
    }

    public void setHra(Double hra) {
        this.hra = hra;
    }

    public Double getPf() {
        return pf;
    }

    public void setPf(Double pf) {
        this.pf = pf;
    }

    public Double getDa() {
        return da;
    }

    public void setDa(Double da) {
        this.da = da;
    }

    public Double getGsal() {
        return gsal;
    }

    public void setGsal(Double gsal) {
        this.gsal = gsal;
    }

    public Double getNsal() {
        return nsal;
    }

    public void setNsal(Double nsal) {
        this.nsal = nsal;
    }

    public EmpSalary(int empId, String empName, String empAddress, Double empSal, Double ta, Double hra, Double pf, Double da, Double gsal, Double nsal) {
        this.empId = empId;
        this.empName = empName;
        this.empAddress = empAddress;
        this.empSal = empSal;
        this.ta = ta;
        this.hra = hra;
        this.pf = pf;
        this.da = da;
        this.gsal = gsal;
        this.nsal = nsal;
    }

    public EmpSalary() {
        super();
    }

    @Override
    public String toString() {
        return "EmpSalary{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empAddress='" + empAddress + '\'' +
                ", empSal=" + empSal +
                ", ta=" + ta +
                ", hra=" + hra +
                ", pf=" + pf +
                ", da=" + da +
                ", gsal=" + gsal +
                ", nsal=" + nsal +
                '}';
    }
}
