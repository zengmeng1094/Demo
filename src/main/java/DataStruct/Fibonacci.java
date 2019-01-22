package DataStruct;

public class Fibonacci {

    public static int fibonacci(int n){
        if (n == 1 || n == 2)
            return 1;
        return  fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        //实现一个斐波那契数列计算，根据输入的n来输出对应长度的斐波那契数列数值
        System.out.println(fibonacci(6));
    }
}
