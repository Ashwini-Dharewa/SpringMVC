package Assignment1;
public class BufferString {

	public static void main(String[] args) {
		String st="This is StringBuffer";
		StringBuffer s=new StringBuffer(st);
		System.out.println("After addition: "+s.append(" - This is a sample program"));
		System.out.println("After insertion: "+s.insert(21, "Object"));
		
		System.out.println("Reversed String: "+s.reverse());
		StringBuffer s1=new StringBuffer(s.reverse());
		System.out.println("After replacement: "+s1.replace(14,20,"Builder"));
		
	}

}
