package com.mycompany.assignment;

import java.util.Scanner;

public class Employee implements MainInterface {
    
    int id;
    String fullName;
    String seniority;

    public Employee(int id, String fullName, String seniority) {
        this.setId(id);
        this.setFullName(fullName);
        this.setSeniority(seniority);
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSeniority() {
        return seniority;
    }

    public void setSeniority(String seniority) {
        this.seniority = seniority;
    }

    public void getItem(String item) {
       if(item.equals("salary")){
           salary();
       }else if(item.equals("vacations")){
           vacations();
       }else {
           System.out.println("Input can either be : salary or vacations");
       }
    }
    
    public void salary() {
         if(seniority.equals("staff")){
            System.out.println("Input administrative postion ranges from 1-10 depending on authority 1 for basic, 10 for head: ");
            Scanner in = new Scanner(System.in);
            int position = in.nextInt();
            
            System.out.println("Input extra bonus calculated from their general salary in percentage: ");
             
            double bonus = in.nextDouble();
            
            Staff staff = new Staff(position, bonus);
            staff.calculateSalary();
            
        }else if(seniority.equals("faculty")){
            
        }else {
            System.out.println("senirioty can either be : staff or faculty");
        }
    }
    
    public void vacations() {
          if(seniority.equals("staff")){
            System.out.println(seniority);
        }else if(seniority.equals("faculty")){
            
        }else {
            System.out.println("senirioty can either be : staff or faculty");
        }
    }

    @Override
    public void displaySalary(double total) {
        System.out.println(total);
    }
}
