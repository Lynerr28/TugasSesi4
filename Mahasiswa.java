
package tugas.Sesi4;


public class Mahasiswa {  
//instance variables of the class  
int nilai;  
String nama;  
  Mahasiswa(){
      System.out.println("this a default constructor");
  }  
  Mahasiswa(int i, String n){
      nilai = i;
      nama = n;
  }
  public static void main(String[] args) {
      Mahasiswa m = new Mahasiswa();
      System.out.println("\nDefault Constructor values: \n");
      System.out.println("NIM Mahasiswa : "+m.nilai + "\nNama Mahasiswa : "+m.nama);
      System.out.println("\nParameterized Constructor values: \n");
      Mahasiswa mahasiswa = new Mahasiswa(90, "Feby Alfaraby");
      System.out.println("Nilai Mahasiswa : "+mahasiswa.nilai + "\nNama Mahasiswa : "+mahasiswa.nama);
  }  
}  
