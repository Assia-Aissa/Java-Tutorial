package serie4collections.Manage_Trains;

public abstract class Wagon {

    private String code;
    private String description;

    public Wagon(String code,String description){
        this.code=code;
        this.description=description;

    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
