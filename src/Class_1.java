public class Class_1 {




    public void Min(int number1, int number2, int number3){
        int Min = Math.min(Math.min(number1, number2), number3);
        System.out.println("Min value is " + Min);
    }

    public void Max(int number1, int number2, int number3) {
        int Max = Math.max(Math.max(number1, number2), number3);
        System.out.println("Max value is " + Max);
    }

    public void Mid(int number1, int number2, int number3) {
        if ((number1 <= number2 && number1 >= number3) || (number1 >= number2 && number1 <= number3)) {
            int Mid = number1;
            System.out.println("Middle value is " + Mid);
            return;
        }
        if ((number2 <= number1 && number2 >= number3) || (number2 >= number1 && number2 <= number3)) {
            int Mid = number2;
            System.out.println("Middle value is " + Mid);
        }
        if ((number3 <= number2 && number3 >= number1) || (number3 >= number2 && number3 <= number1)) {
            int Mid = number3;
            System.out.println("Middle value is " + Mid);
        }

    }
}
