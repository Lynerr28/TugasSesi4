
package tugas.Sesi4;


public class Ikan extends Hewan{
    public void habitatAsli(){
        super.habitatAsli();
        System.out.println("Di air");
    }
    public static void main(String[] args) {
        Ikan ikn = new Ikan();
        
        ikn.habitatAsli();
    }
}
