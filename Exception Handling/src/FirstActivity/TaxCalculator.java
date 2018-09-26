package FirstActivity;

public class TaxCalculator {
	
	String empName;
	boolean isIndian;
	double empSal;
	double calculateTax(String empName,boolean isIndian,double empSal)
	{
		double taxAmount=0;
		this.empName=empName;
		this.isIndian=isIndian;
		this.empSal=empSal;
		try{
			if(isIndian==false){
			throw new CountryNotValidException();
			}
			if(empName.equals("")){
			throw new EmployeeNameInvalidException();
			}
		}
			catch(CountryNotValidException e)
			{
				e.printStackTrace();
			}
			catch(EmployeeNameInvalidException e2)
			{
				e2.printStackTrace();
			}
		
		if(empSal>=100000 && isIndian==true)
			taxAmount=(empSal*8)/100;
		else if(empSal<100000 && empSal>=50000 && isIndian==true)
			taxAmount=(empSal*6)/100;
		else if(empSal<50000 && empSal>=30000 && isIndian==true)
			taxAmount=(empSal*5)/100;
		else if(empSal<30000 && empSal>=10000 && isIndian==true)
			taxAmount=(empSal*4)/100;
		else if(empSal<10000 && isIndian==true){
			try{
				throw new TaxNotEligibleException();
			}
			catch(TaxNotEligibleException e3)
			{
				e3.printStackTrace();
			}
		}
		return taxAmount;
		
		
		
			
	}
	

}
