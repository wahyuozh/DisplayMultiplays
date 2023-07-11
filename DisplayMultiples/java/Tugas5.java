/*NAMA : WAHYU OZORAH MANURUNG
NPM: G1A022060
KELAS B2
*/
package DisplayMultiples.java; // //PACKAGE

import java.util.Scanner; //memanggil impor package yang membaca masukan pengguna
public class Tugas5 {

    public static void main(String[] args) {
    Scanner input= new Scanner (System.in);//membca teks yang dimasukan pengguna
    System.out.print("choose a number: "); // user memasukan angka bebas berapapun
    int bilangan = input.nextInt();  // //menyimpan masukan pengguna ke tipe data yang mana integer

for (int i=1; i<=12; i++) { //pengulangan yang mana inisialisasi dimulai dari 1 dan akan berakhir pada baris ke 12 dengan pengulangan increment
    int hasil = bilangan * i; //rumus yang dibuat untuk membuat hasil perkalian ini
System.out.print(bilangan + " x " + i + " = "+hasil + "\n"); // ini untuk membuat line seperti gambar pada soal 
    }
    }
}



        
        
            
          
    

