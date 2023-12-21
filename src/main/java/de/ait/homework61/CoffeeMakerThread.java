package de.ait.homework61;

class CoffeeMakerThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Кофе мелется");
            Thread.sleep(2000);
            System.out.println("Кофе заваривается");
            Thread.sleep(5000);
            System.out.println("Кофе готов");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}





       /* public static void main(String[] args) {
            BartenderThread bartenderThread = new BartenderThread();
            bartenderThread.start();
        }*/


