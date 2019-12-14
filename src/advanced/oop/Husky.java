package advanced.oop;

public class Husky extends Dog {
    public Husky(String name, int age, boolean isMale, int weigth) {
        super(name, age, isMale, weigth);
    }

    @Override
    public void setWeigth(double weigth) {
        super.setWeigth(weigth);
        if (weigth > 10) {
            System.out.println("Your Husky is so heavy");
        }
        else System.out.println("Your Husky on a diet");

    }
    public void setWeigth(double weigth, int age){
        super.setWeigth(weigth);
        super.setAge(age);
    }
}
