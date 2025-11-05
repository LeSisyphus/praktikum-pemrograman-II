package soal1;

import java.util.Random;

public class Dadu {
    private int nilai;

    public Dadu() {
        lemparDadu();
    }

    public int getNilai() {
        return nilai;
    }

    public void lemparDadu() {
        Random acak = new Random();
        this.nilai = acak.nextInt(6) + 1;
    }
}
