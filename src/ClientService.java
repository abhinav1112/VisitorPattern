public class ClientService {

    public static void main(String[] args) {
        ServiceError[] errors = new ServiceError[]{new Error1(1, "Error1"),
                new Error2(2, "Invalid request"), new Error3(3, "Memory leak"),
                new Error1(1, "Latency error")};

        handleErrors(errors);
    }

    private static void handleErrors(ServiceError[] errors) {
        ErrorHandler errorHandler = new ErrorHandlerImpl();
        for (ServiceError error : errors) {
            error.accept(errorHandler);
        }
    }
}
