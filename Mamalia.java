package tugasinterface;

public class Mamalia extends Hewan {
    public Mamalia(String nama) {
        super(nama);
    }

    @Override
    public void makan() {
        System.out.println(getNama() + " sedang makan rumput.");
    }

	@Override
    public void bergerak() {
        System.out.println(getNama() + " sedang berjalan.");
    }

    public void menyusui() {
        System.out.println(getNama() + " sedang menyusui anaknya.");
    }
}
