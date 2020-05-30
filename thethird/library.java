package thethird;


class library {
    /** 初始化总数为1*/
    private int sum = 1;
    private int max = 3;

    /** 设置锁, 一个对象操作一次*/
    public synchronized void add() {
        if (sum < max) {
            sum++;
            System.out.println("还书完成,现在还有" + sum + "本书");
        } else {
            System.out.println("书已满!");
        }
        try {
        // 抓异常
            Thread.sleep(100);
        } catch (Exception ignore) {
        }
    }

    /** 设置锁*/
    public synchronized void reduce() throws InterruptedException {
        if (sum > 0) {
            sum--;
            System.out.println("借书完成, 现在还有" + sum + "本书");
        } else {
            System.out.println("书空了!");
            wait();
            notify();
        }
        try {
        // 抓异常
            Thread.sleep(100);
        } catch (Exception ignore) {
        }

    }
}
