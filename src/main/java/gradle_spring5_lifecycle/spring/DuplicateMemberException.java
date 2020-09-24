package gradle_spring5_lifecycle.spring;

@SuppressWarnings("serial")
public class DuplicateMemberException extends RuntimeException {

    public DuplicateMemberException(String message) {
        super(message);
    }

}
