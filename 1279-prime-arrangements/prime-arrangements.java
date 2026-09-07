class Solution {
    static final long mod=1000000007;
    public static long fact(int n){
        long res=1;
        for(int i=1;i<=n;i++){
            res=(res*i)%mod;
        }
        return res;
    }
    public int numPrimeArrangements(int n) {
        // we use seive of erathotheses to find number of prime in range so thaat we have to find how many prime pos and non prime pos
        boolean[] isPrime=new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;
        for(int i=2;i*i<=n;i++){
            if(isPrime[i]){
                for(int j=i*i;j<=n;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        int count=0;
        for(int i=2;i<=n;i++){
            if(isPrime[i]) count++;
        }
        // here count=no of prime so number of non prime=n-count ex: n=5 count=3 , non count=5-3=2;
        int non_prime=n-count;
        long prime=fact(count);
        long not_prime=fact(non_prime);
        long res=(prime*not_prime)%mod;
       // if(res>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        return (int)res;
    }
}