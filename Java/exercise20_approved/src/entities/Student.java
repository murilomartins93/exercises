package entities;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
    private String name;
    
    private List<Grades> grades = new ArrayList<>();
    
    public Student() {
    }
    
    public Student(String name, Grades grade1, Grades grade2) {
        this.name = name;
        addGrade(grade1);
        addGrade(grade2);
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public List<Grades> getGrades() {
        return grades;
    }
    
    public void addGrade(Grades grade) {
        grades.add(grade);
    }
    
    public void removeGrade(Grades grade) {
        grades.remove(grade);
    }
    
    public double avgGrade() {
        double sum = 0.0;
        for (Grades g : grades) {
            sum += g.getGrade();
        }
        return sum / grades.size();
    }
}