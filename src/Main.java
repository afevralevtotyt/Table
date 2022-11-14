import java.util.*;

public class Main {

    public static void addToDatabase(Passport passport, Map<Integer, Passport> map) {
        map.put(passport.getNumber(), passport);
    }

    public static Passport databaseSearch(int nubmer, Map<Integer, Passport> map) {
        return (Passport) map.get(nubmer);
    }


    public static void main(String[] args) {

        // Задание 2. Таблица умножения

        List<Integer> first = new ArrayList<>(8);
        first.add(2);
        first.add(3);
        first.add(4);
        first.add(5);
        first.add(6);
        first.add(7);
        first.add(8);
        first.add(9);


        List<StringBuilder> numList = new ArrayList<>();
        int a = first.get(0);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++)
                numList.add(new StringBuilder(first.get(i) + "*" + first.get(j)));

        }
        for (int i = 0; i < numList.size(); i++) {
            for (int j = 0; j < numList.size(); j++) {
                StringBuilder str = numList.get(i).reverse();
                if ((str.equals(numList.get(j))) && (str.charAt(0)) != str.charAt(2)) {
                    numList.remove(j);
                }
            }
        }

        System.out.println(numList);
        Set<StringBuilder> set = Set.copyOf(numList);

        Iterator iter = set.iterator();

        for (int i = 0; i < 15; i++) {
            System.out.println(iter.next());
        }


        //Задание 3. Паспорт

        Passport ivanFedorov = new Passport(12345, "Иван", "Федоров", "Михайлович", "20.12.2000");
        Passport sergeyIvanov = new Passport(32146, "Сергей", "Иванов", "06.12.1988");
        Passport ivanPetrov = new Passport(32146, "Иван", "Петров", "12.12.1912");

        HashMap<Integer, Passport> database = new HashMap<Integer, Passport>();

        addToDatabase(ivanFedorov, database);
        addToDatabase(sergeyIvanov, database);
        addToDatabase(ivanPetrov, database);
        System.out.println(databaseSearch(3234, database));
        System.out.println(databaseSearch(32146, database));
        System.out.println(database);

    }
}