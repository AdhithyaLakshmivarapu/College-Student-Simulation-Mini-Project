package src;
public class Person{
    //static fields
    private static final int EYES;
    private static final int EARS;
    private static final int HANDS;
    private static final int LEGS;
    //non-static fields
    private String name;
    private double height;
    private double weight;
    //static block
    static{
        EYES=2; EARS=2; HANDS=2; LEGS=2;
    }
    //constructor
    Person(String name, double height, double weight){
        this.name=name; this.height=height; this.weight=weight;
    }
    //n-sgetters
    public String getName(){
        return name;
    }
    public double getHeight(){
        return height;
    }
    public double getWeight(){
        return weight;
    }
    //static getters
    public static int getEars(){
        return EARS;
    }
    public int getEyess(){
        return EYES;
    }
    public int getHandss(){
        return HANDS;
    }
    public int getLegss(){
        return LEGS;
    }


    @Override
    public String toString(){
        return "Name: "+ name + " Height: "+ height + "Weight: "+ weight;
    }


}
