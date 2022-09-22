class Swap{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before Swapping:\na = "+a+"\n"+"b = "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("\nAfter Swapping:\na = "+a+"\n"+"b = "+b);
    }
}