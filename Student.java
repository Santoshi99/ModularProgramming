package com.student.service;

import java.util.List;
import java.util.LinkedList;
import com.desktopallocation.service.DesktopAllocator;
import com.infy.timeallocation.service.TimeAllocator; 

public class Student {

	private String name;
	private Integer rollNumber;
	private String desktopNumber;
	private String examSlot;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getDesktopNumber() {
		return desktopNumber;
	}
	public void setDesktopNumber(String desktopNumber) {
		this.desktopNumber = desktopNumber;
	}
	public String getExamSlot() {
		return examSlot;
	}
	public void setExamSlot(String examSlot) {
		this.examSlot = examSlot;
	}
	
	private static void display(List<Student> input) {
		
		
		for(Student studDetails : input) {
			
			System.out.println("--------------------------------"+"\n"+"Student Details");
			System.out.println("Name :-" + studDetails.getName());
			System.out.println("Roll Number :-" + studDetails.getRollNumber());
			System.out.println("Desktop Number :-"+ studDetails.getDesktopNumber());
			System.out.println("Exam SlotMonitoring :-"+ studDetails.getExamSlot());
			System.out.println("----------------------------------");
		}
	}
	public static void main(String args[]) {
		
		
		Student s1 = new Student();
		s1.setName("Mathew");
		s1.setRollNumber(15);
		DesktopAllocator da = new DesktopAllocator();
		s1.setDesktopNumber(da.allocateDesktopNumber(s1.getRollNumber()));
		
		TimeAllocator ta = new TimeAllocator();
		s1.setExamSlot(ta.allocaeTimeSlot(s1.getDesktopNumber()));
		
		Student s2 = new Student();
		s2.setName("Thomas");
		s2.setRollNumber(42);
		DesktopAllocator da1 = new DesktopAllocator();
		s2.setDesktopNumber(da1.allocateDesktopNumber(s2.getRollNumber()));
		//System.out.println(s2.getDesktopNumber());
		TimeAllocator ta1 = new TimeAllocator();
		s2.setExamSlot(ta1.allocaeTimeSlot(s2.getDesktopNumber()));
		
		Student s3 = new Student();
		s3.setName("Sherry");
		s3.setRollNumber(10);
		DesktopAllocator da2 = new DesktopAllocator();
		s3.setDesktopNumber(da2.allocateDesktopNumber(s3.getRollNumber()));
		TimeAllocator ta2 = new TimeAllocator();
		s3.setExamSlot(ta2.allocaeTimeSlot(s3.getDesktopNumber()));
		
		List<Student> list = new LinkedList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		display(list);
	}
	
}
