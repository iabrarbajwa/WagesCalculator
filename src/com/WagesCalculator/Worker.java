package com.WagesCalculator;

public class Worker extends Employee {
    private int hourlyWage;

    public Worker(String name, String position,int reqDailyHours,int hourlyWage,int hourlyOvertimeWage) {
        super(name, position, reqDailyHours,hourlyOvertimeWage);
        this.hourlyWage = hourlyWage;
    }

    @Override
    public int getWage() {
        return (this.getSumOfWorkHours()*this.hourlyWage)+(this.getSumOfOvertimeHours()*this.getHourlyOvertimeWage());
    }
}