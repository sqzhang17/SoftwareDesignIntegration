//@author: Shiqi Zhang
//Student class
public class Student{
	String firstName;
	String lastName;
	String departmentln;
	String yearGraduation;
	UAClass[] classes;
	int[] grades;

	//method to clculate GPA
	public float calculateGPA(){
		float res = 0.0f;

		int creditSum=0;
		int gradeSum=0;
		for(int i=0; i<classes.length;i++){
			gradeSum += classes[i].getNumCredits()*grades[i];
			creditSum += classes[i].getNumCredits();
		}

		res=(float)gradeSum/creditSum;

		return res;
	}

	//setter for classes
	public void setClasses(UAClass[] cls){
		this.classes =cls;
	}

	//setter for grades
	public void setGrades(int[] g){
		this.grades=g;
	}

	//main method
	public static void main(String[] args){
		UAClass c1= new UAClass();
		c1.setNumCredits(3);
		UAClass c2= new UAClass();
		c2.setNumCredits(2);
		UAClass c3= new UAClass();
		c3.setNumCredits(4);
		UAClass c4= new UAClass();
		c4.setNumCredits(3);

		UAClass[] cArray = {c1, c2, c3, c4};

		int[] grade = {80,90,95,75};

		Student s = new Student();
		s.setClasses(cArray);
		s.setGrades(grade);

		System.out.println("The GPA of this student = "+s.calculateGPA());
	}
}

//Student class
class UAClass{
	String teacherFirstName;
	String teacherLastName;
	String semesterOffered;
	int numCredits;


	//getter for numCredits
	public int getNumCredits(){
		return this.numCredits;
	}

	//setter for numCredits
	public void setNumCredits(int crt){
		this.numCredits=crt;
	}
}