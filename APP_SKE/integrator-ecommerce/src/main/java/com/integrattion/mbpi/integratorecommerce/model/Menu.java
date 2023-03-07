package com.integrattion.mbpi.integratorecommerce.model;

public class Menu {
    private Integer id;
    private String nameItem;

    public Menu(Integer id, String nameItem) {
        this.id = id;
        this.nameItem = nameItem;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

}
