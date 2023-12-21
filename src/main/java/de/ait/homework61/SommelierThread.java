package de.ait.homework61;

class SommelierThread extends Thread {
    private String wineName;

    public SommelierThread(String wineName) {
        this.wineName = wineName;
    }

    @Override
    public void run() {
        try {
            System.out.println("Выбираю вино");
            Thread.sleep(2000);
            System.out.println("Вино выбрано: " + wineName);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

