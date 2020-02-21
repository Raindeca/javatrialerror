/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        FetchData fetchdata = new FetchData();
        BioPasien[] dataPasien = fetchdata.fetchDataPasien();
        Pelayanan[] prosesLayanan = fetchdata.fetchDataPelayanan();

        Invoice invoice = new Invoice();
        invoice.invoice(dataPasien, prosesLayanan);
    }
}