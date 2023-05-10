import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // прочитать символ переноса строки
        ArrayList<ArrayList<Integer>> finalMatrix = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] tokens = input.split(" "); // разбиваем строку на подстроки
            ArrayList<Integer> row = new ArrayList<Integer>();
            if (Integer.parseInt(tokens[0]) > 0)  {
                for (int j = 1; j <= Integer.parseInt(tokens[0]); j++) {
                    row.add(Integer.parseInt(tokens[j]));
                    //System.out.print(tokens[j]);
                }
            }
            finalMatrix.add(row);
        }  // for (int i = 0; i < n; i++) {
        //System.out.println(finalMatrix);
        ArrayList<ArrayList<Integer>> readMatrix = new ArrayList<ArrayList<Integer>>();
        n = scanner.nextInt();
        scanner.nextLine(); // прочитать символ переноса строки
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] tokens = input.split(" "); // разбиваем строку на подстроки
            ArrayList<Integer> row2 = new ArrayList<Integer>();
            for (int j = 0; j < 2; j++) {
                row2.add(Integer.parseInt(tokens[j]));
            }
            readMatrix.add(row2);
        }  // for (int i = 0; i < n; i++) {
        //System.out.println(readMatrix);
        scanner.close(); // закрываем Scanner после использования
        for (int i = 0; i < n; i++) {
            int m1 = readMatrix.get(i).get(0);
            int m2 = readMatrix.get(i).get(1);
            //int k1 = finalMatrix.get(i).size(); //.get(0);//.size();
            int k1 = finalMatrix.get(m1 - 1).size();
            if (k1 > 0) {
                int n1 = finalMatrix.get(m1 - 1).size();
                if (m2 > n1) {
                    System.out.println("ERROR!");
                } else {
                    System.out.println(finalMatrix.get(m1 - 1).get(m2 - 1));
                }
            } else {
                System.out.println("ERROR!");
            }
        }  // for (int i = 0; i < n; i++) {
    }   // public static void main(String[] args) {
}
