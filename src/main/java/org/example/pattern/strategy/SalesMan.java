package org.example.pattern.strategy;

/**
 * 销售员
 */
public class SalesMan {

    //聚合策略
    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    //展示促销活动
    public void salesManShow() {
        strategy.show();
    }
}
