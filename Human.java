package homework9;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    long unix_time;
    //1322018752992l
    private String birthDate;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private Map<DayOfWeek,String> schedule;

    private Family family;

    Calendar cal = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Human(String name, String surname, long unix_time, int iq) {
        cal.setTimeInMillis(unix_time);
        cal.add(Calendar.DATE,0);
        Date date = cal.getTime();
        this.name = name;
        this.surname = surname;
        this.birthDate = sdf.format(date);
        this.iq = iq;
        System.out.println("name: "+this.name+". surname: "+this.surname+". birthDate: "+this.birthDate+". IQ: "+this.iq);
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Map<DayOfWeek, String> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<DayOfWeek, String> schedule) {
        this.schedule = schedule;
    }

    //public static String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    public static String[] tasks = {"do homework", "go to courses", "watch a film", "play a game", "meet with friends", "go for shopping", "go to sport"};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getUnix_time() {
        return unix_time;
    }

    public void setUnix_time(long unix_time) {
        this.unix_time = unix_time;
    }

    public void setIq(int iq) {
        if (iq > 100 || iq < 0) {
            this.iq = Integer.parseInt("");
            return;
        }
        this.iq=iq;
    }
    public int getIq() {
        return iq;
    }

    public Human() {

    }

    public Human(String name, String surname, long unix_time, int iq, Pet pet, Human mother, Human father, Map<DayOfWeek, String> schedule) {
        this.name = name;
        this.surname = surname;
        this.unix_time = unix_time;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy");
        cal.setTimeInMillis(unix_time);
        cal.add(Calendar.DATE,0);
        Date date = cal.getTime();
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthdate=" + sd.format(date) +
                ", iq=" + iq +
                '}';
    }

    public String describeAge(long timestamp) {
        cal.setTimeInMillis(timestamp);
        return "year: " + cal.get(Calendar.YEAR) + ". month: " + cal.get(Calendar.MONTH) + ". day: " + cal.get(Calendar.DAY_OF_MONTH);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return unix_time == human.unix_time && iq == human.iq && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(pet, human.pet) && Objects.equals(mother, human.mother) && Objects.equals(father, human.father) && Objects.equals(schedule, human.schedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, unix_time, iq, pet, mother, father, schedule);
    }
}
