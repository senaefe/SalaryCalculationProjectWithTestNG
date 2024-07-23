package com.rd.SalaryCalculation;

public class SalaryCalculation {

    public String personnel;
    public int workedDay;
    public double dailySalary;
    public double monthlySalary;
    public double totalSalary;
    public int extraPremium;

    public void calculateSalary(int workedDay) {
        this.workedDay = workedDay;
        monthlySalary = dailySalary * workedDay;
        totalSalary = (workedDay > 25) ? (monthlySalary + (workedDay - 25) * extraPremium) : monthlySalary;
    }
}


