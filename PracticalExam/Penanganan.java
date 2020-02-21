/**
 * Penanganan
 */
public class Penanganan {

    public String penanganan(String layananBersalin , String keterangan) {
        if ((layananBersalin == "Normal" || layananBersalin == "normal")) {
            if (keterangan == "Dokter specialis") {
                return "3000000"; //harga dokter specialis
            } else {
                return "1500000"; //harga bidan
            }
        } else {
            return "8000000"; //harga dokter specialis
        }
    }
}