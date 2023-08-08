package org.example.pattern.decorator;

/**
 * 炒饭类
 * 具体构件角色
 */
public class FiredRice extends FastFood{
    public FiredRice() {
        super(10,"炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
