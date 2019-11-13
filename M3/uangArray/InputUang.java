import java.util.Scanner;

/**
 * InputUang
 */
public class InputUang {
    public static Scanner in = new Scanner(System.in);
    public String week[] = { "M1", "M2", "M3", "M4" };
    public String days[] = { "Senin", "Selasa", "Rabu", "Kamis", "Jumat" };
    private int sum[][] = new int[week.length][days.length];

    public int[][] inputUang() {
        for (int i = 0; i < week.length; i++) {
            System.out.println();
            System.out.println("Fase ke-" + week[i]);
            for (int j = 0; j < days.length; j++) {
                System.out.println();
                System.out.println("Hari " + days[j]);
                System.out.println();

                int uJajan = 0;
                int uTransport = 0;

                System.out.print("Uang jajan\t: Rp ");
                uJajan = in.nextInt();
                in.nextLine();

                System.out.print("Uang Transport\t: Rp ");
                uTransport = in.nextInt();
                in.nextLine();

                sum[i][j] = uJajan + uTransport;
            }

        }
        return sum;
    }
}