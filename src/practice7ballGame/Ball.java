package practice7ballGame;

/**
 * @Author Dennis Löhmann (Holisticon AG) 27.06.18
 **/
public class Ball {
    private int weight;
    //    private boolean selected = false;
//    private boolean altSelected = false;
    private int selectionType = 0;

    public Ball(int weight) {
        this.weight = weight;
//        this.selected = false;
    }

//    public boolean isSelected() {
//        return selected;
//    }

    public int getWeight() {
        return weight;
    }

//    public void toggleSelected() {
//        this.selected = !this.selected;
//        this.altSelected = false;
//    }
//
//    public void toggleAltSelected() {
//        this.altSelected = !this.altSelected;
//        this.selected = false;
//    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void unselect() {
//        this.selected = false;
//        this.altSelected = false;
        this.selectionType = 0;
    }

//    public boolean isAltSelected() {
//        return altSelected;
//    }

    public int getSelectionType() {
        return selectionType;
    }

    public void toggleSelectionType() {
        this.selectionType = (selectionType + 1) % 3;
    }
}
