package com.WagesCalculator;

public abstract class Employee implements Comparable<Employee> {
    private  String name;
    private  String position;
    private int reqDailyHours;
    private int sumOfWorkHours;
    private int sumOfOvertimeHours;
    private int hourlyOvertimeWage;

    public Employee(String name, String position,int reqDailyHours, int hourlyOvertimeWage){
        this.name = name;
        this.position =  position;
        this.reqDailyHours = reqDailyHours;
        this.hourlyOvertimeWage = hourlyOvertimeWage;
    }
    public abstract int getWage();

    public void updateHours(int hours){
        this.sumOfWorkHours += hours;
        setSumOfOvertimeHours();
    }

    public int getHourlyOvertimeWage() {
        return hourlyOvertimeWage;
    }



    public void setSumOfWorkHours(int sumOfWorkHours) {
        this.sumOfWorkHours = sumOfWorkHours;
        setSumOfOvertimeHours();
    }

    private void setSumOfOvertimeHours() {
        sumOfOvertimeHours= Math.max(sumOfWorkHours-reqDailyHours,0);
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getReqDailyHours() {
        return reqDailyHours;
    }

    public int getSumOfWorkHours() {
        return sumOfWorkHours;
    }

    public int getSumOfOvertimeHours() {
        return sumOfOvertimeHours;
    }


    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", reqDailyHours=" + reqDailyHours +
                ", sumOfWorkHours=" + sumOfWorkHours +
                ", sumOfOvertimeHours=" + sumOfOvertimeHours +
                '}';
    }
}
