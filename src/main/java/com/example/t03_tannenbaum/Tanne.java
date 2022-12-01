package com.example.t03_tannenbaum;

public class Tanne {

    private int Stammbreite;
    private int Stammhoehe;
    private int Kronenhoehe;

    private String Zeichnung = "";

    public int getStammbreite() {
        return Stammbreite;
    }

    public int getStammhoehe() {
        return Stammhoehe;
    }

    public int getKronenhoehe() {
        return Kronenhoehe;
    }

    public String getZeichnung() {
        return Zeichnung;
    }

    public void setStammbreite(int stammbreite) {
        Stammbreite = stammbreite;
    }

    public void setStammhoehe(int stammhoehe) {
        Stammhoehe = stammhoehe;
    }

    public void setKronenhoehe(int kronenhoehe) {
        Kronenhoehe = kronenhoehe;
    }

    public void Zeichne() {
        String Zeichnung = "";
        String ZeichneKrone;
        String ZeichneStamm;
    }

    private void zeichneKrone() {
        for (int i = 1; i <= Kronenhoehe; ++i)
            zeichneZeile(Kronenhoehe - i, 2 * i - 1);
    }

    private void zeichneStamm() {
        for (int i = 1; i <= Stammhoehe; ++i)
            zeichneZeile(Kronenhoehe - Stammbreite / 2 - 1, Stammbreite);
    }

    private void zeichneZeile(int Anfang, int Breite) {
        int i;
        for (i = 1; i <= Anfang; ++i)
            Zeichnung += " ";

        for (i = 1; i <= Breite; ++i)
            Zeichnung += "*";

        Zeichnung += "\n";
    }
}