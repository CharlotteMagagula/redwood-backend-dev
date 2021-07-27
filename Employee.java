package com.company;

public class Employee {
    String name;
    int yearOfJoin;
    String address;
    float salary;

    public void setName(String name1){
        this.name = name1;
    }

    public void setAddress(String address1){
        this.address = address1;
    }

    public void setYearOfJoin(int year){
        this.yearOfJoin = year;
    }

    public void setSalary(float salary1){
        this.salary = salary1;
    }

    public String getName() {
        return name;
    }

    public int getYearOfJoin() {
        return yearOfJoin;
    }

    public String getAddress() {
        return address;
    }

    public float getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", yearOfJoin=" + yearOfJoin +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}
