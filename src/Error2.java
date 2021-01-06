public class Error2 implements ServiceError{

    int errorId;

    String errorType;

    public Error2(int errorId, String errorType) {
        this.errorId = errorId;
        this.errorType = errorType;
    }

    public int getErrorId() {
        return errorId;
    }

    public String getErrorType() {
        return errorType;
    }

    @Override
    public void accept(ErrorHandler errorHandler) {
        errorHandler.visit(this);
    }
}
