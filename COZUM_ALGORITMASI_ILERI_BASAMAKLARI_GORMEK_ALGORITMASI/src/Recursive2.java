

import java.util.Random;

public class Recursive2 {

    public int trial(int derinlik) {

        int gecitSayisi = 0;
        int tekYonSayisi = 0;
        boolean sonNoktaBelirlendi = false;

        yazdir(derinlik, "-->   Derinlik : " + derinlik);

        for (int i = 0; i < 8; i++) {
            int result = getRandomNumber();
            yazdir(derinlik, "result : " + result + " i : " + i);
            if (result % 20 == 1) {
                yazdir(derinlik, "TRIAL GIRILECEK  i :  " + i);
                tekYonSayisi++;
                if (tekYonSayisi > 1 && sonNoktaBelirlendi == true) {
                    return -1;
                }
                trial(++derinlik);
                --derinlik;
                yazdir(derinlik, "TRIALDEN CIKILDI  i :  " + i);
            } else if (tekYonSayisi > 2) {
                System.out.println();
                yazdir(derinlik, "tekYonSayisi : " + tekYonSayisi);
                yazdir(derinlik, "Birden fazla tek yon var fonksiyon sonlandirildi");
                return -1;
            } else {

                gecitSayisi++;

            }
        }
        yazdir(derinlik, " <Derinlik : " + derinlik + "> Gecit sayisi : " + gecitSayisi);
        yazdir(derinlik, "tekYonSayisi : " + tekYonSayisi);
        return gecitSayisi;

    }

    public boolean stepBack(int number) {
        if (number > 2) {
            return true;
        }
        return false;
    }

    public int getRandomNumber() {
        Random random = new Random();
        int sayi = random.nextInt(100);
        //   System.out.println("Random sayi : " + sayi);
        return sayi;
    }

    public String boslukHesapla(int derinlik) {
        derinlik *= 5;
        String bosluk = "";
        for (int i = 0; i < derinlik; i++) {
            bosluk += " ";

        }
        return bosluk;
    }

    public void yazdir(int derinlik, String text) {

        System.out.println(boslukHesapla(derinlik) + text);
    }
}
