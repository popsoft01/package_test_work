package ChapterTwenty;

public class Pair<F, S> {
    private F firstArgurment;
    private S secondArgurment;

    public Pair(F firstArgurment, S secondArgurment) {
        this.firstArgurment = firstArgurment;
        this.secondArgurment = secondArgurment;
    }

    public F getFirstArgurment() {
        return firstArgurment;
    }

    public void setFirstArgurment(F firstArgurment) {
        this.firstArgurment = firstArgurment;
    }

    public S getSecondArgurment() {
        return secondArgurment;
    }

    public void setSecondArgurment(S secondArgurment) {
        this.secondArgurment = secondArgurment;
    }
}
