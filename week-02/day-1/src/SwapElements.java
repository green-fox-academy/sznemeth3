public class SwapElements {
    public static void main(String[] args) {
        // - Create an array variable named `abc`
        //   with the following content: `["first", "second", "third"]`
        // - Swap the first and the third element of `abc`

        String abc[] = {"first", "second", "third"};
        String swapper = abc[2];
        abc[2]=abc[0];
        abc[0]=swapper;
        System.out.println(abc[0] + " "  + abc[2]);
    }
}
