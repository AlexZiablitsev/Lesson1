package Lesson7.Task2.AdministrativUnit;

public class State extends CompositeAdministrativeUnit <Region>  {


    public State(String name, City stateCapital, ListCopy<Region> regions ) {
        super(name, stateCapital);
        this.subUnits = regions;
    }

    public int getRegions() {
        return this.subUnits.getLength();
    }

    public ListCopy<City> difineRegionCapital(){
        Region[] regions = this.subUnits.getAllElements();
        ListCopy<City> regionCapitals = new ListCopy<>(City.class);
        for (Region region: regions){
            regionCapitals.addElement(region.getCapital());
        }
        return regionCapitals;
    }


}
