package com.example.fragmentapps;

public class Heroes {
    int image;
    String nama, desc;

    public Heroes(int image, String nama, String desc) {
        this.image = image;
        this.nama = nama;
        this.desc = desc;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
