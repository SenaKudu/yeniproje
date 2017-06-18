package com.example.sena.uygulama;

/**
 * Created by sena on 11.06.2017.
 */

public class urunClass {
    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public Integer getUrunFiyati() {
        return urunFiyati;
    }

    public void setUrunFiyati(Integer urunFiyati) {
        this.urunFiyati = urunFiyati;
    }

    public String getUrunResmi() {
        return urunResmi;
    }

    public void setUrunResmi(String urunResmi) {
        this.urunResmi = urunResmi;
    }

    private String urunIsmi;
    private Integer urunFiyati;
    private String urunResmi;

    public urunClass(String urunIsmi, Integer urunFiyati, String urunResmi) {
        this.urunIsmi = urunIsmi;
        this.urunFiyati = urunFiyati;
        this.urunResmi = urunResmi;
    }

    public urunClass() {
    }
}
