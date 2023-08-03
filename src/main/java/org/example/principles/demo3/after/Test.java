package org.example.principles.demo3.after;

/**
 * 测试类
 * 这样以后如果cpu换amd的可以直接创建AmdCpu对象，然后set进去即可
 */
public class Test {
    public static void main(String[] args) {
        //创建组件
        HardDisk disk= new XiJieHardDisk();
        Cpu cpu = new IntelCpu();
        Memory memory = new KingStoneMemory();

        //创建计算机对象
        Computer c = new Computer();
        c.setCpu(cpu);
        c.setHardDisk(disk);
        c.setMemory(memory);

        c.run();
    }
}
