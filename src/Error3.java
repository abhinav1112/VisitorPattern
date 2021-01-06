public class Error3 implements ServiceError {

    int errorId;

    String errorMessage;

    public Error3(int errorId, String errorMessage) {
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
