package tugasinterface;

public class KebunBinatangMain {
    public static void main(String[] args) {
        Hewan burung = new Burung("Merpati");
        
        System.out.println("== Burung ==");
        burung.makan();
        burung.bergerak();
        burung.tidur();
        ((Burung) burung).berkicau(); 

        Hewan mamalia = new Mamalia("Kambing");
        
        System.out.println("== Mamalia ==");
        mamalia.makan();
        mamalia.bergerak();
        mamalia.tidur();
        ((Mamalia) mamalia).menyusui(); 
    }
}
