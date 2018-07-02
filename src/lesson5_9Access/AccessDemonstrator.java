package lesson5_9Access;

/**
 * @Author Dennis Löhmann (Holisticon AG) 20.06.18
 **/
public class AccessDemonstrator {
    private int variable;

    private int privateMethod() {
        return variable;
    }

    public int publicMethod() {
        return privateMethod();
    }

    protected int protectedMethod() {
        return variable;
    }

    int defaultMethod() {
        return variable;
    }
}
