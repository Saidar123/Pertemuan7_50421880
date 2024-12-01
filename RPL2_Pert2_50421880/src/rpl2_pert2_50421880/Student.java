package rpl2_pert2_50421880;
import java.time.LocalDate;

public class Student {

    private String name;
    private String NPM;
    private String classNumber;
    private int birthYear;
    private String alamat;
    private String hp; 

    // Constructor default
    public Student() {
        this.name = "";
        this.NPM = "";
        this.classNumber = "";
        this.birthYear = 0;
        this.alamat = "";
        this.hp = "";
    }

    // Getter dan Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNpm() {
        return NPM;
    }

    public void setNpm(String NPM) {
        this.NPM = NPM;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    // Method untuk menghitung umur
    public int calculateAge() {
        return LocalDate.now().getYear() - this.birthYear;
    }
}
