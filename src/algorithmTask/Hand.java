package algorithmTask;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Hand {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        if (N >= 2 && N <= 20) {
            for (int i = 1; i < 10; i++) {
                int result = N * i;
                System.out.println(N + " * " + i + " = " + result);
            }

        }

        bufferedReader.close();
    }

    //        import java.util.*;
//import java.io.*;
//
//    class Solution{
//        public static void main(String []argh){
    public static void series() {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int result = 0;

            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    result = result + (a + (int) Math.pow(2, j) * b);
                } else {
                    result = result + ((int) Math.pow(2, j) * b);
                }
                System.out.print(result + " ");
            }
            System.out.println();
        }
        in.close();
    }


}
