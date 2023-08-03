package org.example.pattern.singleton.demo7;

import java.io.*;

/**
 * 测试通过序列化和反序列化的方式，破坏单例模式
 */
public class Test {
    public static void main(String[] args) throws Exception {
        //1.写入对象到a.txt文件中
//        writeObject2File();

        //2.从a.txt文件中读取对象
        readObjectFromFile();
        readObjectFromFile();
        /**
         *
         * org.example.pattern.singleton.demo7.Singleton@7291c18f
         * org.example.pattern.singleton.demo7.Singleton@34a245ab
         * 单例模式被破坏了，俩次获取的对象地址不一样
         */
    }


    //从文件中读取数据(对象)
    public static void readObjectFromFile() throws Exception {
        //1.创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
        //2.读取对象
        Singleton singleton = (Singleton) ois.readObject();
        System.out.println(singleton);
        //3.释放资源
        ois.close();
    }

    //向文件中写数据(对象)
    public static void writeObject2File() throws Exception {
        //1.获取Singleton对象
        Singleton instance = Singleton.getInstance();
        //2.创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
        //3.写对象
        oos.writeObject(instance);
        //4.释放资源
        oos.close();
    }
}
