package com.company.model;

import com.company.ClothesBrend;
import com.company.ClothesType;

import javax.persistence.*;

@Entity
public class Clothes {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "clothes_id")
    private Integer id;

    @Column(name = "clothesType")
    private String type;

    @Column(name = "clothesBrend")
    private String brend;

    @Column(name = "name")
    private String nameOfCloth;

    @Column(name = "price")
    private double price;

    @Column(name = "size")
    private double size;

    @Column(name = "amount")
    private int amount;

    @Column(name = "lenght")
    private String length;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Clothes() {}

    public Clothes(final String type, final String brend, final String nameOfCloth, final double price, final double size, final int amount, final Integer id) {

        setType(type);
        setNameOfCloth(nameOfCloth);
        setPrice(price);
        setSize(size);
        setAmount(amount);
        setBrend(brend);
        setId(id);

    }

    @Override
    public String toString() {
        return "Name = " + nameOfCloth + " Type = " + type +
                " Brend = " + brend + " Amount = "
                + amount + " Price = " + price;
    }

    public final String getType() {
        return type;
    }

    public final String getBrend() {
        return brend;
    }

    public void setBrend(final String brend) {
        this.brend = brend;
    }

    public final String getNameOfCloth() {
        return nameOfCloth;
    }

    public void setNameOfCloth(final String nameOfCloth) {
        this.nameOfCloth = nameOfCloth;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    public final double getSize() {
        return size;
    }

    public void setSize(final double size) {
        this.size = size;
    }

    public final int getAmount() {
        return amount;
    }

    public void setAmount(final int amount) {
        this.amount = amount;
    }

    public final String getLength() {
        return length;
    }

    public void setLength(final String length) {
        this.length = length;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getHeaders() {
        return "Name, Type, Brend, Amount, Price";
    }

    public String toCSV() {
        return nameOfCloth + "," + type + "," + brend + "," + amount + "," + price;
    }

}

