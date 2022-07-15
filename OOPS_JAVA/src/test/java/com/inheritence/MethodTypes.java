package com.inheritence;

public class MethodTypes {
public void name() {
System.out.println(200);
	}

public String names() {
	System.out.println("smarttech");
	return"smarttech";
}


public void employeesInfo(String name, int salary) {
System.out.println("Employee Name:"+ name+" /" +"Employee Salary:"+ salary);
}

public int sal() {
	int num=100;
	 System.out.println(num);
	
	return num;
}
public static void main(String[] args) {
	MethodTypes obj= new MethodTypes();

	obj.employeesInfo("tareq", 800);
	obj.employeesInfo("robin", 800);
	obj.employeesInfo("alex", 800);
	obj.sal();
	obj.name();
	obj.names();
}	
}

