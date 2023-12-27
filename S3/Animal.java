import java.time.LocalDate;
import java.util.List;

public abstract class Animal {
    protected String name;
    protected LocalDate birthDate;
    protected List <String> vaccinations;
    protected String illness;
    protected String owner;
    protected String type;
 

    public Animal(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner){

       this.name = name;
       this.birthDate = birthDate;
       this.vaccinations = vaccinations;
       this.illness = illness;
       this.owner = owner;
       this.type = getClass().getSimpleName();
    }
       


public String getName(){
    return name;
}

public LocalDate getBirthDate(){
    return birthDate;
}

public List<String> getVaccinations(){
    return vaccinations;
}

public String getIllness(){
    return illness;
} 

public String getOwer(){
    return owner;
}


private void wakeup (){
    System.out.println(name + " is wakeup!!!");
}


private void eat (){
    System.out.println(name + " ate " );
}

private void play(){
    System.out.println(name + " played ");
}

private void sleep(){
    System.out.println(name + " sleeping ");
}

public void liveCircle(){
    wakeup();
    eat();
    play();
    sleep();
}

@Override
public String toString() {
    return "Animal{" +
    "name='" + name + '\'' +
    ", birthDate=" + birthDate +
    ", vaccinations=" + vaccinations +
    ", illness='" + illness + '\'' +
    ", owner='" + owner + '\'' +
    ", type='" + type + '\'' +
    '}';
}
}





