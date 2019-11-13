import java.util.Scanner;
import java.util.Formatter;

/**
 * M3Pengeluaran
 */
public class M3Pengeluaran {
    static Scanner dt = new Scanner(System.in);
    public static void main(String[] args) {
        String nama;
        int uMasuk;
        int sum[][] = new int[5][5];
        String days[] = new String[5];
        days[0] = "Senin";
        days[1] = "Selasa";
        days[2] = "Rabu";
        days[3] = "Kamis";
        days[4] = "Jumat";
        String temp[][] = new String[4][5];
        int uJajan[][] = new int[4][5];
        int uTransport[][] = new int[4][5];
        int total = 0;

        System.out.print("Nama Pelapor\t: ");
        nama=dt.nextLine();
        System.out.print("Uang Masuk\t: ");
        uMasuk=dt.nextInt();
        dt.nextLine();

        for(int x = 0; x < 4; x++) {
            for (int i = 0; i < 5; i++) {
                System.out.print("Uang jajan hari "+days[i]+"\t: Rp ");
                uJajan[x][i] = dt.nextInt();
                dt.nextLine();
                System.out.print("Uang Transport hari "+days[i]+"\t: Rp ");
                uTransport[x][i] = dt.nextInt();
                dt.nextLine();
                sum[x][i]+=uJajan[x][i]+uTransport[x][i];
                total+=sum[x][i];
    
                if (sum[x][i] < (uMasuk/4)) {
                    temp[x][i] = "HEMAT";
                }
                else temp[x][i] = "BOROS";
            }
        }
            System.out.println();
            System.out.println();
            System.out.format("%35s","DATA PENGELUARAN UANG");
            System.out.println();
            System.out.println("---------------------------------------------------------");
            System.out.format("%15s%10s%10s%10s%10s%10s%10s","SENIN","SELASA","RABU","KAMIS","JUMAT","TOTAL","STATUS");
            System.out.println();
            System.out.println("----------------------------------------------------------");


            for (int j = 0; j < 4; j++) {
                    System.out.print("M"+(j+1));
                    System.out.format("%13s%10s%10s%10s%10s%10s%10s",sum[j][0],sum[j][1],sum[j][2],sum[j][3],sum[j][4],total,temp[j][j]);
                    System.out.println();
                }

    }
}