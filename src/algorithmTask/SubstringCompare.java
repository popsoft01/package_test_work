package algorithmTask;

import java.util.SortedSet;
import java.util.TreeSet;

public class SubstringCompare {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = "";
        for(int i = 0; i<s.length()-k+1; i++){
            var substring = s.substring(i, i + k);
            if(substring.compareTo(smallest)< 0){
                smallest = substring;
            }
            if(substring.compareTo(largest)> 0){
                largest = substring;
            }
        }


        return smallest + "\n" + largest;
    }

    public static String getSmallAndLargestWithSort(String s, int k){
        String smallest = "";
        String largest = "";
        SortedSet<String> set = new TreeSet<String>();
        for(int i=0; i<s.length()-k;i++){
           set.add(s.substring(i, i+k));
            smallest = set.first();
            largest = set.last();
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("welcometojava",3));

        System.out.println(getSmallAndLargestWithSort("welcometojava",3));
        }


}
