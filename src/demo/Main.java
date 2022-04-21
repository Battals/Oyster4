package demo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.findIndex("abracadabra", "bra"));

    }
public ArrayList<Integer> findIndex(String string, String pattern){
        ArrayList<Integer> intList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add(string);
    for (String a: stringList
         ) {
        if (a.contains(pattern)){
            intList.add(string.indexOf(pattern));
            intList.add(string.lastIndexOf(pattern));
            return intList;
        } else {
            System.out.println("The string do not contain the pattern you have given.");
        }
    }
    return intList;
}

}
