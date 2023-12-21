package de.ait.homework61;

class BartenderThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Готовлю напиток");
            Thread.sleep(3000);
            System.out.println("Напиток готов");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}