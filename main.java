import java.util.HashSet;
import java.util.Set;

public class main {

    public class Main {
        public static void main(String[] args) {
    // Создание объектов класса Laptop
            laptops hp_pailion_g6 = new laptops("hp_pailion_g6", 16, "4k", 
            true, 500, "16", "Windows", "black"); 
            brands brandHp = new brands("HP", "U.S.A.", "AmericaLanguage");
            hp_pailion_g6.addBrand(brandHp); 
            laptops hp_galaxy_x64 = new laptops("hp_galaxy_x64", 14, "FullHD", 
            true, 500, "8", "Windows", "white");
            hp_galaxy_x64.addBrand(brandHp);
            laptops samsung_a52 = new laptops("samsung_a52", 18, "FullHD", 
            true, 300, "8", "Windows", "black");
            brands brandSamsung = new brands("Samsung", "Korea", "KoreaLanguage");
            samsung_a52.addBrand(brandSamsung);
            laptops samsung_m31s = new laptops("samsung_m31s", 16, "4k", 
            false, 1000, "16", "Linux", "black");
            samsung_m31s.addBrand(brandSamsung);
            laptops lenovo_gtx76 = new laptops("lenovo_gtx76", 16, "FullHD", 
            true, 700, "8", "Windows", "white");
            brands brandLenovo = new brands("Lenovo", "China", "ChinaLanguage");
            lenovo_gtx76.addBrand(brandLenovo);
            laptops macbook_14pro = new laptops("macbook_14pro", 17, "4k", 
            false, 1000, "8", "ios", "white");
            brands brandMacbook = new brands("Apple", "U.S.A.", "AmericaLanguage");
            macbook_14pro.addBrand(brandMacbook);
            laptops asus_x515 = new laptops("asus_x515", 17, "FullHD", 
            true, 300, "4", "Windows", "black");
            brands brandAsus = new brands("Asus", "taiwan", "ChinaLanguage");
            asus_x515.addBrand(brandAsus);
            laptops acer_air5 = new laptops("acer_air5", 19, "FullHD", 
            true, 600, "8", "Windows", "black");
            brands brandAcer = new brands("Acer", "taiwan", "ChinaLanguage");
            acer_air5.addBrand(brandAcer);
            laptops acer_air6 = new laptops("acer_air6" ,18, "4k", 
            false, 500, "16", "Windows", "black");
            acer_air6.addBrand(brandAcer);
            laptops acer_a313 = new laptops("acer_a313", 16, "FullHD", 
            true, 500, "8", "Windows", "black");
            acer_a313.addBrand(brandAcer);
    // Создание множества
            Set <laptops> laptop = new HashSet<>();
            laptop.add(hp_pailion_g6);      
            laptop.add(hp_galaxy_x64);
            laptop.add(samsung_a52);
            laptop.add(samsung_m31s);
            laptop.add(lenovo_gtx76);
            laptop.add(macbook_14pro);
            laptop.add(asus_x515);
            laptop.add(acer_air5);
            laptop.add(acer_air6);
            laptop.add(acer_a313);
    // создание нового объекта вызова методов
            laptops FilterLaptop = new laptops();
    // вызов метода фильтрации по определеннеым параметрам
            // System.out.println("по вашему запросу найдено: " + FilterLaptop.filter(laptop));
    
    // вызод метода фильтрации по заданным пользователем критериям
            System.out.println(FilterLaptop.newFilter(laptop));
        }
    }
}
