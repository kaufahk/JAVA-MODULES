import Registration.*;
import Tax.*;
import Identification_management.*;
import Passport_processing.*;
public class Main {
    public static void main(String[] args) {
        ID_Services ids = new ID_Services();
        National_ID k = ids.Find("CF234574884K");
        if (k != null) {
            System.out.println("National ID: VALID for " + k.getFullName());
        } else {
            System.out.println("National ID: INVALID");
        }
        Passport_services passports = new Passport_services();
        Passportapplication p = passports.apply("CF343456565L");
        if (p != null) {
            System.out.println("Passport: " + p.getPassportNumber() + " for " + p.getHolderName());
        } else {
            System.out.println("Passport REFUSED: invalid NIN");
        }

        Passportapplication fake = passports.apply("FAKE123");
        if (fake != null) {
            System.out.println("Passport: " + fake.getPassportNumber());
        } else {
            System.out.println("Passport REFUSED: invalid NIN");
        }

        business_Services registry = new business_Services();
        business b = registry.Register("Omega Cosmetics", "CF343456565L");
        if (b != null) {
            System.out.println("Business registered: " + b.getName() + " (owner: " + b.getOwnerName() + ")");
        } else {
            System.out.println("Registration REFUSED: invalid owner NIN");
        }
    }
}
