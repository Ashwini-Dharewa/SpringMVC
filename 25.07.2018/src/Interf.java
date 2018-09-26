@FunctionalInterface
public interface Interf {
	public void add(int a,int b);
	default void m1()
	{
		System.out.println("Default");
	}
	static void m2()
	{
		System.out.println("Static");
	}
}
