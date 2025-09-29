package src;
public class Student extends Person{
    private String collegeName;
    
    private String course;
    private int roll;
    Student(String name, double height, double weight, String course, int roll,String collegename){
        super(name, height, weight);
        this.course=course; this.roll=roll;  
        this.collegeName=collegename;     
    }
    //static field getter
    public String getCollegeName(){ return collegeName;}
    //n-s fields
    public String getCourse(){ return course; }
    public int getRoll(){return roll; }

    @Override
    public String toString(){
        return super.toString()+ " College Name: "+ collegeName + "Course Name: "+course + "Roll: "+ roll;
    }
    void study(){
        System.out.println( getName() + "is Studying");
    }
    void write(){
        System.out.println(getName()+ "is Writing");
    }

}
