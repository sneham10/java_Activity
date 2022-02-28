package Day1.Activity2;
import java.util.*;

public class Activity2 {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String string1=sc.nextLine();
String string2=sc.nextLine();

if(string1.contains(" ")){
 string1=string1.substring(string1.indexOf(" "),string1.length());
}

if(string2.contains(" ")){
string2=string2.substring(string2.indexOf(" "),string2.length());}

if (string1.equals(string2)==true){
System.out.println("YES");}
else
{System.out.println("No");}

}}

