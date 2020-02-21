/**
 * HargaKamar
 */
public class HargaKamar {

    public String hargaKamar(String hargaKamar) {
        switch (hargaKamar) {
        case "Kelas 1":
            return "450000";
        case "Kelas 2":
            return "250000";
        case "Kelas 3":
            return "150000";
        case "Kelas VIP":
            return "600000";
        case "Kelas VVIP":
            return "800000";
        default:
            return "0";
        }
    }

}