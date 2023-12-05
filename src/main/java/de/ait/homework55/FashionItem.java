package de.ait.homework55;

public class FashionItem {

    private String  name;
   private double preis;

   private FashionCategory fashionCategory;


   private Season season;

    public FashionItem(String name, double preis, FashionCategory fashionCategory, Season season) {
        this.name = name;
        this.preis = preis;
        this.fashionCategory = fashionCategory;

        this.season = season;
    }

    public String getName() {
        return name;
    }

    public double getPreis() {
        return preis;
    }

    public FashionCategory getFashionCategory() {
        return fashionCategory;
    }

    public Season getSeason() {
        return season;
    }

    @Override
    public String toString() {
        return
                "Название= " + name + '\'' +
                ", цена = " + preis +
                ",категория =" + fashionCategory +
                ", сезон = " + season;
    }


}
