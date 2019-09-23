package com.example.aplikasi_notes;

public class item {
    String tanggal;
    String judul;
    String deskripsi;

    public item () {

    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    @Override
    public String toString() {
        return " "+tanggal+"\n" +
                " "+judul +"\n" +
                " "+deskripsi;
    }

    public item(String tgl, String jdl, String dsc){
        tanggal = tgl;
        judul = jdl;
        deskripsi = dsc;
    }

}
