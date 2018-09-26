package Assignment4;

public class ParkedCarOwnerDetails {
	String ownername;
	String carModel;
	int carNo;
	long mobileNo;
	String address;
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public int getCarNo() {
		return carNo;
	}
	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public ParkedCarOwnerDetails(String n,String m,int no,long num,String a)
	{
		ownername=n;
		carModel=m;
		carNo=no;
		mobileNo=num;
		address=a;
	}
	public String toString()
	{
		return ownername+" : "+carModel+" , "+carNo+" , "+mobileNo+" , "+address;
	}

}
