public class Solution {
    public static void main(String[] args) {
        System.out.println("Google!");
        int sum = 0;
        for(int i = 0; i <= 10; i++) {
            if(i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("Sum of even numbers: " + sum);
    }
}
