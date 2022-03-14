package com.WagesCalculator;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Controller {
    private static ArrayList<Employee> employees = new ArrayList<>();
    public static void main() {
        Scanner csvReaderEmployees, csvReaderHours;
        try {
            csvReaderEmployees = new Scanner(new File("workers.csv"));
            csvReaderHours = new Scanner(new File("work1.csv"));
            readEmployee(csvReaderEmployees);
            readHours(csvReaderHours);

        }
        catch (IOException e) {
            e.printStackTrace();
        }

        Collections.sort(employees);
        printEmployees(employees);
    }

    private static void printEmployees(ArrayList<Employee> employees){
        for(Employee e : employees){
            System.out.println("Name: "+e.getName()+", Wage: "+e.getWage()+" ");
        }
    }
    private static void readEmployee(Scanner csvReader){
        String row;
        while (csvReader.hasNext()) {
            row = csvReader.nextLine();
            String[] data = row.split(";");
            // do something with the data
            switch (data[1]) {
                case "worker": {
                    employees.add(new Worker(data[0], "worker", Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4])));
                    break;
                }
                case "manager": {
                    employees.add(new Manager(data[0], "manager", Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4])));
                    break;
                }
                default:
                    break;
            }
        }
        csvReader.close();
    }
    private static void readHours(Scanner csvReaderHours){
        String row;
        while (csvReaderHours.hasNext()){
            row = csvReaderHours.nextLine();
            String[] data = row.split(";");
            for(Employee e:employees){
                if(e.getName().equals(data[0])){
                    e.updateHours(Integer.parseInt(data[1]));
                    break;
                }
            }
        }
        csvReaderHours.close();

    }
}
