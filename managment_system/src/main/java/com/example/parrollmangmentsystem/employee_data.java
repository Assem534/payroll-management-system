package com.example.parrollmangmentsystem;


import java.util.Date;

public class employee_data {

    private int employeeid;
    private String frist_name;
    private String last_name;
    private String phone;
    private String email;
    private double salary;
    private String department;
    private String gender;
    private String image;
    private Date data;
    public employee_data(int employeeid,String frist_name,String last_name,String phone,String gender,String image,Date data,String email,double salary,String department){
        this.employeeid=employeeid;
        this.frist_name=frist_name;
        this.last_name=last_name;
        this.phone=phone;
        this.email=email;
        this.salary=salary;
        this.department=department;
        this.gender=gender;
        this.image=image;

    }
    public int getEmployeeid() {
        return employeeid;
    }
    public String getFrist_name() {
        return frist_name;
    }

    public String getLast_name() {
        return last_name;
    }
    public String getPhone() {
        return phone;
    }
    public String getEmail() {
        return email;
    }
    public Date getData() {
        return data;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }



    public String getGender() {
        return gender;
    }



    public String getImage() {
        return image;
    }

}
