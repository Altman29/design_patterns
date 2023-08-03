package org.example.principles.demo3.before;

public class Test {
    public static void main(String[] args) {
        //创建组件对象
        XiJieHardDisk hardDisk = new XiJieHardDisk();
        IntelCpu cpu = new IntelCpu();
        KingStoneMemory memory = new KingStoneMemory();

        //创建计算机对象
        Computer computer = new Computer();
        computer.setCpu(cpu);
        computer.setHardDisk(hardDisk);
        computer.setMemory(memory);

        //运行计算机
        computer.run();
    }
}
