package com.company;

public class Class {
    private int nomber;
    private String soz;
    private int[] massiv;

    public Class(int nomber, String soz, int[] massiv) {
        this.nomber = nomber;
        this.soz = soz;
        this.massiv = massiv;
    }

    public int getNomber() {
        return nomber;
    }

    public void setNomber(int nomber) {
        this.nomber = nomber;
    }

    public String getSoz() {
        return soz;
    }

    public void setSoz(String soz) {
        this.soz = soz;
    }

    public int[] getMassiv() {
        for (int mas:massiv){
            System.out.print(mas+" ");
        }
        return massiv;
    }

    public void setMassiv(int[] massiv) {
        this.massiv = massiv;
    }
}



