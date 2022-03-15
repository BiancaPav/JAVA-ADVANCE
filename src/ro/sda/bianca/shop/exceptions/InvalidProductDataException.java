package ro.sda.bianca.shop.exceptions;

/**
 * 7. Exceptions**
 * - Use exceptions to validate the data passes into constructors when
 *   OsProduct,AntivirusProduct,GroceryProduct or PetsFoodProduct is called.
 */

public class InvalidProductDataException extends RuntimeException{

    public InvalidProductDataException(String message) {
        super(message);
    }
}
