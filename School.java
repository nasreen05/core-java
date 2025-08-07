class School {

	

	private String name;
	private int schoolNumber;
	private String schoolAddress;


	int[]  numberofClassroom={101,102,103,104,105,};
	int[] numberofClass={9,10,11,12};
	static String[] teacherName={"Neha", "Reshma","Sneha","Seuly"};

	public static String[] getTeacherNames(){
		return teacherName;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name= name;
	}
	public int getSchoolNumber(){
		return this.schoolNumber;
	}
	public void setSchoolNumber(int schoolName){
		this.schoolNumber =schoolNumber;
	}
	public String getSchoolAddress(){
		return this.schoolAddress;
	}
	public void setSchoolAddress(String schoolAddress){
    this.schoolAddress = schoolAddress;
	}
	}

	private Teachers teachers;

	public School(){
	}

	public School(String name, int schoolNumber){
		System.out.println("Initialize name ,schoolNumber");
		this.name = name; 
		this.schoolNumber = schoolNumber;
	}

	public School(String name, int schoolNumber, String schoolAddress){ 
		this(name, schoolNumber);
		System.out.println("Initialize schoolAddress");
		this.schoolAddress = schoolAddress; 
	}

	public void setteachers(Teachers teachers){
		this.teachers = teachers;
	}

	public Teachers getteachers(){
		return teachers;
	}

	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}

	public int getSchoolNumber(){
		return this.schoolNumber;
	}

	public void setSchoolNumber(int schoolNumber){
		this.schoolNumber = schoolNumber;
	}

	public String getSchoolAddress(){
		return this.schoolAddress;
	}

	public void setSchoolAddress(String schoolAddress){
		this.schoolAddress = schoolAddress;
	}
}


	