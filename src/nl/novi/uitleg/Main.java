package nl.novi.uitleg;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Shop shop1 = new Shop("C1000", "Straatweg", 1,
                "1234AB", "0612345678");

        shop1.printHelloWorld();

        Shop shop2 = new Shop("AH", "ASW", 1, "1234AB",
            "061223789");

        shop1.setName("Jumbo");

        String newNameOfShop1 = shop1.getName();

        System.out.println("De nieuwe naam van de shop: " + newNameOfShop1);

        Product productA = new Product("Ariel", 10.22, 45);
        Product productB = new Product("Witte Reus", 18.22, 46);

    }
}
