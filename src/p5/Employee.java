package p5;

public class Employee {
	
	String fname;
	String lname;
	int age;
	int salary;
	String gender;
	String dept;
	String state;
	String city;
 String check[] ;
    String comment ;
    String str="";
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCheck() {
		return str;
	}

	public void setCheck(String str) {
		this.str = str;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Employee(String fname, String lname, int age, int salary, String gender, String dept, String state,
			String city, String[] check, String comment) {
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
		this.dept = dept;
		this.state = state;
		this.city = city;
		this.check = check;
		this.comment = comment;
	}
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String ar[])
	{
		Employee e = new Employee();
		for(int i=0;i<e.check.length;i++)
		{
			e.str += e.check[i];
		}
	}

	
	
}
