import java.util.*;
public class Matchmaking {
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }
    public static ArrayList<String> makingMatches(ArrayList<String> inputGirls, ArrayList<String> inputBoys) {
        ArrayList<String> outputList = new ArrayList<>();
        for (int i = 0; i < inputGirls.size(); i++) {
            outputList.add(i+(i*1),inputGirls.get(i));
            outputList.add(i+(i*1)+1,inputBoys.get(i));

        }
        return outputList;
    }
}
