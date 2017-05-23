import java.util.*;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;
import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;
public class misc{

public static String[] intSort(String[] x)
{
int[] r=new int[x.length];
for(int i=0;i<x.length;i++)
{
r[i]=Integer.valueOf(x[i]);
}
Arrays.sort(r);

for(int j=0;j<r.length;j++)
{
x[j]=Integer.toString(r[j]);
System.out.print(x[j]+",");
}

return x;
}

public static ArrayList<Integer> minIndex(int[] x)
    {
     ArrayList<Integer> index=new ArrayList<Integer>();
     int min=x[0];
     int ind=0;      
     int temp=0;
		 for(int i=0;i<x.length;i++)
		 {
		      if(x[i]<min)
		         min=x[i];
		         ind=i; 
		 }
		 
         for(int j=0;j<x.length;j++)
		 {
			 if(x[ind]==x[j])
			   index.add(j);     
		 }
    		 
    return index;
    } 









public static void main(String[] args) throws IOException{
String[] x={"4","1","8","3","7","2","0"};  
ArrayList<String> x1=new ArrayList<String>(Arrays.asList(x));
}
}