public class TestVehicleMovement {
    public static void main(String[] args){
        CarMovement car = new CarMovement();
        Aearoplane aearoplane = new Aearoplane();

        car.moveX();
        car.moveY();
        System.err.println("");
        aearoplane.moveX();
        aearoplane.moveY();
        aearoplane.moveZ();
    }
}
