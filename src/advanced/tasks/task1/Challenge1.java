package advanced.tasks.task1;


public class Challenge1 {

    public static void accelerate(Car car) {
        car.accelerate();
    }

    public static void startEngine(Car car) {
        car.startEngine();
    }

    public static void brake(Car car) {
        car.brake();
    }

    public static void main(String[] args) {
        Car toyota = new Toyota(4, "Toyota");
        Car honda = new Honda(4, "Honda");
        Car mercedes = new Mercedes(8, "Mercedes");

        startEngine(toyota);
        startEngine(honda);
        startEngine(mercedes);
        System.out.println("-------------------------");
        accelerate(toyota);
        accelerate(honda);
        accelerate(mercedes);
        System.out.println("-------------------------");
        brake(toyota);
        brake(honda);
        brake(mercedes);


    }


    public static class Car {
        private int numberOfCylinders;
        private boolean engineTypeIsGas;
        private int numberOfWheels;
        private String name;

        public Car(int numberOfCylinders, String name) {
            this.numberOfCylinders = numberOfCylinders;
            this.name = name;
            this.numberOfWheels = 4;
            this.engineTypeIsGas = true;
        }

        public int getNumberOfCylinders() {
            return numberOfCylinders;
        }

        public void setNumberOfCylinders(int numberOfCylinders) {
            this.numberOfCylinders = numberOfCylinders;
        }

        public boolean isEngineTypeIsGas() {
            return engineTypeIsGas;
        }

        public void setEngineTypeIsGas(boolean engineTypeIsGas) {
            this.engineTypeIsGas = engineTypeIsGas;
        }

        public int getNumberOfWheels() {
            return numberOfWheels;
        }

        public void setNumberOfWheels(int numberOfWheels) {
            this.numberOfWheels = numberOfWheels;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void startEngine() {
            System.out.println("Car engine started");
        }

        public void accelerate() {
            System.out.println("Car is accelerating");
        }

        public void brake() {
            System.out.println("Car is braking");
        }
    }

    public static class Honda extends Car {
        public Honda(int numberOfCylinders, String name) {
            super(numberOfCylinders, name);
        }

        @Override
        public void startEngine() {
            System.out.println("Honda start engine");
        }

        @Override
        public void accelerate() {
            System.out.println("Honda is accelerating");
        }

        @Override
        public void brake() {
            System.out.println("Honda is braking");
        }
    }

    public static class Mercedes extends Car {
        public Mercedes(int numberOfCylinders, String name) {
            super(numberOfCylinders, name);
        }

        @Override
        public void startEngine() {
            System.out.println("Mercedes started engine");
        }

        @Override
        public void accelerate() {
            System.out.println("Mercedes is accelerating");
        }

        @Override
        public void brake() {
            System.out.println("Mercedes is braking");
        }
    }


    public static class Toyota extends Car {
        public Toyota(int numberOfCylinders, String name) {
            super(numberOfCylinders, name);
        }

        @Override
        public void startEngine() {
            System.out.println("Toyota engine started");
        }

        @Override
        public void accelerate() {
            System.out.println("Toyota is accelerating");
        }

        @Override
        public void brake() {
            System.out.println("Toyota is braking");
        }
    }

}