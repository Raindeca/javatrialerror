/**
 * Jurusan
 */
public class Jurusan {

    Student jurusan = new Student();

    String cetakJurusan() {
            String cJurusan;

        if (jurusan.getsubnpm().equals("110")) {
            cJurusan = "SI";
        } else if (jurusan.getsubnpm().equals("510")){
            cJurusan = "TI";
        }
        else if (jurusan.getsubnpm().equals("111")){
            cJurusan = "MI";
        }
        else if (jurusan.getsubnpm().equals("310")){
            cJurusan = "SK";
        }
        else {
            cJurusan = "TK";
        }

        return cJurusan;
    }

    
}