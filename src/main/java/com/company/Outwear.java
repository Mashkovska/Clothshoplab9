package com.company;


import com.company.model.Clothes;

public class Outwear extends Clothes {

    private String sleeveLength;
    private String dressLength;

    public Outwear(final String type, final String brend, final String nameOfCloth,
                  final double price,final double size,final int amount,
                  final String sleeveLength, final String dressLength, final Integer id) {
        super(type, brend, nameOfCloth, price, size, amount, id);
        this.dressLength = dressLength;
        this.sleeveLength = sleeveLength;

    }

    public final String getSleeveLength() {
        return sleeveLength;
    }

    public  void setSleeveLength(final String sleeveLength) {
        this.sleeveLength = sleeveLength;
    }

    public final String getDressLength() {
        return dressLength;
    }

    public  void setDressLength(final String dressLength) {
        this.dressLength = dressLength;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders()+"sleeveLength, dressLength";
    }

    @Override
    public String toCSV() {
        return super.toCSV()+ sleeveLength+","+dressLength;
    }
}
