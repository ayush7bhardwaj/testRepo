package practicejava;

class MyException extends Exception {
    public MyException (String message) {super(message);}
}

public class CustomExeption {
    public static void main(String[] args) throws MyException {
        try {
            exceptionHandling();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void exceptionHandling () throws MyException {
        throw new MyException("Exception thrown");
    }
}
