package dxc;

class Teacher
{
	private String teacherName;
	private String subject;
	private double salary;
	
	public Teacher(String teacherName, String subject, double salary) {
		super();
		this.teacherName = teacherName;
		this.subject = subject;
		this.salary = salary;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}

public class Array_Assesment {

	public static void main(String[] args) {
		
		Teacher t1=new Teacher("Alex","Java Fundamentals",1200L);
		Teacher t2=new Teacher("John","RDBMS",800L);
		Teacher t3=new Teacher("Sam","Java Networking",900L);
		Teacher t4=new Teacher("Maria","Python",900L);
		
		Teacher[] t= {t1,t2,t3,t4};
		for(int j=0;j<t.length;j++)
		{
			System.out.println("Name : "+t[j].getTeacherName()+", Subject : "+t[j].getSubject()+", Salary : "+t[j].getSalary());
		}
		
	}

}