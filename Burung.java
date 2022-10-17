
package tugas.Sesi4;


public class Burung extends Hewan{
    public void habitatAsli(){
        super.habitatAsli();
        System.out.println("Di darat ");
    }
    public static void main(String[] args) {
        Burung br = new Burung();
        
        br.habitatAsli();
    }
}
