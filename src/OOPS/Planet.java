package OOPS;

public class Planet {
    private String code;
    private static Planet earth;
    private static School[] schools;

    private Planet(String code) {
        this.code = code;
    }

    static Planet getPlanet(String code) {
        if (earth == null) {
            earth = new Planet(code);
        }
        return earth;
    }

    public String getCode() {
        return code;
    }

    void addSchool(School school) {
        if (schools == null) {
            schools = new School[1];
            schools[0] = school;
        } else {
            School[] newSchools = new School[schools.length + 1];
            for (int i = 0; i < schools.length; i++) {
                newSchools[i] = schools[i];
            }
            newSchools[schools.length] = school;
            schools = newSchools;
        }
    }
}
