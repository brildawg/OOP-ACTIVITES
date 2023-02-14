    import java.util.ArrayList;
    import java.util.Scanner;

    public class arraylist {
        public static void main(String[] args) {
            ArrayList<String> beverageList = new ArrayList<>();
            beverageList.add("coke");
            beverageList.add("royale");
            beverageList.add("sarsi");
            beverageList.add("sprite");

            ArrayList<Integer> priceList = new ArrayList<>();
            priceList.add(20);
            priceList.add(19);
            priceList.add(23);
            priceList.add(21);

            ArrayList<String> purchasedBeverage = new ArrayList<>();
            ArrayList<Integer> purchasedPrice = new ArrayList<>();
            Scanner scan = new Scanner(System.in);

            while (true) {
                System.out.print("Beverage available: ");
                for (int i = 0; i < beverageList.size(); i++) {
                    System.out.print(beverageList.get(i) + "=" + priceList.get(i)+" ");
                }

                System.out.print("\nPurchase beverage: ");
                String beverage = scan.nextLine();

                if (beverageList.contains(beverage)) {
                    int index = beverageList.indexOf(beverage);
                    int price = priceList.get(index);

                    purchasedBeverage.add(beverage);
                    purchasedPrice.add(price);
                    
                    int total =0;
                    System.out.print("Do you want to add more? Yes or No  ");
                    String choice = scan.nextLine();
                    if (choice.equalsIgnoreCase("no")) {
                        System.out.println("Please pay your beverage: ");
                        for (int i = 0; i < purchasedBeverage.size(); i++) {
                            System.out.println(purchasedBeverage.get(i) + " Php " + purchasedPrice.get(i));
                            total = total + purchasedPrice.get(i);

                        }
                        System.out.println("Total Price: " + total);
                        break;
                        
                    }
                    else if(!choice.equalsIgnoreCase("yes")){
                        System.out.println("Choice Invalid");
                        break;
                    }
                } else {
                    System.out.println("Invalid input, please try again.");
                }
                
                }
                scan.close();
            }
        }

