class A{
public void sum (int x ,int y){
System.out.println("\n SUM = "+ (x+y));
}
public void sub (int x ,int y){
System.out.println("\n SUB = "+ (x-y));
}}
class B extends A {
public void mul(int x ,int y){
System.out.println("\n MUL = "+ (x*y));
}}
class in{
public static void main(String[] args){
B obj = new B();
obj.mul(4 , 5);
obj.sum(10 , 5);
obj.sub(9,3);
}}
