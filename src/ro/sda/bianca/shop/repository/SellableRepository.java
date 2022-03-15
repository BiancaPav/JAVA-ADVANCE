package ro.sda.bianca.shop.repository;

import ro.sda.bianca.shop.model.product.Sellable;

import java.util.List;

/**
 * 8. Generic types**
 * - Create a generic interface for a repository that can hold items that are extending Sellable.
 * - This repository should have the fallowing methods:
 * - add(T)
 * - search(Id)
 * - remove(Id)
 * - get(Id)
 */

public interface SellableRepository<T extends Sellable> {

    void add(T sellable); //obiect de tip T sellable

    T search(String name);

    void remove(String name);

    void update(T sellable);

    List<T> getAllOrderedByPrice();

}
