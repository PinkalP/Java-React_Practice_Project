public class Exercise {
    public static void main(String[] args) {
        CheckNumber(15);
        CheckNumber(-10);
        CheckNumber(0);
    }
    public static void CheckNumber(int number) {
       if (number > 0) {
           System.out.println("Number is Positive");
       }else if (number < 0){
           System.out.println("Number is Negative");
       }else if (number == 0){
           System.out.println("Number is zero");
       }

    }
}
