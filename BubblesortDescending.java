package Latihan2;
import java.util.Arrays;
public class BubblesortDescending {
    public static void main(String[] args) {
       // deklarasi variabel
       int[] bilangan = {4, 9, 1, 20};
       
       //Menampilkan bilangan
       System.out.println("Bilangan sebelum di sorting Bubble Sort : "+Arrays.toString(bilangan));
       
       //Proses Bubble Sort
       System.out.println("\nProses Bubble Sort secara Descending:");
       for(int j = 0; j < bilangan.length; j++) {
               // Tampilkan proses iterasi
               System.out.println("Iterasi " + (j+1));
               for(int i = 0; i < bilangan.length -1; i++) {
                   if(bilangan[i] < bilangan[i+1]) {
                      //proses pertukaran bilangan
                      int temp = bilangan[i];
                      bilangan[i] = bilangan[i + 1];
                      bilangan[i + 1] = temp;
                    }
           // Menampilkan proses pertukaran tiap iterasi
           System.out.println(Arrays.toString(bilangan));
                }
       System.out.println();
        }
    // Menampilkan hasil akhir
    System.out.println("Hasil akhir setelah di sorting: "+ Arrays.toString(bilangan));
    }
}
