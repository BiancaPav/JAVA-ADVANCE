package ro.sda.bianca.shop.model.customer;

/**
 * 3. Enums**
 * - create the enum CustomerState with some values (New, Active, Closed, Banned).
 *   Override the toString method to print the pretty name.
 * - create a method that should return if the state permits shopping
 */

public enum CustomerState {
    NEW("New", false),
    ACTIVE("Active", true),
    CLOSED("Closed", false),
    BANNED("Banned", false);

    private String prettyName;
    private boolean permitsShopping;

    CustomerState(String prettyName, boolean permitsShopping) {
        this.prettyName = prettyName;
        this.permitsShopping = permitsShopping;
    }

    public boolean isPermitsShopping() {
        return permitsShopping;
    }

    @Override
    public String toString() {
        return prettyName;
    }
}
