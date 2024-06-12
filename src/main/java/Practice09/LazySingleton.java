package Practice09;

/***
 * 懒汉式
 * 优点是在需要单例对象时才创建，不会造成资源的浪费
 * 但是多线程情况下是不安全的
 */
public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton(){};

    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
