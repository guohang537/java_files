package Pro;


import java.util.Scanner;

/**
    @author: 刘国航
    @time: 2020/5/21

*/
public class Test {
    public static void main(String[] args){
        Car[] carType = {new Car(1, "载客小轿车", 40, 4),
                         new Car(2, "载客面包车", 65, 7),
                         new Car(3, "载客大巴车", 180,20),
                         new Car(4, "载货低栏车", 30, 1.5),
                         new Car(5, "载货高栏车", 47, 2.5),
                         new Car(6, "载货厢式车", 80, 4.5),
                         new Car(7, "日式皮卡车", 60, 5, 1),
                         new Car(8, "美式皮卡车", 60, 2, 3)
        };

        System.out.println("车辆信息如下:");
        for(int i = 0, len = carType.length;i < len;i++){
            System.out.println(carType[i]);
        }

        // 定义输入类型
        Scanner in = new Scanner(System.in);

        // 建立数组存储每辆车的租的数量
        int[] num = new int[8];

        // 建立数组存储每辆车的租借时间
        int[] times = new int[8];

        for(int i =0, len = num.length;i<len;i++){
            System.out.printf("请输入第%d辆车的租车数量 ", i+1);
            num[i] = in.nextInt();

            System.out.printf("请输入这辆车的租借时间  ");
            times[i] = in.nextInt();

            System.out.println();
        }

        // 计算总天数
        int sum = 0;
        for(int i = 0, len = times.length;i< len; i++){
            sum += times[i];
        }

        // 确认天数
        System.out.printf("您一共租借了%d天, 输入yes确认\t", sum);
        String sure = in.next();
        if(!sure.equals("yes")) {
            System.out.println("----程序结束运行----");
            System.exit(0);
        }
        // 创建一个计算实例
        count counts = new count(num, times, carType);
        counts.run(num);

        // 新建一个字符型变量, 执行输入回车键结束运行
        Scanner end = new Scanner(System.in);
        System.out.println("输入回车键退出运行");
        String enter = end.nextLine();
        if(enter.equals("")){
            System.out.println("----程序运行结束----");
            System.exit(-1);
        }
    }

}
