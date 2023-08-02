package org.example.principles.demo2.before;

/**
 * 测试类：square调用扩宽方法会导致程序出错，一直运行，无法停止
 * 证明正方形继承长方形是错误的，违反了里氏替换原则
 */
public class Test {
    public static void main(String[] args) {
        //创建长方形对象
        Rectangle r = new Rectangle();
        //设置宽和高
        r.setLength(20);
        r.setWidth(10);
        //调用resize方法进行扩宽
        resize(r);
        printLengthAndWidth(r);

        System.out.println("===============");
        //创建正方形对象
        Square s = new Square();
        //设置宽和高
        s.setLength(10);
        //调用resize方法进行扩宽
        resize(s);
        printLengthAndWidth(s);
    }

    //拓宽resize方法
    public static void resize(Rectangle rectangle){
        //判断宽如果比长小，就扩宽
        while (rectangle.getWidth() <= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    //打印长和宽
    public static void printLengthAndWidth(Rectangle rectangle){
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
    }
}
