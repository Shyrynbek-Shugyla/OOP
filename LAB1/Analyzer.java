import java.util.InputMismatchException;
import java.util.Scanner;
 class Data {
    private int count;
    private double sum;
    private double max;

    public Data() {
        count = 0;
        sum = 0.0;
        max = Double.NEGATIVE_INFINITY;
    }
    public void add(double value){
count++;
sum += value;
if(value>max){
    max = value;
}
    }
    public double getAverage(){
if(count == 0){
    return 0.0;
}
return sum/count;
    }

    public double getMax(){
        if(count == 0){
            return 0.0;
        }
        else return max;
    }
    public int getCount(){
            return count;
            }
 }
    public class Analyzer{
                public static void main(String[] args){
                    Scanner scanner = new Scanner(System.in);
                    Data data = new Data();
while(true){
    System.out.print("Enter number (Q to quit): ");
    String input = scanner.nextLine().trim();
    if(input.equalsIgnoreCase("Q")){
        break;
    }
    try{
        double value = Double.parseDouble(input);
        data.add(value);
    }
    catch(NumberFormatException e){
System.out.println("Invalid input, please enter a number or Q to quit.");
    }

}
if(data.getCount()>0){
    System.out.println("Average = " + data.getAverage());
    System.out.println("Maximum = " + data.getMax());
}
else{
    System.out.println("No data entered");
                }
                scanner.close();
            }
        }
    