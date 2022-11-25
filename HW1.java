import java.util.Random;
import java.lang.Math;

public class HW1 {
    public static void main(String[] args) {
        int i = new Random().nextInt(-1000,1000); //1
        int n = 2;
        while (n * 2 <= Math.abs(i)){
            n = n * 2;
        }
        n = n * (i / Math.abs(i)); //2
        
        String m1_str = Integer.toString(n);

        for (int j = n + Math.abs(n); j < Short.MAX_VALUE; j+=Math.abs(n)) {
            m1_str += "," + Integer.toString(j);
        }
        String[] m1_arr = m1_str.split(",");

        int[] m1 = new int[m1_arr.length];
        
        for (int j = 0; j < m1.length; j++) {
            m1[j] = Integer.parseInt(m1_arr[j]); //3
        }


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
        
        System.out.println();
        System.out.println(i);
        System.out.println(n);
        for (int j : m1) {
            System.out.print(j+" ");
        }
        System.out.println();
        for (int j : m2) {
            System.out.print(j+" ");
        }



    }
}
