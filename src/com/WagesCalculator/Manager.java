package com.WagesCalculator;

public class Manager extends Employee{
    private int basicWage;

    public Manager(String name, String position,int reqDailyHours,int basicWage,int hourlyOvertimeWage){
        super(name, position, reqDailyHours,hourlyOvertimeWage);
        this.basicWage=basicWage;
    }

    @Override
    public int getWage() {
        return this.basicWage+(this.getSumOfOvertimeHours()*this.getHourlyOvertimeWage());
    }
}
