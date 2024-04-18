import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // instantiating the classes
        Scanner in = new Scanner(System.in);
        Product P0 = new Product();
        Fruit F0 = new Fruit();
        Appliance A0 = new Appliance();
        Clothing C0 = new Clothing();
        // menu variable
        int UserChoice = 0;
        int UserChoiceRegister = 0;
        int UserChoiceList = 0;
        int listType = 0;
        do {
            System.out.println("╔════════════════════════════════╗");
            System.out.println("║    PRODUCT MANAGEMENT SYSTEM   ║");
            System.out.println("╠════════════════════════════════╣");
            System.out.println("║ 1. Register new product        ║");
            System.out.println("║ 2. List products               ║");
            System.out.println("║ 3. Delete product              ║");
            System.out.println("║ 4. Count products              ║");
            System.out.println("║ 5. Search                      ║");
            System.out.println("║ 6. Exit                        ║");
            System.out.println("╚════════════════════════════════╝");
            UserChoice = in.nextInt();
            switch (UserChoice) {
                case 1:
                    System.out.println("Which product do you want to register? ");
                    System.out.println("1. Appliance");
                    System.out.println("2. Clothing");
                    System.out.println("3. Fruit");
                    UserChoiceRegister = in.nextInt();
                    switch (UserChoiceRegister){
                        case 1:
                            P0.RegisterP();
                            A0.RegisterAppliance();
                            break;
                        case 2:
                            P0.RegisterP();
                            C0.RegisterClothing();
                            break;
                        case 3:
                            P0.RegisterP();
                            F0.RegisterFruit();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("How do you want to list the products: ");
                    System.out.println("1. All products");
                    System.out.println("2. list by Appliances");
                    System.out.println("3. list by Clothing");
                    System.out.println("4. list by Fruits");
                    UserChoiceList = in.nextInt();
                    switch (UserChoiceList){
                        case 1:
                            P0.ListP(listType);
                            break;
                        case 2:
                            A0.listAppliance(listType);
                            break;
                        case 3:
                            C0.listClothing(listType);
                            break;
                        case 4:
                            F0.listFruit(listType);
                            break;

                    }
                    break;
                case 3:
                    System.out.println("default");
                    break;
                case 4:
                    System.out.println("default");
                    break;
                case 5:
                    System.out.println("default");
                    break;
                case 6:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("default");
                    break;
            }
        }
        while (UserChoice != 6);
    }
}

