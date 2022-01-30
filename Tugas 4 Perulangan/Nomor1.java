/*  Nama : Phina Putri Amalia
    Kelas : Reg TI20A
    NIM : 20200040063
 */

import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
    String kalimat = "";
    String reversedKalimat = "";
    Scanner input = new Scanner(System.in);

    System.out.print("Masukan Kalimat : ");

    kalimat = input.nextLine();
    reversedKalimat = reverse(kalimat);

    if (kalimat.toLowerCase().equals(reversedKalimat.toLowerCase())) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Bukan Palindrome");
    }
  }

  public static String reverse(String stringObj) {
    String reverseStringObj = "";

    for (int i = stringObj.length() - 1; i >= 0; i--) {
      reverseStringObj += stringObj.substring(i, i + 1);
    }

    return reverseStringObj;
  }
}