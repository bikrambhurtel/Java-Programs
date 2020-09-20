//A2_Employee.java
class Employee{
	int id, age,salary;
	String name;
	Employee(){

	}
	//initializing data by constructor
	Employee(int eid,String ename, int eage, int esalary ){
		id = eid;
		name = ename;
		age = eage;
		salary = esalary;
	}
	//initializing data using member function
	void employeeRecord(int id, String name,int age, int salary){
		System.out.println("id: "+id);
		System.out.println("name: "+name);
		System.out.println("age: "+age+" years");
		System.out.println("salary: Rs."+salary);
	}
	//initializing data by reference
	void display(Employee e){
		System.out.println("id: "+e.id);
		System.out.println("name: "+e.name);
		System.out.println("age: "+e.age+" years");
		System.out.println("salary: Rs."+e.salary);
	}
}
class A2_Employee{
	public static void main(String args[]){
		Employee e1 = new Employee(100, "Prakash Thapa",25,30000);
		Employee e2 = new Employee();
		Employee e3 = new Employee(102,"Ajay Gautam",32,90000);
		System.out.println("id: "+e1.id);
		System.out.println("name: "+e1.name);
		System.out.println("age: "+e1.age+" years");
		System.out.println("salary: Rs."+e1.salary);
		System.out.println("===========================");
		e2.employeeRecord(101, "Narad Khadka",35, 85000);
		System.out.println("===========================");
		e3.display(e3);
		System.out.println("===========================");
	}
}