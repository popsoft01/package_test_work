package Com.mobilePhone;

public class MobilePhone {
    private String imei;
    private String make;
    private PhoneManufacturer model;
    private int storageSpace;
    private final String INVALID_IMEI = "INVALID_IMEI";

    public MobilePhone(String imei) {
        if (imei == ""){
            this.imei = INVALID_IMEI;
        }else { this.imei = imei;}
    }
    public MobilePhone(String imei, String make) {
       this(imei);
        this.make = make;
    }

    public MobilePhone(String imei, String make, PhoneManufacturer model) {
        this(imei,make);
        this.model = model;
    }

    public MobilePhone(String imei, String make, PhoneManufacturer model, int storageSpace) {
        this(imei,make,model);
        this.storageSpace = storageSpace;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public PhoneManufacturer getModel() {
        return model;
    }

    public void setModel(PhoneManufacturer model) {
        this.model = model;
    }

    public int getStorageSpace() {
        return storageSpace;
    }

    public void setStorageSpace(int storageSpace) {
        this.storageSpace = storageSpace;
    }
}
