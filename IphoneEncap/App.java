package IphoneEncap;
    import java.util.*;
public class App {
    static phone iphone6 = new phone();
    static phone iphone7 = new phone();
    static phone iphone8 = new phone();
    static phone iphoneX = new phone();
    
    static double discount[] = {0, 0.1, 0.2, 0.4};

    public static void main(String[] args) {
        iphone6.setName("IPhone6");
        iphone7.setName("IPhone7");
        iphone8.setName("IPhone8");
        iphoneX.setName("IPhoneX");

        iphone6.setPrice(11000.00);
        iphone7.setPrice(15000.00);
        iphone8.setPrice(23000.00);
        iphoneX.setPrice(25000.00);

        Scanner sc = new Scanner(System.in);

        System.out.println("1) IPhone 6 " + iphone6.getPrice());
        System.out.println("2) IPhone 7 " + iphone7.getPrice());
        System.out.println("3) IPhone 8 " + iphone8.getPrice());
        System.out.println("4) IPhone X " + iphoneX.getPrice());

        System.out.print("Enter the item number of the phone: ");
        int phoneChoice = sc.nextInt();

        while(phoneChoice > 4 || phoneChoice < 1){
            System.out.print("Enter the item number of the phone: ");
            phoneChoice = sc.nextInt();
        }

        System.out.println("1) Discount 0%");
        System.out.println("2) Discount 10%");
        System.out.println("3) Discount 20%");
        System.out.println("3) Discount 40%");

        System.out.print("Enter the item number for the discount: ");
        int discountChoice = sc.nextInt();

        while(discountChoice > 4 || discountChoice < 1){
            System.out.print("Enter the item number for the discount: ");
            discountChoice = sc.nextInt();
        }

        if (phoneChoice ==1){
            double totalAmount = iphone6.getPrice() - (iphone6.getPrice()*discount[discountChoice-1]);
            System.out.println("Item: " + iphone6.getName());
            System.out.println("Total Amount: " + totalAmount);
        }

        else if (phoneChoice ==2){
            double totalAmount = iphone7.getPrice() - (iphone7.getPrice()*discount[discountChoice-1]);
            System.out.println("Item: " + iphone7.getName());
            System.out.println("Total Amount: " + totalAmount);
        }

        else if (phoneChoice ==3){
            double totalAmount = iphone8.getPrice() - (iphone8.getPrice()*discount[discountChoice-1]);
            System.out.println("Item: " + iphone8.getName());
            System.out.println("Total Amount: " + totalAmount);
        }

        else if (phoneChoice ==4){
            double totalAmount = iphoneX.getPrice() - (iphoneX.getPrice()*discount[discountChoice-1]);
            System.out.println("Item: " + iphoneX.getName());
            System.out.println("Total Amount: " + totalAmount);
        }

    }

}
