
//method overriding 
package primitiveDT;
class Parent{
void fun()  //overridden method
{
System.out.println("Hi I'm A");
}
}
class Child extends Parent{
void fun(){ //overriding method
System.out.println("Hi I'm B");
}
public class methodoverriding{
public static void main(String[] args){
Child c= new Child();
c.fun();
}
}
//method overloading
package primitiveDT;
class Demo{
void fun(){
System.out.println("I have no parameter");
}
void fun(int a){
System.out.println("I have 1 parameter a: "+a);
}
void fun(int a,int b){
System.out.println("I have 2 parameter a&b:"+a+","+b);
}
void fun(String a){
System.out.println("I have a String s: "+s);
}
public class methodoverload{
public static void main(String[] args){
demo obj=new demo();
obj.fun();
obj.fun(5);
obj.fun(10,20);
System.out.println(5);
System.out.println("abc");
System.out.println(5.06);
}
}
