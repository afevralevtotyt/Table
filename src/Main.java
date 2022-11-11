import java.util.*;

public class Main {
    public static void main(String[] args) {
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
        for(int i =0; i<8; i++){
            for (int j = 0; j<8; j++)
                numList.add(new StringBuilder(first.get(i) +"*"+first.get(j)));

            }
        for (int i =0; i<numList.size(); i++){
            for (int j =0; j<numList.size(); j++){
                StringBuilder str= numList.get(i).reverse();
                if ((str.equals(numList.get(j)))&&(str.charAt(0))!=str.charAt(2)){
                numList.remove(j);
            }
        }}

        Set <StringBuilder> set = Set.copyOf(numList);

        Iterator iter = set.iterator();

        for (int i=0; i<15; i++){
            System.out.println(iter.next());
        }


}}