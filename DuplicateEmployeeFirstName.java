// Program to remove duplicate element from Employee object based on first name

package com.nit;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Employee {
	
	 private String firstName;
	    private String lastName;
	    private double salary;
	    private String address;

	    public Employee(String firstName, String lastName, double salary, String address) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.salary = salary;
	        this.address = address;
	    }

	    
	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }

	    @Override
	    public String toString() {
	        return "Employee{" +"firstName='" + firstName + '\'' +", lastName='" + lastName + '\'' + ", salary=" + salary +", address='" + address + '\'' +
	                '}';
	    }
	


	public static void main(String[] args) {
		
		
		 List<Employee> employee1 = new ArrayList<>();

	        
	        employee1.add(new Employee("Ashish", "Singh", 55000, " hyd "));
	        employee1.add(new Employee("Ashish", "Pratap", 76000, " hyd "));
	        employee1.add(new Employee("Shubh", "Singh", 50000, " Akb"));
	        employee1.add(new Employee("Tanmay", "Thakur", 80000, " Akb"));
	        employee1.add(new Employee("Tanmay", "Thakur2", 88000, " Amb"));

	        
	        Set<String> EncounterNames = new HashSet<>();
	        
	        List<Employee> uniqueEmployee1 = new ArrayList<>();
	        for (Employee employee : employee1) {
	        	
	            if (!EncounterNames.contains(employee.getFirstName())) {
	            	
	                EncounterNames.add(employee.getFirstName());
	                uniqueEmployee1.add(employee);
	            }
	        }

	      
	       for (Employee employee : uniqueEmployee1) {
	            System.out.println(employee);
	          
	            
	           /* employee1.forEach(employee -> System.out.println(employee));
	            */
	        }
	        
	    }
	
		// TODO Auto-generated method stub

	}


