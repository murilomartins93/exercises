package entities;

public class Person {
	
    private Double height;
    private Character gender;
    
    public Person() {
    }
    
    public Person(Double height, Character gender) {
        this.height = height;
        this.gender = gender;
    }
    
    public Double getHeight() {
        return height;
    }
    
    public void setHeight(Double height) {
        this.height = height;
    }
    
    public Character getGender() {
        return gender;
    }
    
    public void setGender(Character gender) {
        this.gender = gender;
    }
}