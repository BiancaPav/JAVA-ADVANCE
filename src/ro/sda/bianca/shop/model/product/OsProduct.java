package ro.sda.bianca.shop.model.product;

import ro.sda.bianca.shop.model.Currency;

/**
 *  (**OPTIONAL**) create new classes that will inherit the Software class:
 *   - OsProduct
 *   - AntivirusProduct
 */

public class OsProduct extends SoftwareProduct{

    private double price;
    private Currency currency;
    private String name;
    private String description;

    public OsProduct(
            boolean receivedOnMail,
            boolean sentOnDvdDisk,
            String releasedBy,
            double price,
            Currency currency,
            String name,
            String description
    ) {
        super(receivedOnMail, sentOnDvdDisk, releasedBy);
        this.price = price;
        this.currency = currency;
        this.name = name;
        this.description = description;
    }


    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public Currency getCurrency() {
        return currency;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
