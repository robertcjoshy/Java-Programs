
class Product
{
int pcode;
String pname;
int pcost;
void display()
{
System.out.println(pcode+":"+pname+":"+pcost);
}
}
class Product1
{
public static void main(String args[])
{
Product p1=new Product();
p1.pcode=100;
p1.pname="DBC";
p1.pcost=10000;
p1.display();
Product p2=new Product();
p2.pcode=101;
p2.pname="ABC";
p2.pcost=70000;
p2.display();
Product p3=new Product();
p3.pcode=102;
p3.pname="BCA";
p3.pcost=50000;
p3.display();
if(p1.pcost<p2.pcost && p1.pcost<p3.pcost)
{
System.out.println(p1.pname+"has the lowest price");
}
else if(p2.pcost<p1.pcost && p2.pcost<p3.pcost)
{
System.out.println(p2.pname+"has the lowest price");
}
else
{
System.out.println(p3.pname+"has the lowest price");
}
}
}


