import java.util.*;

class name{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String Firstname=sc.nextLine();
String Lastname=sc.nextLine();

String F1=Firstname.substring(0,1);
String F2=Firstname.substring(1,Firstname.length());

F1=F1.toUpperCase();
F2=F2.toLowerCase();

 Firstname=F1+F2;

 Lastname=Lastname.toUpperCase();

System.out.println(Firstname+" "+Lastname);

}}