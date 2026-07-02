import java.util.List;
import java.util.Arrays;

class ResistorColorDuo {
    final List<String> colorsCode = Arrays.asList("black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"); 
    
    int value(String[] colors) {
        return colorsCode.indexOf(colors[0])*10 + colorsCode.indexOf(colors[1]);
    }
}
