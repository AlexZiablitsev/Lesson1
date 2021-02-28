package Lesson7.Task2.AdministrativUnit;

public abstract class CompositeAdministrativeUnit <T extends AdministrativeUnit> extends AdministrativeUnit {

    protected City capital;
    protected ListCopy<T> subUnits;

    public CompositeAdministrativeUnit(String name, City capital) {
        super(name);
        this.capital = capital;
    }

    public City getCapital() {
        return capital;
    }

    @Override
    public double squareCalculation() {
        double square = 0;
        for (int i = 0; i < subUnits.getLength();i++){
            square += subUnits.getElement(i).squareCalculation();
        }
        return square;
    }

    public void addCity(T city){
        this.subUnits.addElement(city);
    }


}
