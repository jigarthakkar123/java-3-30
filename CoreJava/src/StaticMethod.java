public class StaticMethod {

	static int a=10;
	static int b;
	public StaticMethod() {
		System.out.println("Hello");
	}
	static void meth(int x)
	{
		System.out.println("X : "+x);
		System.out.println("A : "+a);
		System.out.println("B : "+b);
	}
	{
		System.out.println("Block 1");
	}
	static
	{
		System.out.println("Static Block Initialized");
		b=a*4;
	}
	
	{
		System.out.println("Block 2");
	}
	public static void main(String[] args) {
		StaticMethod s=new StaticMethod();
		meth(12);
	}
}
