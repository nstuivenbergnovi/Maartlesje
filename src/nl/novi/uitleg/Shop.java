package nl.novi.uitleg;

public class Shop {
    //naam (String), straatnaam, huisnummer(Int of String), postcode en het telefoonnummer (String)
    // Eigenschappen
    // Dit is Shop
    private String name;
    private String streetName;
    private int houseNumber;
    private String postalCode;
    private String phoneNumber;
    private String faxNumber;

    public Shop(String name, String streetName, int houseNumber,
                String postalCode, String phoneNumber) {
        this.name = name;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
    }

    // Gedrag -> methodes
    // Getter en setter van Name
    public void printHelloWorld() {
        System.out.println("Hello World");
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }
}
