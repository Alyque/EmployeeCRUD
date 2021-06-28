package com.example.EmployeeCRUD.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Employee {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public long id;
    public String name;
    public int age;
    public int salary;
	public Employee() {
 
	}
	public Employee(long id, String name, int age, int salary) {
	
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

}
