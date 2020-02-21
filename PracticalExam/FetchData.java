import java.util.Scanner;
/**
 * FetchData
 */
public class FetchData {
    private String nmPasien, nmWali, address, number, blood;
    private String hargaKamar, layananBersalin, penanganan, keterangan;
    private int lamaNginap, biayaObat;

    static Scanner input = new Scanner(System.in);
    public BioPasien[] fetchDataPasien() {
        BioPasien[] biodata = new BioPasien[1];

        System.out.println("a. Biodata Pasien: ");
        System.out.print("- Nama Pasien\t\t: ");
        nmPasien = input.nextLine();
        System.out.print("- Nama Wali\t\t: ");
        nmWali = input.nextLine();
        System.out.print("- Alamat tempat tinggal\t: ");
        address = input.nextLine();
        System.out.print("- No. Telepon\t\t: ");
        number = input.nextLine();
        System.out.print("- Gol Darah [A/B/AB/O]\t: " );
        blood = input.nextLine();
        biodata[0] = new BioPasien(nmPasien, nmWali, address, number, blood);

       return biodata;
    }

    public Pelayanan[] fetchDataPelayanan() {
        
        Pelayanan[] service = new Pelayanan[1];
        
        System.out.print("b. Biaya Obat-obatan\t: ");
        biayaObat = Integer.parseInt(input.nextLine());

        System.out.println("C.Pelayanan\t: ");
        System.out.print("- Jenis Kamar\t: ");
        hargaKamar = input.nextLine();
        System.out.print("- Lama Menginap\t: ");
        lamaNginap = Integer.parseInt(input.nextLine());
        System.out.print("- Penanganan: ");
        penanganan = input.nextLine();
        if ((penanganan == "Normal" || penanganan == "normal")) {
            System.out.print("Keterangan penanganan [Dokter specialis/Bidan] : ");
            keterangan = input.nextLine();
        }
        System.out.print("Layanan Bersalin\t: ");
        layananBersalin = input.nextLine();

        service[0] = new Pelayanan(hargaKamar, lamaNginap, biayaObat, layananBersalin, penanganan, keterangan);

        return service;
    }
}