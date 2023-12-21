import java.time.LocalDate;
import java.util.List;

public class Animal {
    protected String name;
    protected LocalDate birthDate;
    protected List <String> vaccinations;
    protected String illness;
    protected String owner;
    protected Integer go;
    protected Integer fly;
    protected Integer swim;

    public Animal(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner, Integer go, Integer fly,
    Integer swim){

       this.name = name;
       this.birthDate = birthDate;
       this.vaccinations = vaccinations;
       this.illness = illness;
       this.owner = owner;
       this.go = go;
       this.fly = fly;
       this.swim = swim;
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

public Integer getgo(){
    return go;
}

public Integer getfly(){
    return fly;
}

public Integer getswim(){
    return swim;
}

private void wakeup (){
    System.out.println(name + " is wakeup!!!");
}

// private void wakeup (int time){
//     System.out.println(name + " is wakeup in: " + time);
// }

// Добавить в класс Animal методы двигаться(toGo), летать(fly), плавать(swim).

private void toGo (){
    if ((go <= 0)) System.out.println("This animal doesn't walk");
    else System.out.println(name + " walked");
}

private void fly (){
    if ((fly <= 0)) System.out.println("This animal doesn't fly");
    else System.out.println(name + " flown");
    
}

private void swim (){
    if ((swim <= 0)) System.out.println("This animal doesn't swim");
    else System.out.println(name + " swam");
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
    toGo();
    fly();
    swim();
}

@Override
public String toString() {
    return "Animal{" +
    "name='" + name + '\'' +
    ", birthDate=" + birthDate +
    ", vaccinations=" + vaccinations +
    ", illness='" + illness + '\'' +
    ", owner='" + owner + '\'' +
    ", go='" + go + '\'' +
    ", fly='" + fly + '\'' +
    ", swim='" + swim + '\'' +
    '}';
}


}



