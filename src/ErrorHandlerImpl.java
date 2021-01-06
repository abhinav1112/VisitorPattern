public class ErrorHandlerImpl implements ErrorHandler {
    @Override
    public void visit(Error1 error) {
        System.out.println("This is an error with id : " + error.getErrorId() + " and message : " + error.getErrorMessage());
    }

    @Override
    public void visit(Error2 error) {
        System.out.println("This is an error with id : " + error.getErrorId() + " and typr : " + error.getErrorType());
    }

    @Override
    public void visit(Error3 error) {
        System.out.println("This is an error with id : " + error.getErrorId() + " and message : " + error.getErrorMessage());
    }
}
