package co.com.cesar.travelocity.models;

public class ReservationData {

    private String name;
    private String country;
    private String phone;
    private String email;
    private String password;
    private String carProtection;


    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    private void setPhone() {
        this.phone = "314" + getRandom();
    }

    public String getPhone() {
        this.setPhone();
        return phone;
    }

    private void setEmail() {
        this.email = "usuario" + getRandom() + "@gmail.com";
    }

    public String getEmail() {
        this.setEmail();
        return this.email;
    }


    public String getPassword() {
        return password;
    }

    public String getCarProtection() {
        return carProtection;
    }

    public int getRandom() {
        return (int) (Math.random() * 10000000 + 1);
    }
}
