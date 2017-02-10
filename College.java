
public class College {
	public static void main(String[] args) {
		
		
		Student pesho = new Student("Pesho", "Math" , 18);
		Student gosho = new Student("Gosho", "IT", 20);
		Student misho = new Student();
		misho.name = "Misho";
		misho.subject = "IT";
		misho.setAge(18);
		Student sasho = new Student ("Sasho", "Math", 31);
		Student tisho = new Student("Tisho", "IT", 29);
		
		
		pesho.upYear();
		tisho.setGrade(2);
		tisho.upYear();
		pesho.setGrade(6);
		sasho.receiveScholarship(5, 99.99);
		pesho.receiveScholarship(5, 99.99);
		
		
		StudentGroup mathGroup = new StudentGroup();
		StudentGroup itGroup = new StudentGroup("IT");
		mathGroup.groupSubject = "Math";
		
		mathGroup.addStudent(pesho);
		mathGroup.addStudent(gosho);
		mathGroup.addStudent(sasho);
		itGroup.addStudent(gosho);
		itGroup.addStudent(tisho);
		
		mathGroup.bestStudent();
		
		itGroup.emptyGroup();
		
		mathGroup.printStudentsInGroup();
		
		
	}

}
