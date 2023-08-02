package org.example.principles.demo2.after;


/**
 * 测试类：使用长方形测试，禁止使用正方形
 *
 */
public class Test {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setWidth(20);
        r.setLength(20);
        resize(r);
        printLengthAndWidth(r);
    }

    //拓宽resize方法(只能使用长方形！！！)
    public static void resize(Rectangle rectangle){
        //判断宽如果比长小，就扩宽
        while (rectangle.getWidth() <= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    //打印长和宽
    public static void printLengthAndWidth(Quadrilateral quadrilateral){
        System.out.println(quadrilateral.getLength());
        System.out.println(quadrilateral.getWidth());
    }
}
