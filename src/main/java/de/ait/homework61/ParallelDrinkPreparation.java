package de.ait.homework61;

public class ParallelDrinkPreparation {
    public static void main(String[] args) {
        BartenderThread teaBartender = new BartenderThread();
        CoffeeMakerThread coffeeMaker = new CoffeeMakerThread();
        SommelierThread wineSommelier = new SommelierThread("Мерло");
        TeaMasterThread greenTeaMaster = new TeaMasterThread("зеленый чай");

        teaBartender.start();
        coffeeMaker.start();
        wineSommelier.start();
        greenTeaMaster.start();

        try {
            teaBartender.join();
            coffeeMaker.join();
            wineSommelier.join();
            greenTeaMaster.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}