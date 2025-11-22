public class Primes {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int count =0;
        boolean[] arr = isPrime(x);
        System.out.println("Prime numbers up to " + x);
        for(int i=0; i<arr.length; i++){
            if (arr[i]==true) {
                System.out.println(i);
                count++;
            }
        }
        double ratio = (double) count / x * 100;
        System.out.println("There are " + count + "primes between 2 and " + x + " (" + (int) ratio + "% are primes)");
        
    }

    public static boolean[] isPrime(int num)
    {
        boolean[] primes = new boolean[num+1];
        primes = trueEveryone(primes);
        int p = 2;
        primes[0] = false;
        primes[1] = false;
        while (p<=Math.sqrt(num)) {
            int x = p;
            while (x<num+1) {
                if (x%p==0 && x!=p) {
                    primes[x] = false;
                }
                x++;
            }
            p = firstTrue(primes, p+1);
        }
        return primes;
    }

    public static int firstTrue(boolean[] arr, int n){
        for(int i=n; i<arr.length; i++){
            if (arr[i]==true) {
                return i;
            }
        }
        return arr.length;
    }

    public static boolean[] trueEveryone(boolean[] arr){
        for(int i=0; i<arr.length; i++){
            arr[i] = true;
        }
        return arr;
    }
}