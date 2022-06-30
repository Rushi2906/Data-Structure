import java.util.Scanner;

class Employee{
	int employee_id;
	String name;
	String designation;
	double salary;

	public void readDetails(){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Employee id: ");
		employee_id=sc.nextInt();
		System.out.print("Enter Employee name: ");
		sc.nextLine();
		name=sc.nextLine();
		System.out.print("Enter Employee designation: ");
		designation=sc.next();
		System.out.print("Enter Employee salary: ");
		salary=sc.nextDouble();
	}

	public void printDetails(){
		System.out.println("----------Employee Deatils-----------");
		System.out.println("Employee id: "+employee_id);
		System.out.println("Employee name: "+name);
		System.out.println("Employee Designation: "+designation);
		System.out.println("Employee salary: "+salary);

	}
}
public class Employee_Detail{
	public static void main(String[] args){
		Employee e = new Employee();
		e.readDetails();
		e.printDetails();

	}
}