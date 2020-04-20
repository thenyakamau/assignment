
package com.mycompany.assignment;

import java.util.Scanner;


public class Main {
    
   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Enter unique id: ");
        int id = in.nextInt();
        System.out.println("Enter fullName: ");
        String fullname = in.next();
        System.out.println("Enter seniority: ");
        String seniority = in.next();
        
        System.out.println("What do you need?: salary or vacations");
        String items = in.next();
        Employee employee = new Employee(id, fullname, seniority);
        employee.getItem(items);
    }
    
}
