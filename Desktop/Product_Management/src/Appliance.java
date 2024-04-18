import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Appliance extends Product{
    private int Power;
    private int[] powerArray = new int[10];
    private String brand;
    public String[] brandArray = new String[10];
    //control layer variable
    int indexA = 0;
    public Appliance(String name, double price, String idprod, int power, String brand) {
        super(name, price, power, brand);
        Power = power;
        this.brand = brand;
    }
    public Appliance(){

    }

    public int getPower() {
        return Power;
    }

    public void setPower(int power) {
        Power = power;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    void RegisterAppliance(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Appliance brand: ");
        brand = in.nextLine();
        brandArray[indexA] = brand;
        System.out.println("Enter the Appliance power: ");
        Power = in.nextInt();
        powerArray[indexA] = Power;
        System.out.println("Appliance registered successfully.");
        indexA++;
    }
    void listAppliance(int listType){
        Scanner in = new Scanner(System.in);
        System.out.println("Do you want to list by which parameter: ");
        System.out.println("1. By power");
        System.out.println("2. By brand");
        listType = in.nextInt();
        if(listType==1){
            Arrays.sort(powerArray);
            System.out.println(Arrays.toString(powerArray));
        }else if(listType==2){
            List list = Arrays.asList(brandArray);
            Collections.sort(list);
            System.out.println(Arrays.toString(brandArray));
        }



    }
}
