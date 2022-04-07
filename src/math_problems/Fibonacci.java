package math_problems;

public class Fibonacci {

    /** INSTRUCTIONS
     * Write a method that will print or return at least 40 Fibonacci numbers
     *
     * e.g. - 0,1,1,2,3,5,8,13
     **/

    public static void main(String[] args) {
    int n1 =0,n2=1,n3,i,count=40;
    System.out.println(n1 +" "+ n2);
    for (i=2; i<count; ++i)
    {
        n3=n1+n2;
        System.out.println("" + n3);
        n1=n2;
        n2=n3;
    }
    }

}
