package com.example.lozovabusiness;

public class BusinessItem {

    public String id, name, address, kved, stan;

    public BusinessItem() {
    }

    public BusinessItem(String id, String name, String address, String kved, String stan) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.kved = kved;
        this.stan = stan;
    }

    public String toString(){
        return  "User: " + name + " - "  + ". Адреса: " + address + ". КВЕД: " + kved + ". Стан:" + stan;
    }
}
