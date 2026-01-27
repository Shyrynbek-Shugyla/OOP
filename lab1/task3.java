import java.util.Scanner;
public class task3 {
    public static void main(){
Scanner sc = new Scanner(System.in);
int grade = sc.nextInt();
if(grade>95  && grade<100 ){
    System.out.println("A");
}
if(grade>90  && grade<94 ){
    System.out.println("A-");
}
if(grade>85  && grade<89 ){
    System.out.println("B+");
}
if(grade>80  && grade<84 ){
    System.out.println("B");
}
if(grade>75  && grade<79 ){
    System.out.println("B-");
}
if(grade>70  && grade<74 ){
    System.out.println("C+");
}
if(grade>65  && grade<69 ){
    System.out.println("C");
}
if(grade>60  && grade<64 ){
    System.out.println("C-");
}
    }
}
