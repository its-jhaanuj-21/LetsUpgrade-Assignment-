// Lets Upgrade assignment to print sum of all natural numbers from 1 to 50.
class SumNatural {
    public static void main(String[] args) {
        int i, sum = 0;
        for(i=1; i<=50; i++){
            sum += i;
        }
        System.out.println("Sum of all natural number from 1 to 50: "+sum);
    }
}
