package nl.novi.uitleg;

public class Product {
    private String name;
    private double price;
    private int articleNo;

    public Product(String name, double price, int articleNo) {
        this.name = name;

        if(isValidPrice(price) == true) {
            this.price = price;
        } else {
            this.price = 10.00;
        }
        this.articleNo = articleNo;
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
        if(isValidPrice(price)) {
            this.price = price;
        }
    }

    public int getArticleNo() {
        return articleNo;
    }

    public void setArticleNo(int articleNo) {
        this.articleNo = articleNo;
    }

    public boolean isValidPrice(double newPrice) {
        if(newPrice > 0) {
            return true;
        } else {
            return false;
        }
    }
}

