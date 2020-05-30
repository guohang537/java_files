package thethird;

public class test {
    /**
        @author:刘国航
     */
    public static void main(String[] args) {
        // 创建一个图书馆类
        library book = new library();

        // 创建俩个操作类对象, 分别是存钱与 取钱
        operation save = new operation(book, operation.TYPE_ADD);
        // 取钱类
        operation draw = new operation(book, operation.TYPE_REDUCE);

        // 创建俩个线程并传入俩个操作类
        Thread t1 = new Thread(save);
        Thread t2 = new Thread(draw);

        // 线程开始
        t1.start();
        t2.start();

    }
}
