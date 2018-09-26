
public class AddressDetails {
	private int empId;
	private String state;
	private String city;
	private String pinCode;
	public AddressDetails()
	{
		
	}
	@Override
	public String toString() {
		return "AddressDetails [empId=" + empId + ", state=" + state
				+ ", city=" + city + ", pinCode=" + pinCode + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public AddressDetails(int empId, String state, String city, String pinCode) {
		super();
		this.empId = empId;
		this.state = state;
		this.city = city;
		this.pinCode = pinCode;
	}

}
