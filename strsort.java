import java.util.*;
public class strsort
{
 public static void main(String args[]) {
 Scanner s=new Scanner(System.in);
   System.out.println("enter the number of strings:");
     int n=s.nextInt();  String a[]=new String[n];
       System.out.println("enter the strings:");
         for(int i=0;i<n;i++) {
          a[i]=s.next(); 
          }
           Arrays.sort(a); 
            System.out.println("Sorted Array:\n"); 
             for(int i=0;i<n;i++)
             {
               System.out.println(a[i]);
                }
                	}
                		}
