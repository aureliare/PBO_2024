package tugasinterface;

import tugasinterface.Perilaku.perilaku;

public abstract class Hewan implements perilaku {
    private String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract void makan();
    public abstract  void bergerak();

    public void tidur() {
        System.out.println(nama + " sedang tidur.");
    }
}
