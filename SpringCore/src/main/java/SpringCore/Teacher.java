package SpringCore;

public class Teacher {
	private String name;
	private double salary;
	
	public Teacher(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", salary=" + salary + "]";
	}
	
	
}
