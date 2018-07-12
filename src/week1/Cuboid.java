package week1;

/**
 * @Author Dennis Löhmann 12.07.18
 **/
public class Cuboid {

    int x,y,z;

    public Cuboid(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public int getVolume() {
        return x*y*z;

    }
    public static void main(String[] args) {
        Cuboid c = new Cuboid(2,3,4);
        System.out.println("Cuboid (" + c.getX() + "x" + c.getY() + "x" + c.getZ() + ") has volume " + c
                .getVolume()
                + ".");
    }
}
