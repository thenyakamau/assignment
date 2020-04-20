
package com.mycompany.assignment;

public class Faculty {
    
    String degree;
    String position;
    String speciality;

    public Faculty(String degree, String position, String speciality) {
        this.setDegree(degree);
        this.setPosition(position);
        this.setSpeciality(speciality);
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    
    
    
}
