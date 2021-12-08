package com.itvdn.javaEssential.petrov.lesson009.homeWork.device;

import java.util.Objects;

public class Device {
    private String manufacturer;
    private float price;
    private String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = result * prime + (manufacturer != null ? manufacturer.hashCode() : 0);
        result = result * prime + Float.floatToIntBits(price);
        result = result * prime + (serialNumber != null ? serialNumber.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Device device = (Device) obj;
        return (manufacturer == device.manufacturer || (manufacturer != null && manufacturer.equals(device.manufacturer))) &&
                price == device.price &&
                (serialNumber == device.serialNumber || (serialNumber != null && serialNumber.equals(device.serialNumber)));
    }

    @Override
    public String toString() {
        return String.format("%s: manufacturer=%s, price=%.2f, serialNumber=%s",
                getClass().getSimpleName(), manufacturer, price, serialNumber);
    }
}
