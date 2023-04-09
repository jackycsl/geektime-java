import java.util.LinkedList;

public class Demo04LinkedList {
    public static void main(String[] args) {
        method4();
    }

    /*
     * void push(E e)： 压入。把元素添加到集合的第一个位置。
     * E pop()： 弹出。把第一个元素删除，然后返回这个元素。
     */
    public static void method4() {
        // 创建LinkedList对象
        LinkedList<String> list = new LinkedList<>();
        // 添加元素
        list.add("宝儿姐");
        list.add("宝儿妹");
        list.add("宝儿哥");
        System.out.println("list:" + list);
        // 调用push在集合的第一个位置添加元素
        // list.push("宝儿嫂");
        // System.out.println("list:" + list);//[宝儿嫂, 宝儿姐, 宝儿妹, 宝儿哥]

        // E pop()： 弹出。把第一个元素删除，然后返回这个元素。
        String value = list.pop();
        System.out.println("value:" + value);// 宝儿姐
        System.out.println("list:" + list);// [宝儿妹, 宝儿哥]
    }

    /*
     * E removeFirst()：删除第一个元素
     * E removeLast()：删除最后一个元素。
     */
    public static void method3() {
        // 创建LinkedList对象
        LinkedList<String> list = new LinkedList<>();
        // 添加元素
        list.add("宝儿姐");
        list.add("宝儿妹");
        list.add("宝儿哥");
        // 删除集合的第一个元素
        // String value = list.removeFirst();
        // System.out.println("value:" + value);//宝儿姐
        // System.out.println("list:" + list);//[宝儿妹, 宝儿哥]

        // 删除最后一个元素
        String value = list.removeLast();
        System.out.println("value:" + value);// 宝儿哥
        System.out.println("list:" + list);// [宝儿姐, 宝儿妹]
    }

    /*
     * E getFirst()： 获取集合中的第一个元素
     * E getLast()： 获取集合中的最后一个元素
     */
    public static void method2() {
        // 创建LinkedList对象
        LinkedList<String> list = new LinkedList<>();
        // 添加元素
        list.add("宝儿姐");
        list.add("宝儿妹");
        list.add("宝儿哥");

        System.out.println("list:" + list);// [宝儿姐, 宝儿妹, 宝儿哥]
        // 获取集合中的第一个元素
        System.out.println("第一个元素是：" + list.getFirst());// 宝儿姐
        // 获取集合中的最后一个元素怒
        System.out.println("最后一个元素是：" + list.getLast());// 宝儿哥
    }

    /*
     * void addFirst(E e)： 在集合的开头位置添加元素。
     * void addLast(E e)： 在集合的尾部添加元素。
     */
    public static void method1() {
        // 创建LinkedList对象
        LinkedList<String> list = new LinkedList<>();
        // 添加元素
        list.add("宝儿姐");
        list.add("宝儿妹");
        list.add("宝儿哥");

        // 打印这个集合
        System.out.println("list:" + list);// [宝儿姐, 宝儿妹, 宝儿哥]
        // 调用addFirst添加元素
        list.addFirst("宝儿嫂");
        System.out.println("list:" + list);// [宝儿嫂, 宝儿姐, 宝儿妹, 宝儿哥]
        // 调用addLast方法添加元素
        list.addLast("宝儿叔");
        System.out.println("list:" + list);// [宝儿嫂, 宝儿姐, 宝儿妹, 宝儿哥, 宝儿叔]

    }
}
