// area perimetr length of diogonal
import java.util.Scanner;
public class task2 {

    public static void main(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
int area = a*a;
int perimeter = a+a;
double diagonal = a*(Math.sqrt(2));
System.out.println("Area: "+ area);
System.out.println("Perimeter: "+ perimeter);
System.out.println("Diagonal: "+diagonal);
    }
}