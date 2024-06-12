package Practice09;

import java.io.Serializable;

/***
 * 饿汉式单例
 * 优点在于不存在线程安全问题，
 * 缺点在于单例对象不一定会被使用，可能会造成资源浪费
 */

public class HungrySingleton implements Serializable {
    private static final HungrySingleton instance;

    static {
        instance = new HungrySingleton();
    }

    private HungrySingleton(){};

    public static HungrySingleton getInstance(){
        return instance;
    }
}
