package hospitalManagementApplication.Entity;

public class Medicine {
    private long id;
    private String medicineName;
    private String companyName;
    private String type;
    private String description;

    public Medicine() {
    }

    public Medicine(long id, String medicineName, String companyName, String type, String description) {
        this.id = id;
        this.medicineName = medicineName;
        this.companyName = companyName;
        this.type = type;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "id=" + id +
                ", medicineName='" + medicineName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
