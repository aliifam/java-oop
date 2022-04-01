import java.util.Scanner;

public class Krsbin {
    public static void main(String[] args) {
        
        String[] arraykrs = new String[6];

        var input = new Scanner(System.in);

        for (int i = 0; i < arraykrs.length; i++) {
            arraykrs[i] = input.nextLine();
        }

        if (arraykrs.length > 5) {
            System.out.println("Error  : KRS telah penuh");
            int num = 1;
            for (int i = 0; i < arraykrs.length - 1; i++) {
                System.out.println(num + ". " + arraykrs[i]);
                num++;
            }
        } else {
            int num = 1;

            for (String krs : arraykrs) {
                System.out.println(num + ". " + krs);
                num++;
            }
        }
    }
}
