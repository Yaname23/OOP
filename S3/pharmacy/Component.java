package pharmacy;
// import org.jetbrains.annotations.NotNull;
import java.util.Objects;
import java.util.HashSet;

public abstract class Component implements Comparable<Component>{
    protected String name;
    protected String weight;
    protected int power;
    

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public Component(Component pharmacy){
        this.name = pharmacy.name;
        this.power = pharmacy.power;

    }

    public String getName(){
        return name;
    }
    
    public String getWeight(){
        return weight;
    }

    public int getPower(){
        return power;
    }

    @Override
    public boolean equals(Object o){
        if (this ==o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Component pharmacy =(Component) o;
        return power == pharmacy.power && Object.equals(name, pharmacy.name);

    }

    @Override
    public int hashCode(){
        return Object.hash(name, power);

    }

    

    }

    

    @Override
    public String toString() {
    return "Animal{" +
    "name='" + name + '\'' +
    ", weight=" + weight +
    ", power=" + power +
    '}';
    }
}
    // @Override
    // public int compareTo(@NotNull Component o){
    //     return Integer.compare(this.power, o.power);
        // if (this.power > o.power) return 1;
        // if (this.power < o.power) return -1;
        // return 0;


   