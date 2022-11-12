

public class Utilits {
    public static String checkValidString(String str){
        if (str!=null&&!str.isBlank()&&!str.isEmpty()){
            return str;
        }
        else {
            throw new IllegalArgumentException("Заполнены не все обязательные поля");}}

}
