package array;
import java.util.Scanner;
public class twodimension 
{
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int mark[][]=new int[2][3];
		for(int i=0;i<2;i++)
		{
			System.out.println("enter your student "+(i+1));
			for(int j=0;j<3;j++)
			{
			System.out.println("enter marks"+(j+1));
				mark[i][j]=sc.nextInt();
	}}
		for(int i=0;i<2;i++) 
		{
			System.out.println("enter your student "+(i+1));
			for(int j=0;j<3;j++)
			{
				System.out.println("\n" +mark[i][j]);	
			}}}}
