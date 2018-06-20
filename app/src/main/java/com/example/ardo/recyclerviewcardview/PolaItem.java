package com.example.ardo.recyclerviewcardview;

/**
 * POJO
 */

public class PolaItem {
    private int img;
    private String judul;
    private String deskripsi;
    private String waktu;

    // Constructor
    public PolaItem(int img, String judul, String deskripsi, String waktu) {
        this.img = img;
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.waktu = waktu;
    }

    // Getter
    public int getImg() {
        return img;
    }

    public String getJudul() {
        return judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getWaktu() {
        return waktu;
    }


}
