package thanveer;
import java.util.*;
public class CommandLine
{
public static void main(String[] args)
{
int num=Integer.parseInt(args[0]);
prime(num);
palindrome(num);
armstrong(num);
perfect(num);
}
public static void perfect(int n)
{
int sum=0;
for(int i=1;i<n;i++)
{
if(n%i==0)
sum+=i;
}
if(sum==n) System.out.println("The Given Number is perfect Number");
else System.out.println("The Given number is Not a Perfect Number");
}
public static void prime(int num)
{
for(int i=2;i<Math.sqrt(num);i++)
{
if(num%i==0)
System.out.println("The Number is not prime");
}
System.out.println("The Number is prime");
}
public static void palindrome(int n)
{
int t=n,res=0;
while(t>0)
{
res=res*10+(t%10);
t/=10;
}
if(n==res) System.out.println("The Given Number is Palindrome");
else System.out.println("The Given Number is not Palindrome");
}
public static void armstrong(int n)
{
int t=n,temp=n,ctr=0,sum=0;
while(t>0)
{
ctr++;
t/=10;
}
while(temp>0)
{
sum=sum+((int)(Math.pow(temp%10,ctr)));
temp/=10;
}
if(sum==n) System.out.println("The Given number is Armstrong Number ");
else System.out.println("The Given Number is Not a Armstrong Number");
}
}