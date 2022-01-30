/*  Nama : Phina Putri Aamalia
    Kelas : Reg TI20A
    NIM : 20200040063
*/

import java.util.Scanner;

public class Nomor3b {
    public static void main(String[] args) {
        double keliling, panjang, lebar;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Isikan panjang");
        panjang = input.nextInt();
        System.out.println("Isikan lebar");
        lebar = input.nextInt();
        
        keliling = (2*panjang) + (2*lebar);
        System.out.println("Keliling persegi panjang adalah = "+ keliling);
    }
}