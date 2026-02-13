public class Test {
    public static void main (String[] args){

        Animal A1 = new Monkey(4, 1, "Trump");
        Lion l = new Lion(4, 1, "Jack");

        System.out.println(A1.eat());
        System.out.println(A1.run());
        System.out.println(l.roar());
            
        }
}
