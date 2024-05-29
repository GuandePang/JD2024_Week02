package FlyweightPattern;

import java.lang.reflect.Constructor;
import java.util.HashMap;

public class PPTFactory {
    //使用hashmap来缓存已经创建的PowerPoint对象，避免重复创建相同的对象
    private HashMap<String, PowerPoint> hashMap = new HashMap<>();

    public PowerPoint getPPT(Class<? extends PowerPoint> clazz){
        try {
            /***
             * getName接收一个Class类型的参数
             * 通过反射机制获取构造函数，并创建实例
             */
            String name = clazz.getName();
            if(hashMap.keySet().contains(name)){
                return hashMap.get(name);
            }
            Constructor<?> constructor = Class.forName(name).getConstructor(String.class);
            PowerPoint powerPoint = (PowerPoint) constructor.newInstance("PPT工厂版本所有");
            hashMap.put(name, powerPoint);
            return powerPoint;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
