public class start {

    private static int sumaTablicy (int[] tablica) {
        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            suma += tablica[i];
        }
        return suma;
    }

    private static int sumaTablicy2 (int[][] tablica) {
        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                suma += tablica[i][j];
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        int i = 10;
        while (i<=20) {
            System.out.println(i);
            i++;
        }

        for(int j = -10; j < 40; j++) {
            if (j % 2 == 0) {
                continue;
            }
            System.out.println(j);
        }
        System.out.println("   ");

        int j = -11;
        while(j < 40) {
            j++;
            if (j % 2 == 0) {
                continue;
            }
            System.out.println(j);

        }

        int[] tab = new int[] {1, 3, 5};
        System.out.println(sumaTablicy(tab));

        int[][] tab2 = new int[3][];
        tab2[0] = new int[] {1};
        tab2[1] = new int[] {1, 2, 3};
        tab2[2] = new int[] {1, 4, 4, 4};
        System.out.println(sumaTablicy2(tab2));
    }
}
