import java.util.Objects;

public class Passport {


    private int number;
    private String name;
    private String surname;
    private String thirdName="";
    private String birthDate;

    public Passport(int number, String name, String surname, String thirdName, String birthDate) {
        if (number!=0){
        this.number = number;}else {
            throw new IllegalArgumentException("Поле номер должно быть целым положительным числом");
        }

        this.name = Utilits.checkValidString(name);
        this.surname = Utilits.checkValidString(surname);
        this.thirdName = Utilits.checkValidString(thirdName);
        this.birthDate = Utilits.checkValidString(birthDate);
    }
    public Passport(int number, String name, String surname, String birthDate) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }
    public int getNumber() {
        return number;
    }



    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getThirdName() {
      return thirdName;}

    @Override
    public String toString() {
        return "Паспорт " +
                "номер " + number + ", "+
                "ФИО: " + surname  + " "+
                name+ " "+ thirdName + ", "+
                "дата рождения: " + birthDate ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Passport)) return false;

        Passport passport = (Passport) o;

        if (number != passport.number) return false;
        if (!Objects.equals(name, passport.name)) return false;
        if (!Objects.equals(surname, passport.surname)) return false;
        if (!Objects.equals(thirdName, passport.thirdName)) return false;
        return Objects.equals(birthDate, passport.birthDate);
    }

    @Override
    public int hashCode() {
        int result = number;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (thirdName != null ? thirdName.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        return result;
    }
}
