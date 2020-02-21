/**
 * Invoice
 */
public class Invoice {

    public void invoice(BioPasien[] biodata, Pelayanan[] service) {
        BioPasien bio = biodata[0];
        Pelayanan layanan = service[0];

        System.out.print("\n\n\n");
        System.out.println("Biodata Pasien\t: ");
        System.out.print("- Nama Pasien\t\t: " + bio.getNmPasien() + "\n");
        System.out.print("- Nama Wali\t\t: "+ bio.getNmWali() + "\n");
        System.out.print("- Alamat tempat tinggal\t: " + bio.getAddress()+ "\n");
        System.out.print("- No. Telepon\t\t: " + bio.getNumber()+ "\n");
        System.out.print("- Gol Darah [A/B/AB/O]\t: " + bio.getBllod()+ "\n");

        System.out.println();
        System.out.println("Pembayaran: ");
        System.out.println("----------------------------------------------------------------------------");
        System.out.format("%10s%10s%10s%10s%10s", 
            "|Biaya menginap (Rp)|", 
            "Penanganan (Rp)|", 
            "Layanan (Rp)|", 
            "Obat (Rp)|", 
            "TOTAL (Rp)|");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------");
        System.out.format("%10s%10s%10s%10s%10s", 
            layanan.getHargaKamar(),
            layanan.getPenanganan(),
            layanan.getLayananBersalin(),
            layanan.getBiayaObat(),
            (layanan.getBiayaObat()+layanan.getHargaKamar()
            +layanan.getLayananBersalin()+layanan.getPenanganan())
        );
        System.out.println("----------------------------------------------------------------------------");

    }
}