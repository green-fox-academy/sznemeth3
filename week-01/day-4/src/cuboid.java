public class cuboid {
    public static void main(String[] args) {
        double a = 2.4;
        double b = 3.4;
        double c = 4.4;
        double surface = 2 * ((a*b)+(a*c) + (c*b));
        double volume = a * b * c;
        System.out.println("Surface area: "+surface);
        System.out.println("Volume: "+volume);


    }

}
