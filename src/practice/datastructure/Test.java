package practice.datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> locations = new ArrayList<>();
        locations.add("L1");
        locations.add("L2");
        Address address = new Address(locations);
        List<String> newLocations = address.getLocations();

        newLocations.add("L3");

        address.getLocations().forEach(System.out::println);
    }

    static class Address {

        public Address(List<String> locations) {
            this.locations = locations;
        }

        List<String> locations;
        String x;
        String y;

        public List<String> getLocations() {
            return locations;
        }

        public void setLocations(List<String> locations) {
            this.locations = locations;
        }

        public String getX() {
            return x;
        }

        public void setX(String x) {
            this.x = x;
        }

        public String getY() {
            return y;
        }

        public void setY(String y) {
            this.y = y;
        }
    }

}
