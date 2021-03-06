package practice6compare;

/**
 * @Author Dennis Löhmann (Holisticon AG) 27.06.18
 **/
public class Ball implements Comparable<Ball> {
    private int weight;
    private int selectionType = 0;

    public Ball(int weight) {
        this.weight = weight;
    }


    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void unselect() {
        this.selectionType = 0;
    }

    public int getSelectionType() {
        return selectionType;
    }

    public void toggleSelectionType() {
        this.selectionType = (selectionType + 1) % 3;
    }

    @Override
    public int compareTo(Ball o) {
        if (this.getWeight() < o.getWeight() ) {
            return -1;
        }
        if (this.getWeight() > o.getWeight() ) {
            return 1;
        }
        return 0;
    }
}
