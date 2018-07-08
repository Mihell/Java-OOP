package AirlineTicket;

public class PassengerInfo {
    private String name;
    private String surname;
    private int passportNumber;

    public PassengerInfo() {
    }

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

    public int getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    public PassengerInfo(String name, String surname, int passportNumber) {
        this.name = name;
        this.surname = surname;
        this.passportNumber = passportNumber;
    }

    @Override
    public String toString() {
        return "PassengerInfo{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", passportNumber=" + passportNumber +
                '}';
    }
}
