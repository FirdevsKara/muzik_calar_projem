package muzikcalar;
public class SongNode {
    String sarkiAdi;
    String dosyaYolu;
    SongNode oncekiSarki;
    SongNode sonrakiSarki;

    public SongNode(String sarkiAdi, String dosyaYolu) {
        this.sarkiAdi = sarkiAdi;
        this.dosyaYolu = dosyaYolu;
        this.oncekiSarki = null;
        this.sonrakiSarki = null;
    }
}

