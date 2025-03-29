import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<String> splitString(String input, int size){
        if(input == null || input.isEmpty()){
            throw new IllegalArgumentException("СТрока не должна быть пустой");
        }
        if(size <= 0){
            throw new IllegalArgumentException("Размер должен быть больше 0");
        }

        List<String> parts = new ArrayList<>();

        for(int i = 0; i < input.length(); i+= size){
            parts.add(input.substring(i, Math.min(i+size, input.length())));
        }
        return parts;
    }

    public static void main(String[] args){
        String text = "ПримерРазбиенияСтроки";
        int size = 0;

        List<String> result = splitString(text, size);

        System.out.println(result);
    }
}