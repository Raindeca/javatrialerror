import java.util.Scanner;

/**
 * M3UangArray
 */
public class M3UangArray {

    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        InputUang income = new InputUang();
        TempleteUang press = new TempleteUang();
        String nama;
        int uMasuk;
        String option = "Ya";
        while (!option.equals("Tidak")) {
            System.out.print("Nama Pelapor\t: ");
            nama=in.nextLine();
            System.out.print("Uang Masuk\t: ");
            uMasuk=in.nextInt();
            in.nextLine();
    
            press.templeteUang(income.inputUang(), uMasuk, nama);
            System.out.println();
    
            System.out.print("Input lagi? (Ya/Tidak): ");
            option=in.nextLine();   
        }
    }
}