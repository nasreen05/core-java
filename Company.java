class Company{
private String name;

	private int companyNum;
	private String companyAddress;

	int[]  employeeId={101,102,103,104,105,};
	int[] NumOfemployee={9,10,11,12};
	static String[] employeeName={"neha", "reshma","sneha","seuly"};

	public static String[] getEmployeeNames(){
		return employeeName;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name= name;
	}
	public int getCompanyNum(){
		return this.companyNum;
	}
	public void setCompanyNum(int schoolName){
		this.companyNum =companyNum;
	}
	public String getCompanyAddress(){
		return this.companyAddress;
	}
	public void setCompanyAddress(String companyAddress){
    this.companyAddress = companyAddress;
	}
	}
	
	

private long id;
private String city;
private int numberOfEmployee;
// private String ceoname;
//private String ceocity;
//private float ceosalary;


private Ceo ceo;


public Company(){

}
//construtor overloading -- multiple constructor with same name differ in length of parameter , or datatype


//Constructor Chaining- one constructor calling another constructor using this() statement

public Company(String name, long id){
System.out.println("Initialize name , id");
this.name=name;
this.id=id;
}
public Company(String name, long id , String city){
	this(name, id);
	System.out.println("Initialize city");
	this.city=city;
}
public Company(String name, long id, String city, int numberOfEmployee){
	this(name,id,city);
	System.out.println("Initialize employees");
	this.numberOfEmployee = numberOfEmployee;
}
public  void setceo(Ceo ceo){
	this.ceo=ceo;
}
public Ceo getCeo(){
	return ceo;
}

public String getName(){
	return  name;
}
public String getCity(){
	return city;
}
public long  getId(){
	return id;
}

public int getNumberOfEmployee(){
	return numberOfEmployee;
}



}


