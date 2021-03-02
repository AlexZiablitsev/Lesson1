package Lesson7.Task2;


import Lesson7.Task2.AdministrativUnit.*;


public class Main {
    public static void main(String[] args) {
        //Создать приложение, удовлетворяющее требованиям, приведенным в задании. Наследование применять только в тех заданиях, в которых это логически
        //обосновано. Аргументировать принадлежность классу каждого создаваемого
        //метода и корректно переопределить для каждого класса методы equals(),
        //hashCode(), toString(). Создать объект класса Государство, используя классы Область, Район,
        //Город. Методы: вывести на консоль столицу, количество областей, площадь, областные центры.


        City brest = new City("Brest", 146.12f);
        City vitebsk = new City("Vitebsk", 134.6f);
        City gomel = new City("Gomel", 139.77f);
        City grodno = new City("Grodno", 141.98f);
        City minsk = new City("Minsk", 348.84f);
        City mogilev = new City("Mogilev", 118.50f);

        City bobruysk = new City("Bobruysk", 96.40f);
        City baranovichi = new City("Baranovichi", 84.96f);
        City polock = new City("Polock", 43.05f);
        City lida = new City("Lida", 45.79f);
        City mozyr = new City("Mozyr", 44.18f);
        City molodechno = new City("Molodechno", 33.49f);

        ListCopy<City> brestDistrictsCities = new ListCopy<>(City.class); //создание списка районных центров и их добавление городов в список
        brestDistrictsCities.addElement(brest);
        brestDistrictsCities.addElement(baranovichi);

        District brestDistrict = new District("Brest district", brest, brestDistrictsCities);       //создание районов
        District baranovichiDistrict = new District("Baranovichi", baranovichi, brestDistrictsCities);

        ListCopy<District> brestRegionDistricts = new ListCopy<>(District.class);       //создание списка областей
        brestRegionDistricts.addElement(brestDistrict);                                 // добавление районных центров в список области
        brestRegionDistricts.addElement(baranovichiDistrict);
        Region brestRegion = new Region("Brest's region", brest, brestRegionDistricts); //создание оласти


        ListCopy<City> vitebskDistrictsCities = new ListCopy<>(City.class);
        vitebskDistrictsCities.addElement(vitebsk);
        vitebskDistrictsCities.addElement(polock);

        District vitebskDistrict = new District("Vitebsk district", vitebsk, vitebskDistrictsCities);
        District polockDistrict = new District("Polock district", vitebsk, vitebskDistrictsCities);

        ListCopy<District> vitebskRegionDistricts = new ListCopy<>(District.class);
        vitebskRegionDistricts.addElement(vitebskDistrict);
        vitebskRegionDistricts.addElement(polockDistrict);
        Region vitebskRegion = new Region("Vitebsk's region", vitebsk, vitebskRegionDistricts);


        ListCopy<City> gomelDistrictsCities = new ListCopy<>(City.class);
        gomelDistrictsCities.addElement(gomel);
        gomelDistrictsCities.addElement(mozyr);

        District gomelDistrict = new District("Gomel district", vitebsk, vitebskDistrictsCities);
        District mozyrDistrict = new District("Mozyr district", vitebsk, vitebskDistrictsCities);

        ListCopy<District> gomelRegionDistricts = new ListCopy<>(District.class);
        gomelRegionDistricts.addElement(gomelDistrict);
        gomelRegionDistricts.addElement(mozyrDistrict);
        Region gomelRegion = new Region("Gomel's region", gomel, gomelRegionDistricts);


        ListCopy<City> grodnoDistrictsCities = new ListCopy<>(City.class);
        grodnoDistrictsCities.addElement(grodno);
        grodnoDistrictsCities.addElement(lida);

        District grodnoDistrict = new District("Gomel district", vitebsk, vitebskDistrictsCities);
        District lidaDistrict = new District("Mozyr's district", vitebsk, vitebskDistrictsCities);

        ListCopy<District> grodnoRegionDistricts = new ListCopy<>(District.class);
        grodnoRegionDistricts.addElement(grodnoDistrict);
        grodnoRegionDistricts.addElement(lidaDistrict);
        Region grodnoRegion = new Region("Grodno's region", grodno, grodnoRegionDistricts);


        ListCopy<City> minskDistrictsCities = new ListCopy<>(City.class);
        minskDistrictsCities.addElement(minsk);
        minskDistrictsCities.addElement(molodechno);

        District minskDistrict = new District("Minsk district", minsk, minskDistrictsCities);
        District molodechnoDistrict = new District("Molodechno district", molodechno, minskDistrictsCities);

        ListCopy<District> minskRegionDistricts = new ListCopy<>(District.class);
        minskRegionDistricts.addElement(grodnoDistrict);
        minskRegionDistricts.addElement(lidaDistrict);
        Region minskRegion = new Region("Minsk's region", minsk, minskRegionDistricts);


        ListCopy<City> mogilevDistrictsCities = new ListCopy<>(City.class);
        mogilevDistrictsCities.addElement(mogilev);
        mogilevDistrictsCities.addElement(bobruysk);

        District mogilevDistrict = new District("Mogilev district", mogilev, mogilevDistrictsCities);
        District bobruyskDistrict = new District("Bobruysk district", bobruysk, mogilevDistrictsCities);

        ListCopy<District> mogilevRegionDistricts = new ListCopy<>(District.class);
        mogilevRegionDistricts.addElement(mogilevDistrict);
        mogilevRegionDistricts.addElement(bobruyskDistrict);
        Region mogilevRegion = new Region("Mogilev region", mogilev, mogilevRegionDistricts);


        ListCopy<Region> belarusRegions = new ListCopy<>(Region.class); //список областей
        belarusRegions.addElement(brestRegion);
        belarusRegions.addElement(vitebskRegion);
        belarusRegions.addElement(gomelRegion);
        belarusRegions.addElement(grodnoRegion);
        belarusRegions.addElement(minskRegion);
        belarusRegions.addElement(mogilevRegion);

        State belarus = new State("Belarus", minsk, belarusRegions); //страна


        System.out.println(belarus.getCapital());  // вывести на консоль столицу
        System.out.println(belarus.getRegions());  // вывести количество областей
        System.out.println(belarus.squareCalculation()); // вывести  площадь
        System.out.println(belarus.difineRegionCapital()); // вывести областные центры
    }
}
