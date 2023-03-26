class assign
{
    public static void main(String args[])
    {
        int num = 3;
        int num1 = 9;
        int num2 = 5;
        int num3 = 56;
        int a = (num1 + num2);
        int b = (num1 - num2);
        int c = (num1 / num2);
        int d = (num1 * num2);
        int e = (num1 % num2);
        //num1 = num1 + 1;
        //num1 += 1;
        //num1++(fecth and then increment[post increment])
        //++num1(increment and then fecth[pre increment])  ////////similarly u can do decrement also
        num1 = num1 + 2;
        num2 = num2 - 3;
        num3 = num3 * 2;
        int result1 = num++;
        int result2 = ++num;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(result1);
        System.out.println(result2);
    }
}