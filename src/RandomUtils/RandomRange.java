package RandomUtils;

public class RandomRange {

    public static long randomRange(long a, long b) {
        return (long) (Math.random() * (b - a + 1) + a);
    }

    public static long randomRange(long b) {
        return (long) (Math.random() * b);
    }

    public static int randomRange(int a, int b) {
        return (int) (Math.random() * (b - a + 1) + a);
    }

    public static int randomRange(int b) {
        return (int) (Math.random() * b);
    }

    public static double randomRange(double a, double b) {
        return (double) (Math.random() * (b - a + 1) + a);
    }

    public static double randomRange(double b) {
        return (double) (Math.random() * b);
    }

    public static boolean randomBoolean() {

        if (randomRange(0, 1) == 0)
            return false;
        return true;
    }
}