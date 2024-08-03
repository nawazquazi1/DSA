public class isPowerOfFour {


    public static void main(String[] args) {
        System.out.println(is_Power_Of_Four(16));
        System.out.println(is_Power_Of_Four(5));
        System.out.println(is_Power_Of_Four(1));
    }

    public static boolean is_Power_Of_Four(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        if (n % 4 == 0) {
            return is_Power_Of_Four(n / 4);

        }
        return false;
    }
}
