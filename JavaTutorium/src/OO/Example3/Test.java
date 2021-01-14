package OO.Example3;

public class Test {

    private int x;
    private String y;

    private static int z;

    public Test(int x, String y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public static int getZ() {
        return z;
    }

    public static void setZ(int z) {
        Test.z = z;
    }
}
