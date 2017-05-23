
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

public class misc
{
   public static void main(String[] args) throws IOException
      {
      int x=17;
      int y=2;
      swap(x,y)    ; 
      }
   public static void swap (int x,int y)
   {
   int temp=x;
   x=y;
   y=temp;
   System.out.println(x+"\n"+y);  
   }


}