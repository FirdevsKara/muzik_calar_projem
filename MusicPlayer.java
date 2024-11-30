
package muzikcalar;
public class MusicPlayer {
    private SongNode ilkSarki;
    private SongNode mevcutSarki;

    public void sarkiEkle(String sarkiAdi, String dosyaYolu) {
        SongNode yeniSarki = new SongNode(sarkiAdi, dosyaYolu);
        if (ilkSarki == null) {
            ilkSarki = yeniSarki;
            mevcutSarki = yeniSarki;
        } else {
            SongNode son = ilkSarki;
            while (son.sonrakiSarki != null) {
                son = son.sonrakiSarki;
            }
            son.sonrakiSarki = yeniSarki;
            yeniSarki.oncekiSarki = son;
        }
    }

    public String mevcutSarkiyiOynat() {
        if (mevcutSarki != null) {
            return "Çalan şarkı: " + mevcutSarki.sarkiAdi;
        } else {
            return "Şu anda çalan şarkı yok.";
        }
    }

    public String sonrakiSarki() {
        if (mevcutSarki != null && mevcutSarki.sonrakiSarki != null) {
            mevcutSarki = mevcutSarki.sonrakiSarki;
            return mevcutSarkiyiOynat();
        } else {
            return "Sonraki şarkı yok.";
        }
    }

    public String oncekiSarki() {
        if (mevcutSarki != null && mevcutSarki.oncekiSarki != null) {
            mevcutSarki = mevcutSarki.oncekiSarki;
            return mevcutSarkiyiOynat();
        } else {
            return "Önceki şarkı yok.";
        }
    }

    public String listeninBasinaAl() {
        mevcutSarki = ilkSarki;
        return mevcutSarkiyiOynat();
    }
}

