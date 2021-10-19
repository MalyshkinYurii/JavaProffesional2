package homework7.task5;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AdressJackson {
    @JsonProperty("country")
    private String country;
    @JsonProperty("city")
    private String city;
    @JsonProperty("street")
    private String street;

    public AdressJackson() {

    }

    public AdressJackson(String country, String city, String street) {
        this.country = country;
        this.city = city;
        this.street = street;
    }

    @Override
    public String toString() {
        return "AdressJackson{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
