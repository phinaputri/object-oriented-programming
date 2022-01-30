/*  Nama : Phina Putri Amalia
    Kelas : Reg TI20A
    NIM : 20200040063
 */

package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Drama drama1 = new Drama ("Drama Indonesia, Drama Korea, dan Drama Thailand");
        drama1.display();
        
        
        //Polymorphic
        DramaIndonesia drama2 = new DramaIndonesia("Love Knots");
        drama2.display();
        drama2.showoff();
        
        DramaKorea drama3 = new DramaKorea("Bad and Crazy");
        drama3.display();
        drama3.showoff();
        
        DramaThailand drama4 = new DramaThailand("Home School");
        drama4.display();
        drama4.showoff();
        
        //Array list
        Drama[] kumpulanDrama = new Drama [4];
        kumpulanDrama[0] = drama1;
        kumpulanDrama[1] = drama2;
        kumpulanDrama[2] = drama3;
        kumpulanDrama[3] = drama4;
        
        kumpulanDrama[0].display();
        kumpulanDrama[1].display();
        kumpulanDrama[2].display();
        kumpulanDrama[3].display();
    }
}
