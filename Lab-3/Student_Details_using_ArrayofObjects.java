import java.util.Scanner;

class Student_Details{
	long enrollment_no;
	String name;
	int sem;
	double cpi;

	public Student_Details(long enrollment_no,String name,int sem,double cpi){
		this.enrollment_no=enrollment_no;
		this.name=name;
		this.sem=sem;
		this.cpi=cpi;
	}

	public void printDetails(){
		System.out.println("-----Details of Student-----");
		System.out.println("Enrollent_no: "+enrollment_no);
		System.out.println("name: "+name);
		System.out.println("Sem: "+sem);
		System.out.println("Cpi: "+cpi);
	}
}

public class Student_Details_using_ArrayofObjects{
	public static void main(String[] args){
		Student_Details obj[] = new Student_Details[5];
		obj[0]=new Student_Details(2101001,"rushi",2,9.45);
		obj[1]=new Student_Details(2101002,"kevin",2,8.95);
		obj[2]=new Student_Details(2101003,"nevil",2,8.45);
		obj[3]=new Student_Details(2101004,"jenil",2,9.63);
		obj[4]=new Student_Details(2101005,"kevin",2,8.45);

		for(int i=0;i<5;i++){
			System.out.println("Details of student"+(i+1));
			obj[i].printDetails();
		}
	}
}