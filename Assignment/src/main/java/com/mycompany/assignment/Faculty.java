
package com.mycompany.assignment;

public class Faculty {
    
    int degree;
    int position;
    double extra_bonus;

    public Faculty(int degree, int position, double speciality) {
        this.setDegree(degree);
        this.setPosition(position);
        this.setSpeciality(speciality);
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public double getSpeciality() {
        return extra_bonus;
    }

    public void setSpeciality(double speciality) {
        this.extra_bonus = speciality;
    }
     
    public void calculateSalary() {
        int salary;
        if(this.position<=2){
            salary = 20000;
           
        }else if(this.position <= 5){
            salary = 30000;
        } else if(this.position <= 7 ) {
            salary = 50000;
        }else {
            salary = 70000;
        }
        
        double total = calculateTotal(salary, this.extra_bonus);
        System.out.print(total);
    }

   
    
    public void calculateVacation(){
        int vacation;
        if(this.position<=2){
            vacation = 20;
            
        }else if(this.position <= 5){
            vacation = 30;
        } else if(this.position <= 7 ) {
            vacation = 50;
        }else {
            vacation = 70;
        }
        
        double total = calculateTotal(vacation, this.extra_bonus);
         System.out.print(total);
    }
    
     private double calculateTotal(int salary, double extra_bonus) {
        double bonusTotal = (salary * extra_bonus)/100;
        return salary+bonusTotal;
    }
    
    
}
