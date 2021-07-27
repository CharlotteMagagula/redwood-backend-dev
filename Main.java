package com.company;

public class Main {

    public static void main(String[] args) {

	Employee emp1 = new Employee();
	    emp1.setName("Robert");
		emp1.setYearOfJoin(1994);
		emp1.setAddress("64C-WallsStreat");

	Employee emp2 = new Employee();
		emp2.setName("Sam");
		emp2.setYearOfJoin(2000);
		emp2.setAddress("68D-WallsStreat");

	Employee emp3 = new Employee();
		emp3.setName("John");
		emp3.setYearOfJoin(1994);
		emp3.setAddress("26B-WallsStreat");

		System.out.println("Name \t Year Of joining \t Address");
		System.out.println(emp1.getName() + " \t " + emp1.getYearOfJoin() + " \t " + emp1.getAddress());
		System.out.println(emp2.getName() + " \t " + emp2.getYearOfJoin() + " \t " + emp2.getAddress());
		System.out.println(emp3.getName() + " \t " + emp3.getYearOfJoin() + " \t " + emp3.getAddress());
    }
}
