package Entityclass;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="New_employee")
public class Employee {
	@Id
	@Column(name="e_id")
	private int id;
	@Column(name="e_name")
	private String name;
	
	@Column(name="e_salary")
	private double salary;
	
	@CreationTimestamp
	private LocalDateTime currentDateTime;
	
	@UpdateTimestamp
	private LocalDateTime update_tDateTime;

	public Employee() {
	
	}

	public Employee(int id, String name, double salary) {
	
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", current_time=" + currentDateTime
				+ ", update_time=" + update_tDateTime + "]";
	}
	
	
	
}
