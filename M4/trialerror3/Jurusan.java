/**
 * Jurusan
 */
public class Jurusan {

    // String findJurusan() {
    //     StudentArray subjurusan = new StudentArray();
    //     String jurusan;

    //     if( subjurusan.getSubJurusan().equals("110") )
    //         jurusan = "SI";
    //     else if( subjurusan.getSubJurusan().equals("510") )
    //         jurusan = "TI";
    //     else if( subjurusan.getSubJurusan().equals("111") )
    //         jurusan = "MI";
    //     else if( subjurusan.getSubJurusan().equals("310") )
    //         jurusan = "SK";
    //     else if( subjurusan.getSubJurusan().equals("311") )
    //         jurusan = "TK";
    //     else
    //         jurusan = "Unknown";
        
    //         return jurusan;
    // }
    private String jurusan[] = {"SI","TI","MI","SK","TK"};
    private String target[] = {"110","510","111","310","311"};
    private String temp[];

        String[] findJurusan() {
        StudentArray subjurusan = new StudentArray();
        for (int i = 0; i < jurusan.length; i++) {
            if (target[i].equals(subjurusan.getSubJurusan())) {
               temp[i] =  jurusan[i]; 
            }
        }
        return temp;
    }

//     void setJurusan(String[] jurusan) {
//         this.jurusan = jurusan;
//     }

//     String getJurusan() {
//         return jurusan;
//     }
 }