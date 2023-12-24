import java.time.LocalDate;

public abstract class Worker {
    protected String name;
    protected LocalDate birthDate;
    protected Integer number;
    protected String type;
 

    public Worker(String name, LocalDate birthDate, Integer number){

       this.name = name;
       this.birthDate = birthDate;
       this.number = number;
       this.type = getClass().getSimpleName();
    }
       


public String getName(){
    return name;
}

public LocalDate getBirthDate(){
    return birthDate;
}

public Integer getNumber(){
    return number;
}

// private void come (int time){
//     System.out.println(name + " came to work in: " + time);
// }

// private void left (int time){
//     System.out.println(name + " left his job in: " + time);
// }

// private void dayoff(){
//     System.out.println(name + " Today is not a day off ");
// }

// public void liveCircle(){
//     come(2);
//     left(9);
//     dayoff();
    
// }

@Override
public String toString() {
    return "Worker{" +
    "name='" + name + '\'' +
    ", birthDate=" + birthDate +
    ", number='" + number + '\'' +
    ", type='" + type + '\'' +
    '}';
}
}





