/**
 * Jurusan
 */
public class Jurusan {
    private String jurusan[] = {"SI","TI","MI","SK","TK"};
    private String target[] = {"110","510","111","310","311"};
    private String temp[];

    public String jurusan(String npm) {
        
        String find = npm.substring(0, 3);
        for (int i = 0; i < jurusan.length; i++) {
            if (target[i].equals(find)) {
                temp[i] = jurusan[i];
            }
        }    
        return temp;
    }
}