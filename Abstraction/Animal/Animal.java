
public abstract class Animal {
    protected int number_of_legs;
    protected int number_of_tails;
    protected String name;

    public Animal(int number_of_legs, int number_of_tails, String name){
        this.name = name;
        this.number_of_legs = number_of_legs;
        this.number_of_tails = number_of_tails;
    }

    public String walk(){
        return "Walking...";
    }

    public String run(){
        return "Running...";
    }

    public String eat(){
        return "Eating...";
    }
}
