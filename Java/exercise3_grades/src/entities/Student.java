package entities;

public class Student {
	
	public String name;
	public double grade1, grade2, grade3;
	
	public double finalGrade() {
		return grade1 + grade2 + grade3;		
	}
	
	public String approval() {
		if(finalGrade() >= 60) {
			return "PASS";
		} else {
			double miss = 60 - finalGrade();
			return "FAILED\nMISSING " + String.format("%.2f", miss) + " POINTS";	
		}
	}
}
