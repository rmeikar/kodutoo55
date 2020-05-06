package kodutoo5;

import java.util.Scanner;
import java.util.Hashtable;

public class ProductTester {
    private static Scanner scan = new Scanner(System.in);
    private static Hashtable<Integer, Product> products = new Hashtable<Integer, Product>();
    private static void addProduct(Product product, int units){
        if (products.containsKey(product.getNumber())){
            product.setUnits(product.getUnits() + units);
            products.put(product.getNumber(), product);
        }else {
            addProduct(product);
        }
    }
    private static void addProduct(Product product){
        products.put(product.getNumber(), product);
    }
    private static void createNewProduct(){
        System.out.println("Add a new product ( y / n )?");
        if (scan.nextLine().equals("y")){
            String name;
            int units;
            double price;
            System.out.println("Insert product name: ");
            name = scan.nextLine();
            System.out.println("Insert product amount (int): ");
            units = scan.nextInt();
            scan.nextLine();
            System.out.println("Insert product price (double): ");
            price = scan.nextDouble();
            scan.nextLine();
            addProduct(new Product(name, units, price));
        }
    }
    private static void addMoreProduct(){
        System.out.println("Add more existing product? ( y / n )");
        if (scan.nextLine().equals("y")){
            int key;
            int units;
            System.out.println("Which product number? (int)");
            key = scan.nextInt();
            scan.nextLine();
            System.out.println("How many? (int)");
            units = scan.nextInt();
            scan.nextLine();
            addProduct(products.get(key), units);
        }
    }


    private static void addVendor(){
        System.out.println("Add a new vendor to a product ( y / n )?");
        if (scan.nextLine().equals("y")){
            Vendor vendor = new Vendor();
            System.out.println("Which product number? (int) ");
            Product product = products.get(scan.nextInt());
            scan.nextLine();
            System.out.println("Insert vendor name: ");
            vendor.setCompName(scan.nextLine());
            System.out.println("Insert vendor address: ");
            vendor.setAddress(scan.nextLine());
            System.out.println("Insert vendor contact: ");
            vendor.setRepName(scan.nextLine());
            System.out.println("Insert vendor number (int): ");
            vendor.setPhoneNr(scan.nextInt());
            scan.nextLine();
            product.setVendor(vendor);
        }
    }

    private static void listProducts(){
        System.out.println("List products with gold plating? ( y / n )");
        if (scan.nextLine().equals("y")) {

            for (Integer key : products.keySet()) {
                Golden output = new Golden(key, products.get(key).getName(), products.get(key).getUnits(), products.get(key).getPrice(), products.get(key).getVendor());
                System.out.println(output.toString());
            }
        }else {
            for (Integer key : products.keySet()) {
                System.out.println(products.get(key).toString());
            }
        }
    }

    public static void main(String[] args) {

        Product auto = new Product( "Auto", 25, 500.60);
        Product lennuk = new Product( "Lennuk", 3, 1350.99);
        Product rong = new Product( "Rong", 6, 1443.64);
        Product paat = new Product( "Paat", 14, 235.55);
        Product rakett = new Product( "Rakett", 3, 14000.50);
        Product laev = new Product( "Laev", 6, 2400.00);

        addProduct(auto);
        addProduct(lennuk);
        addProduct(rong);
        addProduct(paat);
        addProduct(rakett);
        addProduct(laev);

        do {
            createNewProduct();
            addMoreProduct();
            addVendor();
            listProducts();
            System.out.println("Would you like to continue? ( y / n )");
        } while (!scan.nextLine().equals("n"));
    }
}
