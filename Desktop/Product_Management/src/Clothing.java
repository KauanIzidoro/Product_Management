import java.util.Scanner;
import java.util.Arrays;

public class Clothing extends Product{
    private String size;
    private String[] sizeArray = new String[10];
    private String color;
    private String[] colorArray = new String[10];
    //control layer variable
    int indexC = 0;
    public Clothing(String name, double price, String idprod, String size, String color) {
        super(name, price, Integer.parseInt(size), color);
        this.size = size;
        this.color = color;
    }
    public Clothing(){

    }

    public String getSize() {

        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }
    int RegisterClothing(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the clothing size: ");
        size = in.nextLine();
        sizeArray[indexC] = size;
        System.out.println("Enter the clothing color: ");
        color = in.nextLine();
        colorArray[indexC] = color;
        System.out.println("Appliance registered successfully.");
        return indexC++;
    }
    void listClothing(int listType){
        Scanner in = new Scanner(System.in);
        System.out.println("Do you want to list by which parameter: ");
        System.out.println("1. By Size");
        System.out.println("2. By Color");
        listType = in.nextInt();
        if(listType==1){
            System.out.println(Arrays.toString(sizeArray));
        }else{
            System.out.println(Arrays.toString(colorArray));
        }




    }
}


