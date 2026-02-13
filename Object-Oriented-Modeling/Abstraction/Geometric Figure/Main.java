
public class Main {
    public static void main(String[] args) {
        
        Shape s1 = new Circle(3.7, "blue");
        Shape s2 = new Rectangle("Vert", 23, 32);
        
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
