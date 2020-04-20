package com.mycompany.assignment;

public class Staff {
    
    int administrative_position;
    double extra_bonus;
    private MainInterface mainInterface;

    public Staff(int administrative_postion, double extra_bonus) {
        this.setAdministrative_position(administrative_position);
        this.setExtra_bonus(extra_bonus);
    }

    public int getAdministrative_position() {
        return administrative_position;
    }

    public void setAdministrative_position(int administrative_position) {
        this.administrative_position = administrative_position;
    }

    public double getExtra_bonus() {
        return extra_bonus;
    }

    public void setExtra_bonus(double extra_bonus) {
        this.extra_bonus = extra_bonus;
    }
    
    public void calculateSalary() {
        int salary;
        if(this.administrative_position<=2){
            salary = 20000;
           
        }else if(this.administrative_position <= 5){
            salary = 30000;
        } else if(this.administrative_position <= 7 ) {
            salary = 50000;
        }else {
            salary = 70000;
        }
        
        double total = calculateTotal(salary, this.extra_bonus);
        System.out.print(total);
    }

   
    
    public void calculateVacation(){
        int vacation;
        if(this.administrative_position<=2){
            vacation = 20;
            
        }else if(this.administrative_position <= 5){
            vacation = 30;
        } else if(this.administrative_position <= 7 ) {
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
