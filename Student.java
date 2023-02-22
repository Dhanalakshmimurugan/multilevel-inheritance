package org.student;

import org.department.Department;

public class Student extends Department {
 public void StudentName(String Name) {
	 System.out.println("THE STUDENT NAME IS : "+Name);
	 }
 public void studentDept(String Dept) {
	System.out.println("THE STUDENT DEPARTMENT IS: "+Dept); 
 }
 public void studentId(int Id) {
	 System.out.println("THE STUDENT ID IS : " +Id);
	 
 }
 public static void main(String[] args) {
	Student info=new Student();
	info.collegeName("ABC college");
	info.collegeRank(140);
	info.collegeCode(1407);
	info.deptName("CSE");
	info.StudentName("Dhana Lakshmi.M"); 
	info.studentDept("B.E.Computer Science");
	info.studentId(1402);
}

 
}
