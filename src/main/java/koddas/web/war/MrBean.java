package koddas.web.war;

import java.io.Serializable;

/**
 * MrBean is a simple example of a Java bean; a small class that encapsulates a
 * number of values. It exposes an empty constructor and has a number of
 * members that are accessible through getters and setters.
 * 
 * @author Johan Holmberg
 */
public class MrBean implements Serializable {
    private static final long serialVersionUID = -3168349974480377280L;

    private String name;
    private int age;
    private String nationality;
    private String carBrand;

    public MrBean() {
        name = "Rowan Atkinson";
        age = 60;
        nationality = "British";
        carBrand = "Leyland Mini";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }
}
