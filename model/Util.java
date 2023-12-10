package model;

public class Util {
    public static <T> T RandomPick(T[] arr){
        int randomIndex = (int) (Math.random() * arr.length);
        return arr[randomIndex];
    }
    public void print(){
        System.out.println("Sustech");
    }
}
