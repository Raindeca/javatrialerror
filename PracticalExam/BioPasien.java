/**
 * BioPasien
 */
public class BioPasien {

    private String nmPasien, nmWali, address, number, blood;

    public BioPasien(String nmPasien, String nmWali, String address, String number, String blood) {
        this.nmPasien = nmPasien;
        this.nmWali = nmWali;
        this.address = address;
        this.number = number;
        this.blood = blood;
    }

    public String getNmPasien() {
        return nmPasien;
    }

    public String getNmWali() {
        return nmWali;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    public String getBllod() {
        return blood;
    }
}