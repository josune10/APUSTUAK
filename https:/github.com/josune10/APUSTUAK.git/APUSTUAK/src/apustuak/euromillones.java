package apustuak;
import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
public class euromillones {
	
	public static void main(String[]args)
	{
		int []numeros = new int[7];
		int []numerosrand = new int[7];

	Random rand = new Random();
	Scanner  cn = new Scanner(System.in);
	
	System.out.print("dame el primer numero:");
	numeros[0] = cn.nextInt();
	System.out.print("dame el segundo numero:");
	numeros[1] = cn.nextInt();
	System.out.print("dame el tercero numero:");
	numeros[2] = cn.nextInt();
	System.out.print("dame el cuarto numero:");
	numeros[3] = cn.nextInt();
	System.out.print("dame el quinto numero:");
	numeros[4] = cn.nextInt();
	System.out.print("dame la primera estrella numero:");
	numeros[5] = cn.nextInt();
	System.out.print("dame la segunda estrella numero:");
	numeros[6] = cn.nextInt();
	
	int max=50;
	int min=1;
	int max2=12;
	int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0, num7 = 0;
	int con = 0;
	int est = 0;
	
	System.out.println(numerosrand[0] = (rand.nextInt(46 - min + 1) + min));
	numerosrand[0] = (rand.nextInt(max - min) + min);
	while(numerosrand[0]==numerosrand[1]) 
	{
		numerosrand[1] = (rand.nextInt(max - min) + min);
	}
	System.out.println(numerosrand[1]);	
	numerosrand[2] = (rand.nextInt(max - min) + min);	
	while(numerosrand[1]==numerosrand[2]||numerosrand[2]==numerosrand[0] )
	{
		numerosrand[2] = (rand.nextInt(max - min) + min);
	}
	System.out.println(numerosrand[2]);
	numerosrand[3] = (rand.nextInt(max - min) + min);
	while(numerosrand[2]==numerosrand[3]||numerosrand[3]==numerosrand[1]||numerosrand[3]==numerosrand[0]) 
	{
		numerosrand[3] = (rand.nextInt(max - min) + min);
	}
	System.out.println(numerosrand[3]);
	numerosrand[4] = (rand.nextInt(max - min) + min);
	while(numerosrand[3]==numerosrand[4]||numerosrand[4]==numerosrand[2]||numerosrand[4]==numerosrand[1]||numerosrand[4]==numerosrand[0])
	{
		numerosrand[4] = (rand.nextInt(max - min) + min);
	}
	System.out.println(numerosrand[4]);
	
	
	System.out.println(numerosrand[5] = (rand.nextInt(11 - min + 1) + min));
	numerosrand[6] = (rand.nextInt(max2 - numerosrand[5] + 1) + numerosrand[5]);	
	while(numerosrand[5]==numerosrand[6])
	{
		numerosrand[6] = (rand.nextInt(max2 - numerosrand[5] + 1) + numerosrand[5]);	
	}
	System.out.println(numerosrand[6]);
	
	
	
	
	
	if(numeros[0]==numerosrand[0]||numeros[0]==numerosrand[1]||numeros[0]==numerosrand[2]||numeros[0]==numerosrand[3]||numeros[0]==numerosrand[4])
	{
		con=con+1;
	}
	if(numeros[1]==numerosrand[0]||numeros[1]==numerosrand[1]||numeros[1]==numerosrand[2]||numeros[1]==numerosrand[3]||numeros[1]==numerosrand[4])
	{
		con=con+1;
	}
	if(numeros[2]==numerosrand[0]||numeros[2]==numerosrand[1]||numeros[2]==numerosrand[2]||numeros[2]==numerosrand[3]||numeros[2]==numerosrand[4])
	{
		con=con+1;
	}
	if(numeros[3]==numerosrand[0]||numeros[3]==numerosrand[1]||numeros[3]==numerosrand[2]||numeros[3]==numerosrand[3]||numeros[3]==numerosrand[4])
	{
		con=con+1;
	}
	if(numeros[4]==numerosrand[0]||numeros[4]==numerosrand[1]||numeros[4]==numerosrand[2]||numeros[4]==numerosrand[3]||numeros[4]==numerosrand[4])
	{
		con=con+1;
	}
	if(numeros[5]==numerosrand[6]||numeros[5]==numerosrand[5])
	{
		est=est+1;
	}
	if(numeros[6]==numerosrand[6]||numeros[6]==numerosrand[5])
	{
		est=est+1;
	}
	
	Arrays.sort(numerosrand);
	System.out.println(Arrays.toString(numerosrand));
	if(con==2)
	{
		System.out.print("13ª premio");
	}
	else if(con==2 && est==1)
	{
		System.out.print("12ª premio");
	}
	else if(con==1 && est==2)
	{
		System.out.print("11ª premio");
	}
	else if(con==3)
	{
		System.out.print("10ª premio");
	}
	else if(con==3 && est==1)
	{
		System.out.print("9ª premio");
	}
	else if(con==2 && est==2)
	{
		System.out.print("8ª premio");
	}
	else if(con==4)
	{
		System.out.print("7ª premio");
	}
	else if(con==3 && est==2)
	{
		System.out.print("6ª premio");
	}
	else if(con==4 && est==1)
	{
		System.out.print("5ª premio");
	}
	else if(con==4 && est==2)
	{
		System.out.print("4ª premio");
	}
	else if(con==5)
	{
		System.out.print("3ª premio");
	}
	else if(con==5 && est==1)
	{
		System.out.print("2ª premio");
	}
	else if(con==5 && est==2)
	{
		System.out.print("1ª premio");
	}
	else if(con==0 || est==0)
	{
		System.out.print("no premio");
	}
	
}
}