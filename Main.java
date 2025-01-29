import java.awt.Color;
import java.util.*;
import java.util.List;
//using import java.util.* to contain all java.util

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World! " + args[0] + " " + args[1] + " " + args[2]);
        //declare object in generic type "< >" (means a box that contain something)
        //object name alist contain String create from class Arraylist, "<>()" mean its size is dynamic.
        List<String> aList = new ArrayList<>();
        for (int i = 0; i < args.length; i++)
            aList.add(args[i]);  //method add, adding "String[] args" to array aList
        System.out.println(aList); // before shuffle
        Collections.shuffle(aList, new Random()); // .shuffle is Class method ( Class Collections from java.util.Collections)
        System.out.println("List: " + aList);

        // HashSet no sequence sort, won't add the same member
        Set<String> hSet = new HashSet<>();
        hSet.add("OOP");
        hSet.add("GG");
        hSet.add("EZ");
        hSet.add("F");
        hSet.add("not");
        hSet.add("drop");
        hSet.add("GG");
        hSet.add("123");
        hSet.add("กา กา กา");
        System.out.println("HashSet: " + hSet);

        //TreeSet sort from number ->  uppercase character, alphabet -> lowercase and -> Thai
        //won't add the same member
        SortedSet<String> sSet = new TreeSet<>();
        sSet.add("OOP");
        sSet.add("GG");
        sSet.add("EZ");
        sSet.add("F");
        sSet.add("not");
        sSet.add("drop");
        sSet.add("GG");
        sSet.add("123");
        sSet.add("กา กา กา");
        System.out.println("TreeSet: " + sSet);

        Stack<String> stacko = new Stack<>(); // push in and pop out
        stacko.push("a"); //in stack push and add are the same
        stacko.push("b"); // Stack doesn't care if member are the same ( not like Set)
        stacko.push("b");
        stacko.push("c");
        System.out.println(stacko);
        stacko.pop(); // remove the newest member out
        System.out.println("Stack: " + stacko);

        Map<String, Color> favoriteColors = new HashMap<String, Color>();
        favoriteColors.put("BC4", Color.GRAY);
        favoriteColors.put("BA3", Color.CYAN);
        favoriteColors.put("AB2", Color.MAGENTA);
        favoriteColors.put("AA1", Color.GREEN);
        //print all key and values in the map
        Set<String> keySet = favoriteColors.keySet();
        System.out.println("HashMap: --------------------");
        for(String key:keySet){
            Color value = favoriteColors.get(key);
            System.out.println(key + " " + value);
        }
        System.out.println(" ");
        Map<String, Color> favoriteColors_tree = new TreeMap<String, Color>();
        favoriteColors_tree.put("BC4", Color.GRAY);
        favoriteColors_tree.put("BA3", Color.CYAN);
        favoriteColors_tree.put("AB2", Color.MAGENTA);
        favoriteColors_tree.put("AA1", Color.GREEN);
        //print all key and values in the map
        Set<String> keySet_2 = favoriteColors_tree.keySet();
        System.out.println("TreeMap: --------------------");
        for(String key: keySet_2){
            Color value = favoriteColors_tree.get(key);
            System.out.println(key + " " + value);
        }
    }
}