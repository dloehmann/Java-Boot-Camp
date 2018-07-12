package week1;

/**
 * @Author Dennis Löhmann 12.07.18
 **/
public class Cuboid {

    // TODO define variables

    public Cuboid(int x, int y, int z) {
        // TODO set variables
    }

    public int getX() {
        // TODO getters should return their variable's value
        return 0;
    }

    public int getY() {
        // TODO getters should return their variable's value
        return 0;
    }

    public int getZ() {
        // TODO getters should return their variable's value
        return 0;
    }

    public int getVolume() {
        // TODO calculate volume and return it
        return 0;
    }

    public static void main(String[] args) {
        Cuboid c = new Cuboid(2,3,4);
        // TODO should print out "Cuboid (2x3x4) has volume 24."
        System.out.println("Cuboid (" + c.getX() + "x" + c.getY() + "x" + c.getZ() + ") has volume " + c
                .getVolume()
                + ".");
    }
}
