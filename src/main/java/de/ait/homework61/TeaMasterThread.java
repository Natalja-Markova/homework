package de.ait.homework61;

class TeaMasterThread extends Thread {
    private String teaType;

    public TeaMasterThread(String teaType) {
        this.teaType = teaType;
    }

    @Override
    public void run() {
        try {
            System.out.println("Завариваю чай: " + teaType);
            Thread.sleep(4000);
            System.out.println("Чай готов");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
