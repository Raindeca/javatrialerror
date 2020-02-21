/**
 * Pelayanan
 */
public class Pelayanan {
    private String hargaKamar, layananBersalin, penanganan, keterangan;
    private int lamaNginap, biayaObat;
    public Pelayanan(String hargaKamar, int lamaNginap,int biayaObat,String layananBersalin, String penanganan, String keterangan) {
        HargaKamar kamar = new HargaKamar();
        LayananBersalin layanan = new LayananBersalin();
        Penanganan action = new Penanganan();

        this.hargaKamar = kamar.hargaKamar(hargaKamar);
        this.lamaNginap = lamaNginap;
        this.biayaObat = biayaObat;
        this.layananBersalin = layanan.layananBersalin(layananBersalin);
        this.penanganan = action.penanganan(layananBersalin, keterangan);
    }

    public int getHargaKamar() {
        return Integer.parseInt(hargaKamar) *lamaNginap;
    }

    public int getLayananBersalin() {
        return Integer.parseInt(layananBersalin);
    }

    public int getPenanganan() {
        return Integer.parseInt(penanganan);
    }

    public int getBiayaObat() {
        return biayaObat;
    }
}