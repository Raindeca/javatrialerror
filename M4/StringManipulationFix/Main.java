/**
 * Main
 */
public class Main {
    public static void main(String[] args) {        
      	// Record student data
      	DataInput dataset = new DataInput();
      	StudentArray[] data = dataset.fetchData();
      
        Templete templete = new Templete();
        templete.templete(data);
    }
}
