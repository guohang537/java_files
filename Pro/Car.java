package Pro;
/**
    @author: 刘国航
    @time: 2020/5/21

*/
public class Car {

    // 序号
    int number;

    // 名字
    String carName;

    // 租金
    int rents;

    // 载货量
    double cargo;

    // 载人数
    int manned;

    /** 载客车*/
    public Car(int number, String carName, int rents, int manned) {
            this.number = number;
            this.carName = carName;
            this.rents = rents;
            this.manned = manned;
    }

    /** 载货车 */
    public Car(int number, String carName, int rents, double cargo){
        this.number = number;
        this.carName = carName;
        this.rents = rents;
        this.cargo = cargo;
    }

    /** 皮卡车 */
    public Car(int number, String carName, int rents, int manned, double cargo){
        this.number = number;
        this.carName = carName;
        this.rents = rents;
        this.manned = manned;
        this.cargo = cargo;
    }


    @Override
    public String toString() {
        return  "序号: " + number +
                ", 车名: '" + carName + '\'' +
                ", 租金: " + rents +
                ", 载货量: " + cargo +
                ", 载人量: " + manned ;
    }
}

