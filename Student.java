
public class Student {
	String name;
	String subject;
	private double grade;
	private int yearInCollege;
	private int age;
	private boolean isDegree;
	private double money;
	
	Student(){
		this.grade = 4.0;
		this.yearInCollege = 1;
		this.isDegree = false;
		this.money = 0;
	}
	
	Student(String name, String subject, int age){
		this();
		if(name != null && !name.isEmpty()){
			this.name = name;
		}
		else{
			this.name = "Steve";
		}
		if (subject !=null && !subject.isEmpty()){
			this.subject = subject;
		}
		else{
			this.subject = "Math"; //'cuz i say so 
		}
		if (age>16){
			this.age = age;
		}else{
			age = 17;
		}
	}

	public double setGrade(double grade){
		if (grade>1 && grade<7){
			this.grade = grade;
		}
		return this.grade;
	}
	
	public double getGrade(){
		return grade;
	}
	
	public int getYearInCollege() {
		return yearInCollege;
	}
	
	public int setAge(int age){
		if (age>16 ){
			return this.age = age;
		}
		return 17; 
	}

	public int getAge() {
		return age;
	}
	public boolean isDegree() {
		return isDegree;
	}
	public double getMoney() {
		return money;
	}
	
	void upYear(){
		if(grade>2){ //well... 
			if (this.yearInCollege <=3 && this.yearInCollege > 0){
				this.yearInCollege++;
				System.out.println("Student " + this.name + " become " + yearInCollege + " year student in this College!");
			}
			if (this.yearInCollege == 4){
				this.isDegree = true;
				System.out.println("Student " + this.name + " has graduated this College!");
			}
		}
		else{
			System.out.println("Student " + this.name + " didn't pass his/her exams!");
			System.out.println("He/She have to repeat this year in college");
		}
	}
	
	double receiveScholarship(double min, double amount){
		if (this.grade >= min && this.age <30 && !(isDegree)){ //cuz if he/she is a graduated student he/she shouldn't get scholarship money...
			return this.money += amount;
		}
		return this.money += 0;
	}
}
