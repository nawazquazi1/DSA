public class MultiplyStrings {


    public static void main(String[] args) {

        System.out.println(multiply("2", "3"));
        System.out.println(multiply("123", "456"));
    }


    public static String multiply(String num1, String num2) {
        Long n = Long.parseLong(num1);
        Long n1 = Long.parseLong(num1);
        Long ans = n * n1;
        return String.valueOf(ans);
    }

//    public static String multiply2(String num1, String num2) {
//        return num1*num2;
//    }
}
