package Identification_management;

public class ID_Services {

    public National_ID Find(String NIN) {
        if ("CF234574884K".equals(NIN)) {
            return new National_ID(
                    "CF234574884K",
                    "Kaufah Kibirige"
            );
        } else if ("CF343456565L".equals(NIN)) {
            return new National_ID(
                    "CF343456565L",
                    "Mukhusin Iggah"
            );
        } else {
            return null;
        }
    }
}