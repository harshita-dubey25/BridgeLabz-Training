package com.linkedlist.studentmanagement;

public class LinkedListFunctions {
	
	private Student head;
	
	public void addStudentAtBeginning(int rollNumber, String name, int age, char grade) {
		Student newNode = new Student(rollNumber,name,age,grade);	
		newNode.next = head;
		head = newNode;
		System.out.println("Student added at the beginning.");
	}
	
	public void addStudentAtEnd(int rollNumber, String name, int age, char grade) {
		Student newNode = new Student(rollNumber,name,age,grade);
		
		if(head==null) {
			head= newNode;
			return;
		}
		Student temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = newNode;
		System.out.println("Student added at the end.");
	}
	
	public void addStudentAtMiddle(int position,int rollNumber, String name, int age, char grade) {
			
		if(position<=0) {
			System.out.println("Invalid Position!!!");
			return;
		}
		if(position ==1) {
			addStudentAtBeginning(rollNumber,name,age,grade);
			return;
		}
		Student newNode = new Student(rollNumber,name,age,grade);
		Student temp = head;
		
		while(position-1>1 && temp!=null) {
			temp = temp.next;
		}
		if(temp ==null) {
			System.out.println("Position out of range!!!");
		}
		newNode.next = temp.next;
		temp.next = newNode;
		System.out.println("Student added at Position:"+position);
	}
	
	public void deleteByRollNo(int rollNumber) {
		if(head==null) {
			System.out.println("List id empty!!!");
			return;
		}
		if(head.rollNumber==rollNumber) {
			head = head.next;
			System.out.println("Student record deleted.");
			return;
		}
		Student temp = head;
		while(temp.next!=null && temp.next.rollNumber!=rollNumber) {
			temp = temp.next;
		}
		if(temp.next==null) {
			System.out.println("Student record does not exist!!!");
			return;
		}
		temp.next = temp.next.next;
		System.out.println("Student record deleted.");
	}
	
	public void searchByRollNumber(int rollNumber) {
		Student temp = head;
		
		while(temp!=null) {
			if(temp.rollNumber ==rollNumber) {
				System.out.println("Record Found");
				System.out.println("Roll Number: "+temp.rollNumber);
				System.out.println("Name: "+temp.name);
				System.out.println("Age: "+temp.age);
				System.out.println("Grade: "+temp.grade);
				return;
			}
			temp=temp.next;
		}
	}
	
	public void display() {
		if(head == null) {
			System.out.println("Empty list!!!");
		}
		Student temp = head;
		while(temp!=null) {
			System.out.println("Roll Number: "+temp.rollNumber);
			System.out.println("Name: "+temp.name);
			System.out.println("Age: "+temp.age);
			System.out.println("Grade: "+temp.grade);
			System.out.println("_ _ _ _ _ _ _ _ _ _ _");
			temp = temp.next;
		}
	}
	
	public void updateGrade(int rollNumber, char grade) {
		Student temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                temp.grade = grade;
                System.out.println("Grade updated successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
	}
	
	

}
