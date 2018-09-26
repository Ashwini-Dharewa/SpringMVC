public class Employee
{
    private int empId;
    private double empSalary;
    private String empName;
    
    public Employee() {
        System.out.println("In Default Constructor");
    }
    public Employee(int empId, double empSalary, String empName) {
        System.out.println("In Parameterized Constructor");
        this.empId = empId;
        this.empSalary = empSalary;
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public double getEmpSalary() {
        return empSalary;
    }
    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empSalary=" + empSalary
                + ", empName=" + empName + "]";
    }
}
