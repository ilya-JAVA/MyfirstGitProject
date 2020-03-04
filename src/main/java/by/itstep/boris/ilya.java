package main.java.by.itstep.boris;

public class ilya {
    public static void main(String[] args) {
        System.out.println(2);
        System.out.println();

        for (int i = 3; i <= 10000000; i += 2) {
            for (int j = 3; j <= Math.sqrt(i) + 1; j += 2) {
                if (i % j == 0) {
                    break;
                }
                if (j + 1 >= Math.sqrt(i)) {
                    System.out.println(i);
                }


            }
        }
    }
}


