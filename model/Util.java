package model;

public class Util {
    /*
    该方法返回给定数组中的一个随机元素
    <T>代表泛型，使该方法可以用于多种数据类型
    T代表返回的是数组中的某个元素
    若为T[]则代表返回数组
     */
    public static <T> T RandomPick(T[] arr){
        int randomIndex = (int) (Math.random() * arr.length);
        return arr[randomIndex];
    }
}
