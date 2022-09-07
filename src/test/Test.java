package test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Employee {
	String name;
	Date dob;
	int salary;
	
	public Employee(String name, Date dob, int salary) {
		super();
		this.name = name;
		this.dob = dob;
		this.salary = salary;
	}
	
}

public class Test {

	public static void main(String[] args) {
		Employee e1 = new Employee("Nikhil", new Date(1994, 6, 30), 40000);
		Employee e2 = new Employee("Ram", new Date(1998, 5, 30), 60000);
		Employee e3 = new Employee("Gaurav", new Date(1991, 8, 30), 80000);
		Employee e4 = new Employee("Anudeep", new Date(1993, 1, 30), 30000);
		
		Employee arr[] = new Employee[4];
		arr[0] = e1;
		arr[1] = e2;
		arr[2] = e3;
		arr[3] = e4;
		
								
		for(int i = 0; i < 3 ; i++) {
			for(int j = i+1; j < 4 ; j++) {
			if(arr[i].dob.compareTo(arr[j].dob) == 1) {
				Employee temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	
		}	
			
		for(Employee e : arr) {
			System.out.println("Name : " + e.name + "  Salary : " + e.salary);
		}
		System.out.println();
		

}
	
}
