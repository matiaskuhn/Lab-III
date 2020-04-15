package com.company.Punto2;

import java.util.UUID;

public class ItemVenta {
    private UUID idItem;
    private String name;
    private String description;
    private float unitPrice;

    public ItemVenta(String name, String description, float unitPrice) {
        this.idItem=UUID.randomUUID();
        this.name=name;
        this.description=description;
        this.unitPrice=unitPrice;
    }

    public UUID getIdItem() {
        return idItem;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public float getUnitPrice() {
        return unitPrice;
    }
}
