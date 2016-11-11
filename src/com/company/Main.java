package com.company;

public class Main
{
    private static int createPalindrome(int palindrom) {

        String firstHalf=Integer.toString(palindrom);
        String secondHalf = new StringBuffer(firstHalf).reverse().toString();
        return Integer.parseInt(firstHalf+secondHalf);
    }

    private static void runPalindrome() {
        boolean found = false;
        int firstHalf = 999, palindrom = 0;
        int multiplier1=0, multiplier2=0;

        while (!found) {

            firstHalf--;
            palindrom = createPalindrome(firstHalf);
            for (int i = 999; i > 99; i--) {
                if ((palindrom / i) > 999 || i*i < palindrom) {
                    break;
                }

                if ((palindrom % i == 0)) {
                    found = true;
                    multiplier1 = palindrom / i;
                    multiplier2 = i;
                    break;
                }
            }
        }
        System.out.println("Palindrom="+palindrom);
        System.out.println("Multiplier1="+multiplier1);
        System.out.println("Multiplier2="+multiplier2);
    }

    public static void main(String[] args)
    {
        long begin = System.currentTimeMillis();
        runPalindrome();
        long end = System.currentTimeMillis();
        System.out.println(end-begin + "ms");
    }
}
