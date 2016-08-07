/**
 * Created by Thu Thuy Nguyen on 07/08/2016.
 */
public class Case extends Product {
    private Ram ram;
    private Cpu cpu;

    public Case (String id, String name, int price, Ram ram, Cpu cpu){
        super(id, name, price);
        this.ram = ram;
        this.cpu = cpu;

    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + "  Name: "+ this.name + "  Price: " + this.price + "  Ram: " + this.ram + "  Cpu: "+this.cpu;
    }
}
