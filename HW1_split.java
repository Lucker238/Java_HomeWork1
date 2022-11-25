import java.util.Random;
import java.lang.Math;

public class HW1_split {
    public static void main(String[] args) {
        int i = findRandom();
        int n = findOlderByte(i);
        int[] m1 = findMultiple(n);
        int[] m2 = findNoMultiple(i, n);

        System.out.println(i);
        System.out.println(n);
        showArray(m1);
        showArray(m2);

    }
    
    public static int findRandom(){
        return new Random().nextInt(-1000,1000);
    }

    public static int findOlderByte(int input){
        int n = 2;
        while (n * 2 <= Math.abs(input)){
            n = n * 2;
        }
        n = n * (input / Math.abs(input));
        return n;
    }

    public static int[] findMultiple(int input){
        String m1_str = Integer.toString(input);

        for (int j = input + Math.abs(input); j < Short.MAX_VALUE; j+=Math.abs(input)) {
            m1_str += "," + Integer.toString(j);
        }
        String[] m1_arr = m1_str.split(",");

        int[] m1 = new int[m1_arr.length];
        
        for (int j = 0; j < m1.length; j++) {
            m1[j] = Integer.parseInt(m1_arr[j]);
        }
        return m1;
    }

    public static int[] findNoMultiple(int i, int n) {
        String m2_str = "";
        if (n == i){
            m2_str += Integer.toString(i-1);
        }
        else{
            m2_str += Integer.toString(i);
        }

        for (int j = i; j > Short.MIN_VALUE; j--) {
            if (j % n == 0){
                continue;
            }
            m2_str += "," + Integer.toString(j);
        }

        String[] m2_arr = m2_str.split(",");

        int[] m2 = new int[m2_arr.length];

        for (int j = 0; j < m2.length; j++) {
            m2[j] = Integer.parseInt(m2_arr[j]); //4
        }
        return m2;
    }

    public static void showArray(int[] array){
        for (int j : array) {
            System.out.print(j+" ");
        }
        System.out.println();
    }

}
