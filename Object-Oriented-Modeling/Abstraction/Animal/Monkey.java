public class Monkey extends Animal {

    public Monkey(int number_of_legs, int number_of_tail, String name){
        super(number_of_legs, number_of_tail, name);
    }

    public void jump(){
        System.out.println("Jumping");
    }

    public void talk(){
        System.out.println("qui qui qui...");
    }

    public String eat(){
        return "I prefer Banana";
    }

}
