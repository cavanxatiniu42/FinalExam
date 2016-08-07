/**
 * Created by Thu Thuy Nguyen on 07/08/2016.
 */
public class Keyboard extends Product {
    private String type;
    public Keyboard(String id, String name, int price, String type) {
        super(id, name, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + "  Name: "+ this.name + "  Price: " + this.price + "  Type: " + this.type;

    }

}
