package com.example.myapplication;

public class Good {
    private  String name;
    private String shopName;
    private int imageGood;

    public Good(String name, String shopName, int imageGood) {
        this.name = name;
        this.shopName = shopName;
        this.imageGood = imageGood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int getImageGood() {
        return imageGood;
    }

    public void setImageGood(int imageGood) {
        this.imageGood = imageGood;
    }
}
