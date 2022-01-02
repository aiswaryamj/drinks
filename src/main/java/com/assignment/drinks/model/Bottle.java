package com.assignment.drinks.model;

import javax.persistence.*;

@Entity
@Table(name = "bottle")
public class Bottle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "bottle_pic")
    private String bottlePic;

    @Column(name = "volume")
    private String volume;

    @Column(name = "is_alcoholic")
    private String isAlcoholic;

    @Column(name = "volume_percent")
    private String volumePercent;

    @Column(name = "price")
    private String price;

    @Column(name = "supplier")
    private String supplier;

    @Column(name = "in_stock")
    private String inStock;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBottlePic() {
        return bottlePic;
    }

    public void setBottlePic(String bottlePic) {
        this.bottlePic = bottlePic;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getIsAlcoholic() {
        return isAlcoholic;
    }

    public void setIsAlcoholic(String isAlcoholic) {
        this.isAlcoholic = isAlcoholic;
    }

    public String getVolumePercent() {
        return volumePercent;
    }

    public void setVolumePercent(String volumePercent) {
        this.volumePercent = volumePercent;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getInStock() {
        return inStock;
    }

    public void setInStock(String inStock) {
        this.inStock = inStock;
    }
}