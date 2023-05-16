import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * Serialization : To write the current status of an object in to the file is called serialization.
 * DeSerialization :  To read the object from the file is called deserialization.
 * 
 * */
class Emp implements Serializable
{
	int empno;
	String ename;
	double salary;
	public Emp(int empno, String ename, double salary) {
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
	}
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", salary=" + salary + "]";
	}
}
public class Serializationdemo {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos=new FileOutputStream("ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Emp e1=new Emp(1, "Jigar", 10000);
		oos.writeObject(e1);
		oos.flush();
		oos.close();
		System.out.println("Object Written Successfully");
		
		FileInputStream fis=new FileInputStream("ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Emp e2=(Emp)ois.readObject();
		ois.close();
		System.out.println(e2);
	}
}
