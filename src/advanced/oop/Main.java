package advanced.oop;

public class Main {
    public static void main(String[] args) {
        //create a Dog object and check if anything works fine
        Dog somaDog = new Dog("Shepparf", 3, true, 20);


        System.out.println("getter for age: " + somaDog.getAge());
        somaDog.setAge(-5);
        somaDog.setAge(7);
        System.out.println("new age for dog is " + somaDog.getAge());


        Husky husky = new Husky("Husky", 3, false,10);

        //method binding
        husky.setWeigth(8);
        husky.setWeigth(5,7);


        SomeDog someDog = new SomeDog("Dog");
        Cat cat = new Cat("Cat");

        Animal[] array = new Animal[2];
        array[0] = someDog;
        array[1] = cat;


        for (Animal x: array) {
            System.out.print(x.getName() + " say: " );
            x.yieldVoice();
        }



    }
}
