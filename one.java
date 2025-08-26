public class one{
public void sum(int x , int y){
System.out.println("addition :"+ (x + y));
}}
class two extends one{
public void sub(int x , int y){
System.out.println("subtraction:" + (x - y));
}
public static void main (String [] args){
two obj = new two();
obj.sum();
}}
public class heirarchy extends one{
public void sub(int x , int y){
System.out.println("subtraction:" + (x - y));
}
public static void main (String [] args){
two obj = new two();
obj.sum();
}}
