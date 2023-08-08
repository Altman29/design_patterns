package org.example.pattern.decorator;

/**
 * 炒面类
 * 具体构件角色
 */
public class FiredNoddles extends FastFood{
    public FiredNoddles() {
        super(15,"炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
