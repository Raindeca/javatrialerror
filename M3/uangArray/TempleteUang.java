
/**
 * TempleteUang
 */
public class TempleteUang {
    public String week[] = { "M1", "M2", "M3", "M4" };
    public String days[] = { "Senin", "Selasa", "Rabu", "Kamis", "Jumat" };

    public void templeteUang(int[][] sum, int uMasuk, String nama) {
        System.out.println();
        System.out.println("Nama Pelapor\t: " + nama);
        System.out.println("Uang Masuk\t: " + uMasuk);

        System.out.println();
        System.out.println();
        System.out.format("%50s", "DATA PENGELUARAN UANG");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------");
        System.out.format("%15s%10s%10s%10s%10s%10s%10s", "SENIN", "SELASA", "RABU", "KAMIS", "JUMAT", "TOTAL",
                "STATUS");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------");

        for (int i = 0; i < week.length; i++) {
            int total = 0;
            String st = "BOROS";
            System.out.print(week[i]) ;
            for (int j = 0; j < days.length; j++) {
                total += sum[i][j];
            }

            if (total < uMasuk / 4) {
                st = "HEMAT";
            }

            System.out.format("%13s%10s%10s%10s%10s%10s%10s", sum[i][0], sum[i][1], sum[i][2], sum[i][3], sum[i][4],
                    total, st);
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------------------");

    }
}