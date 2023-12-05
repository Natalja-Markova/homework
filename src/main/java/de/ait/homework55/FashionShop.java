package de.ait.homework55;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Set;

public class FashionShop {
    private EnumMap<FashionCategory, Set<FashionItem>>catalog;

    public FashionShop(EnumMap<FashionCategory, Set<FashionItem>> catalog) {
        catalog = new EnumMap<>(FashionCategory.class);
        for(FashionCategory category:FashionCategory.values()){
            catalog.put(category,new HashSet<>());
        }
    }


    public  void  addFaschiontem(FashionItem fashionItem){
        catalog.get(fashionItem.getFashionCategory()).add(fashionItem);
    }
    public  void showInfoAboutSeasom(Season season){
        for (FashionCategory fashionCategory:FashionCategory.values()){
            System.out.println("kategori " + fashionCategory);
            for (FashionItem  item: catalog.get(fashionCategory)){
              if(item.getSeason().equals(season)){
                  System.out.println( item.toString());
              }
            }
        }
    }
}
