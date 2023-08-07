package org.example.pattern.builder1;

public class Test {
    public static void main(String[] args) {
//        Director director = new Director(new MobikeBuilder());
//        Bike bike = director.construct();
//
//        System.out.println(bike.getFrame());
//        System.out.println(bike.getSeat());

        //不使用指挥者形式
//        Builder builder = new MobikeBuilder();
        Builder builder = new OfoBuilder();
        builder.buildFrame();
        builder.buildSeat();
        Bike build = builder.build();
        System.out.println(build.getFrame());
        System.out.println(build.getSeat());

    }
}
