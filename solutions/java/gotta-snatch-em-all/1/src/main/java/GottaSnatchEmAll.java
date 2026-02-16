import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        boolean iHaveNew = myCollection.stream().anyMatch(cards -> !theirCollection.contains(cards));
        boolean theyHaveNew = theirCollection.stream().anyMatch(cards -> !myCollection.contains(cards));

        return iHaveNew && theyHaveNew;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        if (collections.isEmpty())
            return java.util.Collections.emptySet();

        Set <String> common = new HashSet<>(collections.get(0));

        for(Set<String>collection : collections){
            common.retainAll(collection);
        }

        return common;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> all = new HashSet<>();

        for(Set<String> collection : collections) {
            all.addAll(collection);
        }

        return all;
    }
}
