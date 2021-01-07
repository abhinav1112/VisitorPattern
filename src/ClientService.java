public class ClientService {

    public static void main(String[] args) {
        ServiceError[] errors = new ServiceError[]{new Error1(1, "Circuit open while calling downstream"),
                new Error2(2, "Invalid request"), new Error3(3, "Memory stack full"),
                new Error1(1, "Latency threshold breach")};

        handleErrors(errors);
    }

    private static void handleErrors(ServiceError[] errors) {
        ErrorHandler errorHandler = new ErrorHandlerImpl();
        for (ServiceError error : errors) {
            error.accept(errorHandler);
        }
    }
}
