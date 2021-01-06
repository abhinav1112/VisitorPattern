public class Error1 implements ServiceError {

    int errorId;

    String errorMessage;

    public Error1(int errorId, String errorMessage) {
        this.errorId = errorId;
        this.errorMessage = errorMessage;
    }

    public int getErrorId() {
        return errorId;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    @Override
    public void accept(ErrorHandler errorHandler) {
        errorHandler.visit(this);
    }
}
