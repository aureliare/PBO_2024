package tugasinterface;

public class Burung extends Hewan {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void makan() {
        System.out.println(getNama() + " sedang makan biji-bijian.");
    }

    @Override
    public void bergerak() {
        System.out.println(getNama() + " sedang terbang.");
    }

    public void berkicau() {
        System.out.println(getNama() + " sedang berkicau.");
    }
}
