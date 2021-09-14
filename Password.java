package thanveer;
import java.util.*;
import java.lang.*;
public class Password {
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter The Username:");
String user=sc.nextLine();
System.out.println("Enter The Password: ");
String pass=sc.nextLine();
char[] s= {' ','!','#','$','%','&',',','(',')','*','+',',','-','.','/',':',';','<','=','>','?','@','[',']','^','_','`','{','|','}','~'};
char []ch=pass.toCharArray();
int f1=0,f2=0,f3=0,f4=0,f5=0,f6=0;
for(int i=0;i<ch.length;i++)
{
if(ch[i]>=65&&ch[i]<=90) f1=1;
else if(ch[i]>=97&&ch[i]<=122) f2=1;
else if(ch[i]>=48&&ch[i]<=57) f3=1;
}
if(ch.length>=8&&ch.length<=23) f4=1;
for(int i=0;i<ch.length;i++) {
for(int j=0;j<s.length;j++)
{
if(ch[i]==s[j]) {
f5=1;
break;
}
}
if(f5==1) break;
}
if(user.equals(pass)) f6=1;
if(f1==1&&f2==1&&f3==1&&f4==1&&f5==1&&f6==1)
System.out.println("The Given Username and Password is Valid");
else System.out.println("The Given Username and Password are not valid");
}
}