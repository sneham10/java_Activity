package Day2;

import java.io.*;
import java.util.*;

public class Match{

public static void main(String[] args)
{
Score s=new Score();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Team Name");
s.setTeamname(sc.nextLine());
System.out.println("Enter Sessions");
s.setInnings(sc.nextLine());
System.out.println("Enter runs");
s.setScore(sc.nextInt());
s.display();
}
}
