import java.util.Scanner;
import java.util.Arrays;
public class Fruit extends Product{
    private double Weight;
    private double[] weightArray = new double[10];
    // control layer variable
    int indexF = 0;
    public Fruit(String name, double price, int idprod, double weight) {
        super(name, price, idprod, (int) weight);
        Weight = weight;
    }
    public Fruit(){

    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double weight) {
        Weight = weight;
    }
    int RegisterFruit(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the fruit weight(g): ");
        Weight = in.nextDouble();
        weightArray[indexF] = Weight;
        System.out.println("Fruit registered successfully.");
        return indexF++;
    }
    void listFruit(int listType){
        Scanner in = new Scanner(System.in);
        System.out.println("Do you want to list by which parameter: ");
        System.out.println("1. By Weight");
        listType = in.nextInt();
        if(listType==1){
            System.out.println(Arrays.toString(weightArray));
        }

    }
}
