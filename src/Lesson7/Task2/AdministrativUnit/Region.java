package Lesson7.Task2.AdministrativUnit;

public class Region extends CompositeAdministrativeUnit<District> {


    public Region(String name, City regionCapital, ListCopy<District> districts) {
        super(name, regionCapital);
        this.subUnits = districts;
    }

    public ListCopy<District> getDistricts() {
        return this.subUnits;
    }


}
