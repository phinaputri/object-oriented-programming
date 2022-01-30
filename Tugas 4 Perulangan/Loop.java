/*  Nama : Phina Putri Amalia
    Kelas : Reg TI20A
    NIM : 20200040063
*/

import java.util.Scanner;

public class Loop {
  public static void main(String[] args) {
    String kalimat = "pbo sangat menyenangkan";
    String reversedKalimat = "";

    Scanner input = new Scanner(System.in);
    System.out.print("Masukan Kalimat : ");
    kalimat = input.next();

    for (int i = kalimat.length() - 1; i >= 0; i--) {
      reversedKalimat += kalimat.substring(i, i + 1);
    }

    System.out.println(reversedKalimat);
  }
}