package src;
public class College extends Student {
    //static fields
    private String location;

    public String getLocation(){
        return location;
    }
    College(String name, double height, double weight, String course, int roll,String collegename ,String location){
        super(name, height, weight, course, roll, collegename);
        this.location=location;
    }
    void ConductClasses(){
        System.out.println(getName()+ " Attending "+ getCourse() + " At " + getCollegeName() + " Which Is Located In "+ getLocation()+ " Bearing Roll Number: "+getRoll());
    }
    public static void main(String[] args) {
        College c1= new College(" Aditya", 5.8, 50,"CSD",01,"St Peters Engineering College","MaisammaGuda");
        c1.ConductClasses();        
        College c2= new College(" Akhil", 5.7, 60,"CSE",02,"St Peters Engineering College","MaisammaGuda");
        c2.ConductClasses();
        College c3= new College(" Ravi", 6, 68,"ECE",32,"St Martins Engineering College","Kompally");
        c3.ConductClasses();

        
    }
}
