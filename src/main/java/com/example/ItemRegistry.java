package com.example;

public class ItemRegistry {

    public static void main(String[] args) {

        var item1 = new StoreItem.ItemBuilder("PIZZA", 9.0d)
                .shortDescription("cheesy")
                .longDescription(null)
                .stockAvailable(2)
                .packagingType("Frozen")
                .build();
        var item2 = new StoreItem.ItemBuilder("TACOS", 9.0d)
                .shortDescription("cheesy")
                .longDescription(null)
                .stockAvailable(2)
                .packagingType("Frozen")
                .build();

        addToItemRegistry(item1);
        addToItemRegistry(item2);
    }

    private static void addToItemRegistry(StoreItem storeItem) {
        System.out.println("A new item was added to the registry: \n" + storeItem);
    }

}
