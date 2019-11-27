/**
 * Templete
 */
public class Templete {

    public void templete(StudentArray[] studentArray) {
        System.out.println();
        System.out.println();
        System.out.format("%35s", "DATA PESERTA");
        System.out.println();
        System.out.format("%50s", "PELATIHAN PEMROGRAMAN JAVA");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------");
        System.out.format("%15s%25s%10s%10s", "NPM", "Nama Lengkap", "Jurusan", "Angkatan");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------");

        for (int index = 0; index < studentArray.length; index++) {
          	StudentArray student = studentArray[index];
          
            System.out.format(
              "%15s%25s%10s%10s",
              student.getnpm(),
              student.getfullname(),
              student.getjurusan(),
              student.getangkatan()
            );
            System.out.println();
        }
    }
}