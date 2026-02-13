public abstract class Shape {

    protected String color;
    abstract double area();
    public abstract String toString();


    public Shape(String color){
        System.out.println("Shape constructor's called ...");
        this.color = color;
    }

    public String getColor(){
        return color;
    }

}

