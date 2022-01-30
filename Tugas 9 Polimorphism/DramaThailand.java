/*  Nama : Phina Putri Amalia
    Kelas : Reg TI20A
    NIM : 20200040063
 */

package Polymorphism;

public class DramaThailand extends Drama {
    String negara = "Thailand";
    
    DramaThailand(String judul) {
        super(judul);
    }
    
    @Override
    void display() {
        super.display();
        System.out.println("Negara \t: " + this.negara);
    }
    
    void showoff() {
        System.out.println("Genre \t: Horor");
    }
}
