package JavaTest2;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		KidUsers ob1=new KidUsers(10);
		ob1.registerAccount();
		KidUsers ob2=new KidUsers(18);
		ob2.registerAccount();
		KidUsers ob3=new KidUsers("Kids");
		ob3.requestBook();
		KidUsers ob4=new KidUsers("Fiction");
		ob4.requestBook();
		AdultUser ob5=new AdultUser(5);
		ob5.registerAccount();
		AdultUser ob6=new AdultUser(23);
		ob6.registerAccount();
		AdultUser ob8=new AdultUser("Kids");
		ob8.requestBook();
		AdultUser ob7=new AdultUser("Fiction");
		ob7.requestBook();

	}

}
