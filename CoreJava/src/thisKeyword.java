class Student
{
	int rno;
	String sname;
	public Student() {
		System.out.println("Default Constrctor");
	}
	public Student(int rno,String sname) {
		this();
		System.out.println("Parameterized Constructor Called");
		this.rno=rno;
		this.sname=sname;
	}
}
public class thisKeyword {

	public static void main(String[] args) {
		Student s1=new Student(1, "Jigar");
	}
}
