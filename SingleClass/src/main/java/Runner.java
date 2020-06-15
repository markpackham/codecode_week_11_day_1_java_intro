public class Runner {
    public static void main(String[] args) {
//        Bear bear = new Bear("Balu");
//        bear.setName("Baloo");
//        String name = bear.getName();
//        System.out.println(name);
        Planet planet = new Planet("Mars", 908973);
        System.out.println(planet.getName() + " is " + planet.getSize());
        String output = String.format("%s is %d .", planet.getName(), planet.getSize());
        System.out.println(output);
        System.out.println(planet.explode());
    }
}
