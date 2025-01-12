class NotEvenException extends Exception {
    public NotEvenException(String errMsg) {
        super(errMsg);
    }
}

public class Q11_CustomException {
    public static void main(String[] args) {

        int num = 13;

        try {
            if (num % 2 != 0) {
                throw new NotEvenException("Number is not even error.");
            }
            System.out.println(num);
        } catch (NotEvenException ne) {
            System.out.println(ne);
        }

        System.out.println("Program execution completed.");

    }
}
