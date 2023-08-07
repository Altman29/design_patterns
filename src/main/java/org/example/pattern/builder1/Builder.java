package org.example.pattern.builder1;

/**
 * 抽象构建者
 */
public abstract class Builder {

    //声明bike类型的变量，并进行赋值
    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public Bike createBike() {
        return bike;
    }

    /**
     * 将指挥者装配的职责放在抽象构建者中,
     * 确实简化了系统结构，但是违反了单一职责原则
     * @return
     */
    public Bike build() {
        this.buildFrame();
        this.buildSeat();
        return this.createBike();
    }
}
