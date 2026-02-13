public class Circle extends Shape {

    private double radius;

    public Circle(double radius, String color){
        super(color);
        this.radius = radius;
    }

    @Override double area(){
        return Math.PI * Math.pow(radius, 2);
    }

    public @Override String toString(){
        return "The color of the circle is " + super.getColor() + "and the it area is " + area();
    }
}
