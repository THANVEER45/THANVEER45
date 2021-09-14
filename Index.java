package thanveer;
import java.util.*;
import java.lang.*;
public class Index {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the String: ");
String str=sc.nextLine();
char []ch=str.toCharArray();
int []a=new int[126];
for(int i=0;i<ch.length;i++)
{
if(ch[i]>=65&&ch[i]<=90)
ch[i]=Character.toLowerCase(ch[i]);
a[ch[i]]=i;
}
for(int i=97;i<=122;i++)
System.out.format("%c : %d\n",i,a[i]);
}
}