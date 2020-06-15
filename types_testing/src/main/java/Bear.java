public class Bear {

    private String name;

    private int age;

    private double weight;

    private double height;

    public Bear(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public boolean readyToHibernate(){
        return this.getBMI() >= 30.00;
    }

    public double getHeight() {
        return height;
    }

    public double getBMI() {
        return (this.weight/this.height)/this.height;
    }
}
