public class Medthod {
    public static void main(String[] args) {
        int x = 9;
        int y = 7;
        int k = max(x, y); // Invoke max method
        System.out.println("The maximum between " + x +
                " and " + y + " is " + k);

    }

    public static int max(int num1, int num2) {
        int result;

        if (num1 > num2)
            result = num1;
        else
            result = num2;

        return result; // Return result
    }

}
