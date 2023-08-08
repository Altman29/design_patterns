package org.example.pattern.template;

/**
 * 抽象类
 * 定义了一个模板方法和基本方法
 */
public abstract class AbstractClass {
    //模板方法，用来控制基本方法执行顺序,final修饰，不允许子类重写
    public final void cookProcess() {
        //第一步：倒油
        this.pourOil();
        //第二步：热油
        this.heatOil();
        //第三步：倒蔬菜
        this.pourVegetable();
        //第四步：倒调味料
        this.pourSauce();
        //第五步：翻炒
        this.fry();
    }

    //第一步：倒油
    public void pourOil() {
        System.out.println("倒油");
    }

    //第二步：热油
    public void heatOil() {
        System.out.println("热油");
    }

    //第三步：倒蔬菜(抽象方法，菜是不一样的)
    public abstract void pourVegetable();

    //第四步：倒调味料(抽象方法，调味料是不一样的)
    public abstract void pourSauce();

    //第五步：翻炒
    public void fry() {
        System.out.println("炒啊炒啊炒到熟啊");
    }
}
