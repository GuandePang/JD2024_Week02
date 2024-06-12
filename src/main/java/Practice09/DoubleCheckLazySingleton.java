package Practice09;

/***
 * 双重检查锁懒汉式单例
 * 优点是，保证了线程的安全，同时减小了锁定的范围，性能更好
 */
public class DoubleCheckLazySingleton {

    private static DoubleCheckLazySingleton instance = null;

    private DoubleCheckLazySingleton(){}

    public static DoubleCheckLazySingleton getInstance(){
        if(instance == null){
            synchronized (DoubleCheckLazySingleton.class){
                if(instance == null){
                    instance = new DoubleCheckLazySingleton();
                }
            }
        }
        return instance;
    }
}
