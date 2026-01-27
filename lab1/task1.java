import java.util.Scanner;
public class task1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String  name = sc.next();

System.out.print('+');
int num = name.length();
int count = 0;
while (count<num) {
    System.out.print('-');
    count++;
}
System.out.println('+');
System.out.print('|');
System.out.print(name);
System.out.println('|');
System.out.print('+');
int count2 = 0;
while (count2<num) {
    System.out.print('-');
    count2++;
}
System.out.println('+');
    }
}