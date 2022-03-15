package ro.sda.bianca.shop.model.product;

import ro.sda.bianca.shop.exceptions.InvalidProductDataException;
import ro.sda.bianca.shop.model.Currency;

import java.util.Date;

/**
 * 6. Inheritance**
 * - create new classes that will inherit the FoodProduct class
 * - GroceryProduct
 */

public class GroceryProduct extends FoodProduct {

    private double price;
    private Currency currency;
    private String name;
    private String description;

    public GroceryProduct(
            Date expirationDate,
            boolean isBio,
            String countryOfOrigin,
            double price,
            Currency currency,
            String name,
            String description
    ) {
        super(expirationDate, isBio, countryOfOrigin);
        if (price > 0) {
            this.price = price;
        } else {
            throw new InvalidProductDataException("Price is negative or 0.");
        }

        if (currency != null) {
            this.currency = currency;
        } else {
            throw new InvalidProductDataException("Currency is null.");
        }
        if(name != null && name.isBlank()) {
            this.name = name;
        }else
            throw new InvalidProductDataException("Name is null or blank");
        if(description != null && description.isBlank()){
            this.description = description;
        }else{
            throw new InvalidProductDataException("Description is null or blank");
        }
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
