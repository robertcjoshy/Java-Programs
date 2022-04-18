import java.util.*;
class cpu {
    int price;   
    public class Processor{   
    void processor()
    {
        int cores;
        String manufacturer;
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER THE NO OF CORES:");
        cores= s.nextInt();   
        System.out.println("ENTER THE MANUFACTURER:");
        manufacturer = s.next();  
     	System.out.println("\tCORES:"+ cores + "\tMANUFACTURER: "+manufacturer);
     }
    }  
    static class RAM{  
    void ram()
    {
        int memory;
        String manufacturer;
        Scanner s = new Scanner(System.in);
   	System.out.println("\nENTER THE NO OF MEMORY:");
        memory = s.nextInt();   
        System.out.println("\nENTER THE MANUFACTURER:");
        manufacturer = s.next(); 
	System.out.println("\nMEMORY :"+ memory + "MANUFACTURER: "+manufacturer);
	}
    }
}
public class No4 {
    public static void main(String[] args) {     
        cpu c =new cpu();
	cpu.Processor pro=c.new Processor();
	pro.processor();
	cpu.RAM r=new cpu.RAM();
	r.ram();
	    
    }
}




