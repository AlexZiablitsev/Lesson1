package Lesson7.Task2.AdministrativUnit;

public class District extends CompositeAdministrativeUnit<City> {


    public District(String name, City districCapital, ListCopy<City> cities) {
        super(name, districCapital);
        this.subUnits = cities;
    }

    public ListCopy<City> getCities() {
        return this.subUnits;
    }
}
