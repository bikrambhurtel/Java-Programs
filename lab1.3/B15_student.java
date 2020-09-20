// B15_student.java
class Student{
	int rollno, age;
	String name,course;
	Student(int rollno, String name, int age, String course){
		this.rollno = rollno; this.age = age;
		this.name = name; this.course = course;
	}
	void checkAge() throws AgeNotWithinRangeException {
   		if (age < 15 || age > 21) {
 			throw new AgeNotWithinRangeException("Invalid age!!");
   		}
   		else {
    	 		System.out.println("Age: valid!");
   		}
   	}
   	void checkName() throws NameNotValidException {
   		boolean digit = false;
   		if (name!= null && !name.isEmpty()) {
   			for (char c : name.toCharArray()) {
            	if (digit = Character.isDigit(c)) {
            		throw new NameNotValidException("Invalid name!!");
            	}
        	}
 		}
   		else {
  			System.out.println("Name: valid!");
   		}
	}
}
class AgeNotWithinRangeException extends Exception{
	String s;
	AgeNotWithinRangeException(String s){
		super(s);
	}
}
class NameNotValidException extends Exception{
	String s;
	NameNotValidException(String s){
		super(s);
	}
}
class B15_student{
	public static void main(String[] args) {
		Student s = new Student(112,"Ram123",25,"CSIT");
		try{
			s.checkAge();
		}
		catch(AgeNotWithinRangeException e){
			System.out.println("----------\n"+e);
		}
		try{
			s.checkName();
		}
		catch(NameNotValidException n){
			System.out.println("----------\n"+n);
		}
		System.out.println("----------\nOther Statement");
	}
}