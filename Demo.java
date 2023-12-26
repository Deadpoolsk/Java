
import java.util.ArrayList;
import java.util.Scanner;

class Employee{
	
	private int id;
	private String name;
	private String dept;
	private int salary;

	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String dept, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}
public class Demo {
	
	public static void main(String[] args) {
		
		String s = new String("Sunil");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		for (int i = 0; i < n; i++) {
			//String s = sc.next();
			String [] arr = s.split(",");
			
			int id = 1001 + i;
			String name = arr[0];
			String dept = arr[1];
			int salary = Integer.parseInt(arr[2]);
			
			Employee e = new Employee(id, name, dept, salary);
			list.add(e);
		}
		
		for (Employee empl : list) {
			System.out.println(empl.getId() + ", " + empl.getName() + ", " + empl.getDept() + ", "+ empl.getSalary());
		}
		sc.close();
	} 
}




