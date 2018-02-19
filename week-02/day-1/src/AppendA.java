public class AppendA {
    public static void main(String[] args) {
        // - Create an array variable named `nimals`
        //   with the following content: `["kuty", "macsk", "cic"]`
        // - Add all elements an `"a"` at the end
        String nimnals [] = {"kuty", "macsk", "cic"};
        for (int i = 0; i <nimnals.length ; i++) {
            nimnals[i]  = nimnals[i] + "a";
            System.out.println(nimnals[i]);
        }

    }
}
