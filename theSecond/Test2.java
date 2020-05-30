package theSecond;


public class Test2 {
    /**
     @author: 刘国航
     */

    public static void main(String[] args) {
        final Borrow data = new Borrow();
        int max = 6, max2 = 5;

        for (int i = 0; i < max2; i++) {

            new Thread(() -> {
                try {
                    data.add();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

        for (int i = 0; i < max; i++) {
            new Thread(() -> {
                try {
                    data.dec();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }


    }

}
