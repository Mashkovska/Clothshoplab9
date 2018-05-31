package com.company;


import com.company.model.Clothes;

public class Undercoat extends Clothes {

    private String trousersLength;
    private String skirtLength;

    public Undercoat(final String type, final String brend,
                   final  String nameOfCloth, final double price, final double size, int amount,
                   final  String sleeveLength,final String dressLength, final Integer id) {
        super(type, brend, nameOfCloth, price, size, amount, id);
        this.trousersLength = trousersLength;
        this.skirtLength = skirtLength;

    }

    public final String getTrousersLength() {
        return trousersLength;
    }

    public void setTrousersLength(final String trousersLength) {
        this.trousersLength = trousersLength;
    }

    public final String getSkirtLength() {
        return skirtLength;
    }

    public void setSkistLength(final String skirtLength) {
        this.skirtLength = skirtLength;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders()+"trousersLength, skirtLength";
    }

    @Override
    public String toCSV() {
        return super.toCSV()+trousersLength+","+skirtLength;
    }
}
