
public class EmployeeDetails
{
	private int empId;
	private String empName;
	private String empDept;
	private double empSal;
	private double empComm;
	private String empPhone;
	public EmployeeDetails(int empId, String empName, String empDept, double empSal, double empComm, String empPhone) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empSal = empSal;
		this.empComm = empComm;
		this.empPhone = empPhone;
	}
	public EmployeeDetails()
	{
		
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public double getEmpComm() {
		return empComm;
	}
	public void setEmpComm(double empComm) {
		this.empComm = empComm;
	}
	public String getEmpPhone() {
		return empPhone;
	}
	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}
	@Override
	public String toString() {
		return "\n"+"EmployeeDetails : empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", empSal="
				+ empSal + ", empComm=" + empComm + ", empPhone=" + empPhone;
	}
	
}
