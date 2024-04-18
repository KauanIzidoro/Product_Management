import java.util.Scanner;
import java.lang.String;
import java.util.Arrays;
public class Product {
        String name;
        String[] nameArray = new String[30];
        double price;
        double[] priceArray = new double[30];
        int idprod;
        int[] idArray = new int[30];
        // control layer variable
        int layer = 0;
    public Product(String name, double price, int idprod, int layer) {
        this.name = name;
        this.price = price;
        this.layer = layer;
        this.idprod = idprod;
    }
    public Product(){

    }
    public int getIdprod(){
        return idprod;
    }
    public void setIdprod(){
    }

    public Product(String name, double price, int power, String brand) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void setLayer(int layer){
        this.layer = layer;
    }
    public int getLayer(){
        return layer;
    }
    public int RegisterP(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the product name: ");
        name = in.nextLine();
        nameArray[layer] = name;
        System.out.println("Enter the product price: ");
        price = in.nextDouble();
        priceArray[layer] = price;
        System.out.println("Enter the product ID: ");
        idprod = in.nextInt();
        idArray[layer] = idprod;
        return layer++;
    }
    public void ListP(int listType){
        Scanner in = new Scanner(System.in);
        System.out.println("Do you want to list by which parameter: ");
        System.out.println("1. Most expensive to cheapest");
        System.out.println("2. Most cheapest to expansive");
        System.out.println("3. By ID  0...n-1");
        System.out.println("4. By ID  n-1...0");
        System.out.println("5. All products");
        listType = in.nextInt();
        if(listType==1){ //list by price - more expansive
            Arrays.sort(priceArray);
            System.out.println(Arrays.toString(priceArray));
        }else if(listType==2){ //list by price - more cheap
            Arrays.sort(priceArray);
            double[] aux = new double[layer];
            for(int i=layer;i>=0;i--){
                aux[layer-i] = priceArray[i];
            }
            System.out.println(Arrays.toString(aux));
        }else if(listType==3){
            Arrays.sort(idArray); //0...n-1
            System.out.println(Arrays.toString(idArray));
        }else if(listType==4){
            Arrays.sort(idArray);
            int[] auxID = new int[layer];
            for(int i=layer;i>=0;i--){
                auxID[layer-i] = idArray[i];
            }
            System.out.println(Arrays.toString(auxID)); //n-1...0
        }else if(listType==5){
            System.out.println(Arrays.toString(nameArray));
            System.out.println(Arrays.toString(idArray));
            System.out.println(Arrays.toString(priceArray));
        }

    }

}
