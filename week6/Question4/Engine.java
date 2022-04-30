package week6.Question4;

/**
 * Engine
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 */
public class Engine {
    private int modelNo;
    private String brand;
    private double price;

    /**
     * Engine
     * 
     * @param modelNo
     * @param brand
     * @param price
     */
    public Engine(int modelNo, String brand, double price) {
        this.modelNo = modelNo;
        this.brand = brand;
        this.price = price;
    }

    // all the getters and setters
    /**
     * getModelNo
     * 
     * @return modelNo
     */
    public int getModelNo() {
        return modelNo;
    }

    /**
     * setModelNo
     * 
     * @param modelNo
     */
    public void setModelNo(int modelNo) {
        this.modelNo = modelNo;
    }

    /**
     * getBrand
     * 
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * setBrand
     * 
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * getPrice
     * 
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * setPrice
     * 
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }
}