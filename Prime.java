public class Prime
{
    public static void main (String[] args)
    {
        System.out.println(countPrimes(100));
    }
    public static int countFactors(int i0)
    {
        int input0 = i0;
        int count = 0;
        int anotherVariable = 1;
        while(anotherVariable <= input0)
        {
            if(input0%anotherVariable == 0)
            {
                count++;
            }
            anotherVariable++;
        } 
        return count;
    }   
    public static boolean isPrime(int i1)
    {
        if(countFactors(i1)==2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static int countPrimes(int i2)
    {
        int input2 = i2;
        int count2 = 0;
        int min = 1;
        while(min < input2)
        {
            if(isPrime(input2))
            {
                count2++;
                System.out.println(input2);
            }
            input2--;
        } 
        return count2;
    }
}