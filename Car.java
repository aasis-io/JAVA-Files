class Car {
    String name = "Urus";
    String model = "2023HY";
    int price = 10000000;

    public void start() {
        System.out.println(name + "start");
    }

    public void stop() {
        System.out.println("stop");
    }

    public void turnLeft() {
        System.out.println("turning left....");
    }

    public static void main(String[] args) {
        Car greenCar = new Car(); // Creates an object of the car class
        Car redCar = new Car();
        Car orangeCar = new Car();
        greenCar.start();
        redCar.start();
        orangeCar.start();
    }
}
