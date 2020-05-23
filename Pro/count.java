package Pro;

/**
 @author: 刘国航
 @time: 2020/5/21

 */

public class count {
    // 所有车载人量
    int mannedCount = 0;

    // 所有车的载货量
    double cargoCount = 0;

    // 总的价格
    int money = 0;

    // 总的租车天数
    int days = 0;

    // 租用车辆总数
    int carCount = 0;
    public count(int[] num, int[] times, Car[] carType) {

        for(int x = 0, len = num.length;x<len;x++){

            // 车辆总载人数等于租借 该车的数量*每辆车的载人量
            this.mannedCount += num[x] * carType[x].manned;

            this.cargoCount += num[x] * carType[x].cargo;

            // 等于每辆车租借时间和
            this.days += times[x];

            this.carCount += num[x];

            // 价格 * 时间
            this.money += num[x] * carType[x].rents;
        }

    }
    public void run(int[] num){
        System.out.println("总的载人量 :" + this.mannedCount);
        System.out.println("总的载货量 :" + this.cargoCount);
        System.out.println("总的车辆数 :" + this.carCount);
        System.out.println("总的天数 :" + this.days);
        System.out.println("总的价格: " + this.money);
        for(int x = 0,len = num.length;x<len;x++){
            if(num[x] != 0){
               System.out.printf("第%d号车租借了%d辆\n", x+1, num[x]);
            }
        }
    }
}
