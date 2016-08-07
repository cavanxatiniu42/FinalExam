
public class Monitor extends Product{
    private String resolution;

    public Monitor(String id, String name, int price, String res) {
        super(id, name, price);
        this.resolution = res;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + "  Name: "+ this.name + "  Price: " + this.price + "  Resolution: " + this.resolution;
    }
}
