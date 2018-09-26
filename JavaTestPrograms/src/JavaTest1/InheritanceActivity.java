package JavaTest1;

public class InheritanceActivity {

	public static void main(String[] args) {
		System.out.println("Manager details:");
		Manager ob1=new Manager(126534,"Peter","Chennai India",237844,65000);
		System.out.println("Id: "+ob1.employeeId+"   Name: "+ob1.employeeName+"  Address: "+ob1.employeeAddress+"  Phone: "+ob1.employeePhone);
		ob1.calculateSalary();
		ob1.calculateTransportAllowance();
		System.out.println("Trainee details:");
		
		Trainee ob2=new Trainee(29846,"Jack","Mumbai India",442085,45000);
		System.out.println("Id: "+ob2.employeeId+"   Name: "+ob2.employeeName+"  Address: "+ob2.employeeAddress+"  Phone: "+ob2.employeePhone);
		ob2.calculateSalary();
		ob2.calculateTransportAllowance();

	}

}
