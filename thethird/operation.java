package thethird;

public class operation implements Runnable {
    /**
        @author: 刘国航
     */

    /** 存钱模型*/
    public static final String TYPE_ADD = "add";

    /** 取钱模型*/
    public static final String TYPE_REDUCE = "reduce";

    /** 引用图书馆类*/
    private final library book;

    /** 定义操作类型*/
    private final String type;

    /** 构造函数, 初始化变量*/
    public operation(library book, String type) {
        this.book = book;
        this.type = type;
    }

    @Override
    /** 重写run方法, 根据输入的操作类型调用不同的函数*/
    public void run() {
        for (int x = 0; x < 5; x++) {
            // 调用函数
            if (TYPE_ADD.equals(type)) {
                book.add();
            } else if (TYPE_REDUCE.equals(type)) {
                try {
                // 抓异常
                    book.reduce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}