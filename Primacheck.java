public class Primacheck {
    public static void main(String[] args) {
        
        int[] angka = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};

        for (int i : angka) {
            if (primechecker(i) == true && oddchecker(i) == true) {
                System.out.println(i + " prima & ganjil");
            } else if (primechecker(i) == true && oddchecker(i) == false) {
                System.out.println(i + " prima");
            } else if (oddchecker(i) == true) {
                System.out.println(i + " ganjil");
            } else {
                System.out.println(i + " bukan");
            }
        }

    }

    static boolean primechecker(int a) {

        if (a > 2) {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    return false;
                }
            }
        } else if (a == 2) {
            return true;
        } else if (a <= 1) {
            return false;
        }
        return true;
    }

    static boolean oddchecker(int a) {
        if (a % 2 == 0) {
            return false;
        }
        return true;
    }

}
