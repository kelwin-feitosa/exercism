import java.util.List;
import java.util.ArrayList;
class Flattener {

    List<Object> flatten(List<?> list) {
        List<Object> listaDesembrulhada = new ArrayList<>();
        
        for(Object item : list) {
            if(item == null) {
                continue;
            }

            if(item instanceof List) {
                List<Object> subList = flatten((List<?>) item);

                listaDesembrulhada.addAll(subList);
            } else {
                listaDesembrulhada.add(item);
            }
        }

        return listaDesembrulhada;
    }

}