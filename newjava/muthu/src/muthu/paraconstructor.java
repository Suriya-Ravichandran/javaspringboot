package muthu;

import java.io.*;
import java.util.*;

class methodparacons
{
int m;
int n;

methodparacons(int a, int b )
{
	this.m=a;
	this.n=b;
	b=m+n;
	System.out.println(b);
}
}
public class paraconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodparacons x=new methodparacons(200,10);
		
	
	}

}
	