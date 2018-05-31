package com.company;


import com.company.model.Clothes;

import java.util.LinkedList;
import java.util.List;


public class ClothesShopManager {

    private List<Clothes> clothes = new LinkedList<>();

    public final  List<Clothes> getClothes() {
        return this.clothes;
    }

    public final void addClothes(Clothes addClothes) {
        clothes.add(addClothes);
    }

    public final List<Clothes> findByType(String clothesType) {
        List<Clothes> result = new LinkedList<>();
        for (Clothes clothes : clothes) {
            if (clothes.getType() == clothesType) {
                result.add(clothes);
            }
        }

        return result;
    }

    public final void sortByBrend(List<Clothes> list) {
        list.sort((Clothes o1, Clothes o2) -> o2.getBrend().compareTo(o1.getBrend()));
    }

    public final List<Clothes> getClothesList() {

        return clothes;

    }

}


