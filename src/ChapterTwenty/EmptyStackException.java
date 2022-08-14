package ChapterTwenty;

public class EmptyStackException extends Throwable {
    public EmptyStackException() {
        this("The stack is Empty");
    }

    public EmptyStackException(String message) {
        super(message);
    }
}
