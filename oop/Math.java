package oop;

public class Math {
    public static double PI = 3.14;

    public static int abs(int x) {
        if (x < 0)
            x = -x;
        return x;
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int min(int x, int y) {
        if (x > y)
            return y;
        else
            return x;
    }

    public static int max(int x, int y) {
        if (x > y)
            return x;
        else
            return y;
    }

    public static int pow(int x, int y) {
        int res = 1;
        for (int i = 1; i <= y; i++) {
            res *= x;
        }
        return res;
    }
}
