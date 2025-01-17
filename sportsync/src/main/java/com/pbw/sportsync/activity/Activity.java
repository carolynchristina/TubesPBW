package com.pbw.sportsync.activity;

import java.time.LocalDateTime;
import java.time.LocalTime;

import lombok.Data;

@Data
public class Activity {
    private String judul;
    private String deskripsi;
    private LocalDateTime tglWaktuMulai;    //YYYY-MM-DD hh:mm:ss
    private int jarakTempuh;
    private LocalTime durasi;   //hh:mm:ss
    private String username;
    private String foto;    //Base64
    private int idRace;

    
    //ga ada foto, race
    public Activity(String judul, String deskripsi, LocalDateTime tglWaktuMulai, int jarakTempuh, LocalTime durasi, String username, int idRace){
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.tglWaktuMulai = tglWaktuMulai;
        this.jarakTempuh = jarakTempuh;
        this.durasi = durasi;
        this.username = username;
        this.idRace = idRace;
    }

    //ada foto, race
    public Activity(String judul, String deskripsi, LocalDateTime tglWaktuMulai, int jarakTempuh, LocalTime durasi, String username, String foto, int idRace){
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.tglWaktuMulai = tglWaktuMulai;
        this.jarakTempuh = jarakTempuh;
        this.durasi = durasi;
        this.username = username;
        this.foto = foto;
        this.idRace = idRace;
    }

    //untuk leaderboard 
    public Activity(String username, int jarakTempuh, LocalTime durasi) {
        this.username = username;
        this.jarakTempuh = jarakTempuh;
        this.durasi = durasi;
    }
}
