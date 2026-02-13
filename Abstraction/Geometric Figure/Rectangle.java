public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(String color, double length, double width){

        super(color);
        this.length = length;
        this.width = width;
    }
    
    @Override double area(){
        return length * width;
    }

    @Override public String toString(){
        return "The color of the rectangle is " + super.getColor() + "and it area is " + area();
    }

}


