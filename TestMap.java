package cn.TestCollection;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName TestMap
 * @Description TODO
 * @Auther danni
 * @Date 2019/9/8 10:43]
 * @Version 1.0
 **/

public class TestMap {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"aaa");//更新和增加
        map.put(2,"bbb");
        String str=map.get(1);
        System.out.println(str);
        System.out.println(((HashMap<Integer, String>) map).clone());//将键值对对应起来
        System.out.println(map.isEmpty());
        map.containsKey(3);
        map.put(1,"a");
        str=map.get(1);
        System.out.println(str);
        System.out.println(map.entrySet());//将键值对用set的方法将键值对对应起来
        System.out.println(map.keySet());//将键值对中的键转为set打印
        System.out.println(map.values());//将键值对中的值转为Collection类打印


    }
}
