package com.itvdn.javaEssential.petrov.lesson009.homeWork.device;

public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;
    private int ethernetAdapter;
    private String mac;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY, int ethernetAdapter, String mac) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
        this.ethernetAdapter = ethernetAdapter;
        this.mac = mac;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    public int getEthernetAdapter() {
        return ethernetAdapter;
    }

    public void setEthernetAdapter(int ethernetAdapter) {
        this.ethernetAdapter = ethernetAdapter;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = result * prime + resolutionX;
        result = result * prime + resolutionY;
        result = result * prime + ethernetAdapter;
        result = result * prime + (mac != null ? mac.hashCode() : 0);
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
        Monitor monitor = (Monitor) obj;
        return (getManufacturer() == monitor.getManufacturer() || (getManufacturer() != null && getManufacturer().equals(monitor.getManufacturer()))) &&
                getPrice() == monitor.getPrice() &&
                (getSerialNumber() == monitor.getSerialNumber() || (getSerialNumber() != null && getSerialNumber().equals(monitor.getSerialNumber()))) &&
                resolutionX == monitor.resolutionX &&
                resolutionY == monitor.resolutionY &&
                ethernetAdapter == monitor.ethernetAdapter &&
                (mac == monitor.mac || (mac != null && mac.equals(monitor.mac)));
    }

    @Override
    public String toString() {
        return String.format("%s, X=%d, Y=%d", super.toString(), resolutionX, resolutionY);
    }
}
