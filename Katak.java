
package tugas.Sesi4;


public class Katak extends Hewan{
    public void habitatAsli(){
        super.habitatAsli();
        System.out.println("Di darat dan di air");
    }
    public static void main(String[] args) {
        Katak ktk = new Katak();
        
        ktk.habitatAsli();
    }
}
