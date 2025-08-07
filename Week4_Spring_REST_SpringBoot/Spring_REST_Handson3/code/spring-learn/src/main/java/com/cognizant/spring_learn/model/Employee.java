package com.cognizant.spring_learn.model;

public class Employee {
	private String name;
	private Skill skill;
	
	
	public Employee(String name, Skill skill) {
		this.name = name;
		this.skill = skill;
	}
	public Employee() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Skill getSkill() {
		return skill;
	}
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", skill=" + skill + "]";
	}
	
}
