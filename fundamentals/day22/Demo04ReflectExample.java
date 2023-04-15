import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo04ReflectExample {
  public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException,
      InstantiationException, NoSuchMethodException, InvocationTargetException {
    // 1. 将需要创建的对象的全类名和需要执行的方法定义在配置文件中
    // 2. 在程序中加载读取配置文件：使用类加载器读取配置文件
    InputStream in = Demo04ReflectExample.class.getClassLoader().getResourceAsStream("prop.properties");
    // 使用属性流：
    Properties prop = new Properties();
    prop.load(in);
    // 获取配置文件中的类全限定名称：com.abc.clazz.Student
    String className = prop.getProperty("className");
    // 获取配置文件中的需要调用的类的方法：sleep
    String methodName = prop.getProperty("methodName");
    // 3. 使用反射技术来加载类文件进内存
    Class<?> clz = Class.forName(className);
    // 4. 创建对象
    Object obj = clz.newInstance();
    // 5. 执行方法
    Method sleepMethod = clz.getMethod(methodName);
    sleepMethod.invoke(obj);
  }
}
