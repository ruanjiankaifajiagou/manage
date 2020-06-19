package org.csu.manage.persistence;

import org.csu.manage.domain.Item;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ItemMapper {

    void updateInventoryQuantity(Map<String, Object> param);

    int getInventoryQuantity(String itemId);

    List<Item> getItemListByProduct(String productId);

    Item getItem(String itemId);

    void updateItem(Item item);

    void insertItem(Item item);

    void insertItemQuantity(Item item);

    void deleteItem(Item item);

    void deleteItemQuantity(Item item);

}
