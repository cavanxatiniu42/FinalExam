
public class Cpu extends Product{
    private float freq;
    public Cpu(String id, String name, int price, float freq) {
        super(id, name, price);
        this.freq = freq;
    }

    public float getFreq() {
        return freq;
    }

    public void setFreq(float freq) {
        this.freq = freq;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + "  Name: "+ this.name + "  Price: " + this.price + "  Freq: " + this.freq;
    }
}
