package Practice02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionTools {
    public static <T>T createInstance(Class<T> clazz, Object... args) throws Exception{
        Constructor<T> constructor = clazz.getDeclaredConstructor(args.getClass());
        return constructor.newInstance(args);
    }

    public static Object invokeMethod(Object object, String methodName, Object... args) throws Exception{
        Method method = object.getClass().getDeclaredMethod(methodName, args.getClass());
        return method.invoke(object, args);
    }
}
