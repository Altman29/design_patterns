package org.example.pattern.factory.config_factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

public class CoffeeFactory {

    //加载配置文件，获取全类名并创建对象，进行存储
    //1.定义容器对象存储咖啡对象
    private static final HashMap<String, Coffee> map = new HashMap<>();

    //2.加载配置文件，只需要加载一次
    static {
        //获取配置文件中所有的键值对

        //1.加载配置文件
        Properties p = new Properties();
        //2.获取所有的键值对
        InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            p.load(is);
            p.keySet().forEach(key -> {
                //获取全类名
                String className = p.getProperty((String) key);
                //创建对象
                try {
                    Coffee coffee = (Coffee) Class.forName(className).newInstance();
                    //存储到容器中
                    map.put((String) key, coffee);
                } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //根据名称获取对象
    public static Coffee createCoffee(String name) {
        if (map.isEmpty()) {
            throw new RuntimeException("对不起，目前还没有任何咖啡");
        }
        if (!map.containsKey(name)) {
            throw new RuntimeException("对不起，没有匹配的咖啡");
        }
        return map.get(name);
    }
}
