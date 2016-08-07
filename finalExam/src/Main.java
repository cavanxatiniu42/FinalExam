
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Product> listProduct = new ArrayList<>();
        ProductManagement productManagement = new ProductManagement(listProduct);
        int choice;
        do {
            System.out.println("1. Add product");
            System.out.println("2. Remove product");
            System.out.println("3. Find product by name");
            System.out.println("4. Sort by price");
            System.out.println("5. Sort by Name");
            System.out.println("6. Show all product");
            System.out.println("0. Exit");

            switch (choice = input.nextInt()){
                case 1:
                    System.out.println("1. Add Case");
                    System.out.println("2. Add Cpu");
                    System.out.println("3. Add Keyboard");
                    System.out.println("4. Add Monitor");
                    System.out.println("5. Add Mouse");
                    System.out.println("6. Add Ram");
                    System.out.println("0. Exit");


                    switch (choice = input.nextInt()) {

                        case 1:
                            input.nextLine();
                            System.out.println("ID: ");
                            String caseID = input.nextLine();
                            System.out.println("Name: ");
                            String caseName = input.nextLine();
                            System.out.println("Price: ");
                            int casePrice = input.nextInt();

                            input.nextLine();
                            System.out.println("Add Ram: ");
                            System.out.println("ID: ");
                            String ramID = input.nextLine();
                            System.out.println("Name: ");
                            String ramName = input.nextLine();
                            System.out.println("Price: ");
                            int ramPrice = input.nextInt();
                            System.out.println("Capacity: ");
                            int ramCapacity = input.nextInt();
                            Ram ram = new Ram(ramID, ramName, ramPrice, ramCapacity);

                            input.nextLine();
                            System.out.println("Add CPU");
                            System.out.println("ID: ");
                            String cpuID = input.nextLine();
                            System.out.println("Name:");
                            String cpuName = input.nextLine();
                            System.out.println("Price: ");
                            int cpuPrice = input.nextInt();
                            System.out.println("Freq: ");
                            float cpuFreq = input.nextFloat();
                            Cpu cpu = new Cpu(cpuID, cpuName, cpuPrice, cpuFreq);

                            Product productCase = new Case(caseID, caseName, casePrice, ram, cpu);
                            if (productManagement.addProduct(productCase)) {
                                System.out.println("Successful");
                            } else {
                                System.out.println("Fail");
                            }
                            break;
                        case 2:
                            input.nextLine();
                            System.out.println("Add CPU");
                            System.out.println("ID: ");
                            String ID = input.nextLine();
                            System.out.println("Name: ");
                            String name = input.nextLine();
                            System.out.println("Price: ");
                            int price = input.nextInt();

                            System.out.println("Freq: ");
                            float cpuFREG = input.nextFloat();
                            Product productCpu = new Cpu(ID, name, price, cpuFREG);
                            if (productManagement.addProduct(productCpu)) {
                                System.out.println("Successful");
                            } else {
                                System.out.println("Fail");
                            }
                            break;
                        case 3:
                            input.nextLine();
                            System.out.println("Add Keyboard");
                            System.out.println("ID: ");
                            String keyboardID = input.nextLine();
                            System.out.println("Name: ");
                            String keyboardName = input.nextLine();
                            System.out.println("Price: ");
                            int keyboardPrice = input.nextInt();
                            System.out.println("Type: ");
                            String type = input.nextLine();
                            Product productKeyboard = new Keyboard(keyboardID, keyboardName, keyboardPrice, type);
                            if (productManagement.addProduct(productKeyboard)) {
                                System.out.println("Successful");
                            } else {
                                System.out.println("Fail");
                            }
                            break;
                        case 4:
                            input.nextLine();
                            System.out.println("Add Monitor");
                            System.out.println("ID: ");
                            String monitorID = input.nextLine();
                            System.out.println("Name: ");
                            String monitorName = input.nextLine();
                            System.out.println("Price: ");
                            int monitorPrice = input.nextInt();
                            System.out.println("Resolution: ");
                            String res = input.nextLine();
                            Product productMonitor = new Monitor(monitorID, monitorName, monitorPrice, res);
                            if (productManagement.addProduct(productMonitor)) {
                                System.out.println("Successful");
                            } else {
                                System.out.println("Fail");
                            }
                            break;
                        case 5:
                            input.nextLine();
                            System.out.println("Add Mouse");
                            System.out.println("ID: ");
                            String mouseID = input.nextLine();
                            System.out.println("Name: ");
                            String mouseName = input.nextLine();
                            System.out.println("Price: ");
                            int mousePrice = input.nextInt();
                            System.out.println("Type: ");
                            String mouseType = input.nextLine();
                            Product productMouse = new Mouse(mouseID, mouseName, mousePrice, mouseType);
                            if (productManagement.addProduct(productMouse)) {
                                System.out.println("Successful");
                            } else {
                                System.out.println("Fail");
                            }
                            break;
                        case 6:
                            input.nextLine();
                            System.out.println("Add Ram ");
                            System.out.println("ID: ");
                            String ramId = input.nextLine();
                            System.out.println("Name: ");
                            String ramNAME = input.nextLine();
                            System.out.println("Price: ");
                            int ramPRICE = input.nextInt();
                            System.out.println("Capacity: ");
                            int cap = input.nextInt();
                            Product productRam = new Ram(ramId, ramNAME, ramPRICE, cap);
                            if (productManagement.addProduct(productRam)) {
                                System.out.println("Successful");
                            } else {
                                System.out.println("Fail");
                            }
                            break;

                    }
                    break;
                case 2:
                    input.nextLine();
                    System.out.println("Input ID want to remove: ");
                    String deleteID = input.nextLine();
                    if (productManagement.removeProduct(deleteID)){
                        System.out.println("Successful");
                    } else {
                        System.out.println("Fail");
                    }
                    break;
                case 3:
                    input.nextLine();
                    System.out.println("Input name of product want to find: ");
                    String foundName = input.nextLine();
                    System.out.println(productManagement.findProductByName(foundName));
                    break;
                case 4:
                    System.out.println("List sorted by name: ");
                    productManagement.sortProductByName();
                    break;
                case 5:
                    System.out.println("List sorted by price: ");
                    productManagement.sortProductByPrice();
                    break;
                case 6:
                    productManagement.showAllProduct();
                    break;

            }
        } while (choice != 0);
    }
}
