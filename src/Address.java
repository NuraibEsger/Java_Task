public class Address {
    String address;
    String city;
    String zipcode;

    public Address(String address, String city, String zipcode) {
        this.address = address;
        this.city = city;
        this.zipcode = zipcode;
    }

    public String toString() {
        return address + " " + city + " " + zipcode;
    }
}
