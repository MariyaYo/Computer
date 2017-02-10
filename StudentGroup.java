public class StudentGroup {
	String groupSubject;
	Student [] students;
	int freePlaces;
	
	
	StudentGroup(){
		this.students = new Student[5];
		this.freePlaces = 5;
	}
	
	StudentGroup(String subject){
		this();
		if(subject != null && !subject.isEmpty()){
			this.groupSubject = subject;
		}
	}
	
	
	void addStudent(Student a){
		if(freePlaces > 0 && a.subject.equals(groupSubject)){		
			freePlaces--;
			for(int i = 0; i<this.students.length; i++){
				if(this.students[i] == null){
					this.students[i] = a;
					break;
				}
			}
		}
	}
	
	void emptyGroup(){
		this.freePlaces = 5;
		for(int i = 0; i<this.students.length; i++){
			this.students[i]=null;
		}
	}
	
	void bestStudent(){
		String [] bestStudent = new String [5]; 
		//if there are more then 1 student with the best grade
			bestStudent[0] = this.students[0].name;
			for(int i = 1; i<this.students.length-1; i++){
				if(this.students[i] != null){
					//check if this space is empty cuz of NullPointerException shit....
					if(this.students[i-1].getGrade() == this.students[i].getGrade()){
						//if all grades are equal to the first student grade and that's the best grade in this group
						int j = 1;
						bestStudent[j] = this.students[i].name;
						j++;
					}
					if(this.students[i-1].getGrade() < this.students[i].getGrade()){
						//if not erase all student and start from first cell
						for(int j = 0; j<bestStudent.length; j++){
							bestStudent[j] = null;
						}
						bestStudent[0] = this.students[i].name;
					}	
				}
			}
			System.out.print("The best student/s: ");
			for(int i =0; i<bestStudent.length; i++){
				if(bestStudent[i]!=null){
						System.out.print(bestStudent[i] + " ");
				}
			}
			System.out.println();
	}
	
	void printStudentsInGroup(){
		if (!this.groupSubject.equals(null)){
			System.out.println("Subject for this group: " + this.groupSubject);
			for(int i = 0; i<this.students.length; i++){
				if(this.students[i] != null){
					System.out.println("Student Number: " + (i+1));
					System.out.println("Name: " + this.students[i].name);
					System.out.println("Grade: " + this.students[i].getGrade());
					System.out.println("Age: " + this.students[i].getAge());
					System.out.println("Year in College: " + this.students[i].getYearInCollege());
					System.out.println("Income: " + this.students[i].getMoney());
					if(this.students[i].isDegree()){
						System.out.println("He/She have a degree.");
						}
						else{
							System.out.println("He/She doesn't have a degree.");
						}
					}
				}
			}
		else{
			System.out.println("This goup is empty!");
		}
	}
}
