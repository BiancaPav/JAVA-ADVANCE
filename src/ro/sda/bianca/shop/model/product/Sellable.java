package ro.sda.bianca.shop.model.product;

import ro.sda.bianca.shop.model.Currency;

/**
 * 4. Interface**
 * - create the interface Sellable with the fallowing methods:
 *     - getPrice()
 *     - getCurrency()
 *     - getName()
 *     - getDescription()
 *     - getProductCategory()
 */

public interface Sellable {  // in interfata totul este public si nu mai trebuie scris. este by default

    double getPrice();

    Currency getCurrency();

    String getName();

    String getDescription();

    ProductCategory getProductCategory();

}
