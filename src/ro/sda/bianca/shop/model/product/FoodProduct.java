package ro.sda.bianca.shop.model.product;

import ro.sda.bianca.shop.exceptions.InvalidProductDataException;

import java.util.Date;

/**
 * 5. Abstarct class**
 * - create the abstract class FoodProduct  that implements Sellable and encapsulates the fallowing data:
 *     - expirationDate: date
 *     - isBio: boolean
 *     - countryOfOrigin: String
 *     - create a constructor that will accept all the fields as parameters
 *     - add getters for all the fields
 */

public abstract class FoodProduct implements Sellable{
    private Date expirationDate;
    private boolean isBio;
    private String countryOfOrigin;

    public FoodProduct(Date expirationDate, boolean isBio, String countryOfOrigin) {
        if(expirationDate != null && expirationDate.after(new Date())){ //expdate in viitor
            this.expirationDate = expirationDate;
        }else{
            throw new InvalidProductDataException("Product is expired.");
        }

        this.isBio = isBio;

        if(countryOfOrigin != null && ! countryOfOrigin.isBlank()){
            this.countryOfOrigin = countryOfOrigin;
        }else{
            throw new InvalidProductDataException("Country of origin is null or empty");
        }

    }

    @Override
    public ProductCategory getProductCategory() {
        return ProductCategory.FOOD;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean isBio() {
        return isBio;
    }

    public void setBio(boolean bio) {
        isBio = bio;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }
}
