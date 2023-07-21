public class Pig extends Consume implements Animals, Mammals {
    String i = super.i;

    public Pig() {

        System.out.println("Pig created!");
    }

    public Pig(String name) {
        this();
        this.name = name;
    }

    String name;

    public void sleep() {
        System.out.println("zzzz....");
    }

    public void sleep(int one) {
        System.out.println("zzz...");
    }

    public void sleep(int one, int two) {
        System.out.println("zzz...");
    }


    @Override
    public void eat() {
        System.out.println("nomnom....");
    }

    @Override
    public void mate() {
        System.out.println("oh yeah....");
    }

    @Override
    public void respire() {

    }
}
