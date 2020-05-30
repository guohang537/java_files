package theSecond;


class Borrow {

    private int count = 1;
    private int maxcount = 3;
    public synchronized void add() throws InterruptedException {
        if (count < maxcount) {
            count++;
            System.out.println("还书完成,现在有" + count + "本书");
        } else {
            System.out.println("书已满");
        }
    }

    public synchronized void dec() throws InterruptedException {
        if(count > 0) {
            count--;
            System.out.println("借书完成,现在有" + count + "本书");
        } else {
            System.out.println("书空, 请稍后");
            Thread.sleep(200);
            notify();
        }
    }

}
