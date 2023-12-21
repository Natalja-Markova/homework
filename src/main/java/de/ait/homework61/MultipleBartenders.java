package de.ait.homework61;


    public class MultipleBartenders {
        public static void main(String[] args) {
            BartenderThread teaBartender = new BartenderThread();
            BartenderThread coffeeBartender = new BartenderThread();
            BartenderThread cocktailBartender = new BartenderThread();

            teaBartender.start();
            coffeeBartender.start();
            cocktailBartender.start();
        }
    }

