import java.util.Scanner;
import java.util.stream.*;

/**
 * M2GetSet
 */
public class M2GetSet {
    static Scanner input = new Scanner(System.in);

    private int[] uJajan;
    private int[] uTransport;
    private int uMasuk;
    private int totalSaldo;
    //private int temp = 0;

    public void setMasuk(int uMasuk) {
        this.uMasuk = uMasuk;
    }

    public int getMasuk() {
        return uMasuk;
    }

    public void setJajan(int[] uJajan) {
        this.uJajan = uJajan;
    }

    public int getJajan() {
        return IntStream.of(uJajan).sum();
    }

    public void setTransport(int[] uTransport) {
        this.uTransport = uTransport;
    }
    
    public int getTransport() {
        return IntStream.of(uTransport).sum();
    }

    public void setSaldo(int totalSaldo) {
        this.totalSaldo = totalSaldo;
    }

    public int getSaldo() {
        return totalSaldo;
    }


    public static void main(String[] args) {
        M2GetSet masuk = new M2GetSet();
        M2GetSet jajan = new M2GetSet();
        M2GetSet transport = new M2GetSet();
        M2GetSet saldo = new M2GetSet();

        String option = "Ya";
        String days[] = new String[7];
        int uJajan[] = new int[7];
        int uTransport[] = new int[7];
        int pengeluaran;

        days[0] = "Senin";
        days[1] = "Selasa";
        days[2] = "Rabu";
        days[3] = "Kamis";
        days[4] = "Jumat";
        days[5] = "Sabtu";
        days[6] = "Minggu";
         
         while (!option.equals("Tidak")) {
            System.out.print("Nama\t: ");
            String nama = input.nextLine();
    
            System.out.print("NPM\t: ");
            String npm = input.nextLine();
    
            System.out.print("Kelas\t: ");
            String kelas = input.nextLine();
            System.out.println("__________________________\n\n");

            System.out.print("Uang Masuk\t: Rp ");
            int uMasuk = input.nextInt();
            masuk.setMasuk(uMasuk);
            input.nextLine();     

            for (int i = 0; i < uJajan.length;i++) { 
                System.out.print("Uang jajan hari "+days[i]+"\t: Rp ");
                uJajan[i] = input.nextInt();
                jajan.setJajan(uJajan);
                input.nextLine();
            }
            
            System.out.println();

            for (int i = 0; i < uTransport.length; i++) {
                System.out.print("Uang Transport hari "+days[i]+"\t: Rp ");
                uTransport[i] = input.nextInt();
                transport.setTransport(uTransport);
                input.nextLine();
            }

            System.out.println("__________________________\n\n");
            

            pengeluaran = jajan.getJajan() + transport.getTransport();
            int sisaSaldo = masuk.getMasuk() - pengeluaran;


            
            saldo.setSaldo(sisaSaldo);
            System.out.println("Saldo\t: "+saldo.getSaldo());

            if (saldo.getSaldo() < pengeluaran/4) {
                System.out.print("Keterangan\t: HEMAT\n\n");            
            }
            else System.out.print("Keterangan\t: Boros\n\n");
            
            System.out.print("Input lagi? (Ya/Tidak): ");
            option=input.nextLine();

         }
    }
}