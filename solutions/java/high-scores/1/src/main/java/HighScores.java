import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class HighScores {

    private final List<Integer> listScores;
    
    public HighScores(List<Integer> highScores) {
        this.listScores = new ArrayList<>(highScores);
    }

    List<Integer> scores() {
        return this.listScores;
    }

    Integer latest() {
        return listScores.get(listScores.size() - 1);
    }

    Integer personalBest() {
        return Collections.max(listScores);
    }

    List<Integer> personalTopThree() {
        List<Integer> sortedList = new ArrayList<>(listScores);
        sortedList.sort(Collections.reverseOrder());

        int qtd = Math.min(3, sortedList.size());

        return sortedList.subList(0, qtd);
    }

}
