package lesson7_6Enumeration;

/**
 * @Author Dennis Löhmann (Holisticon AG) 21.06.18
 **/
public enum Jobs {

    STUDENT("relaxing"), TEACHER("Computer Science", true, "fishing");

    String subject;
    boolean canTeach;
    String hobby;

    Jobs() {
        canTeach = false;
    }

    Jobs(String hobby) {
        this.hobby = hobby;
        canTeach = false;
    }

    Jobs(String subject, boolean canTeach, String hobby) {
        this.subject = subject;
        this.canTeach = canTeach;
        this.hobby = hobby;
    }

}
