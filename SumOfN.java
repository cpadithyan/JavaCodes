public class SumOfN {
    static int findSum(int n)
    {
        int sum = 0;
        for(int x=1; x<=n; x++)
            sum = sum+x;
        return sum;
    }

    public static void main(String[] args) {
        int n=3;
        System.out.println(findSum(n));
    }
}
