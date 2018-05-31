package com.company;


import com.company.model.Clothes;

public class Whiteness extends Clothes {

    private String thinLength;
    private String breastLength;

    public  Whiteness(final String type, final String brend,
                    final  String nameOfCloth, final double price,
                    final  double size, final int amount,
                    final String sleeveLength, final String dressLength, final Integer id) {
        super(type, brend, nameOfCloth, price, size, amount, id);
        this.thinLength = thinLength;
        this.breastLength = breastLength;

    }

    public final String getThinLength() {
        return thinLength;
    }

    public void setThinLength(final String thinLength) {
        this.thinLength = thinLength;
    }

    public final String getBreastLength() {
        return breastLength;
    }

    public void setBreastLength(final String breastLength) {
        this.breastLength = breastLength;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders()+"thinLength, breastLength";
    }

    @Override
    public String toCSV() {
        return super.toCSV()+thinLength+","+breastLength;
    }
}

