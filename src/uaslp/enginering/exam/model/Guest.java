package uaslp.enginering.exam.model;

public class Guest {
    private String name;
    private String address;
    private String country;
    private String phoneNumber;

    public Guest() {
    }

    /** Setter of phone number **/
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /** Setter of country **/
    public void setCountry(String country) {
        this.country = country;
    }

    /** Setter of address **/
    public void setAddress(String address) {
        this.address = address;
    }

    /** Setter of name **/

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
