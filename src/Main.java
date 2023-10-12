import Model.Hospital;

public class Main {
    public static void main(String[] args) {

        Hospital aiims = new Hospital("Aiims New Delhi", 1000, "New Delhi", 123456);

        aiims.appointDoctor("SOM", "MBBS", 23, "Heart");
        aiims.appointDoctor("TIW", "MBBS", 40, "Brain");
    }
}