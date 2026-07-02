class ResistorColorDuo {
    public enum Color {
        BLACK, BROWN, RED, ORANGE, YELLOW, GREEN, BLUE, VIOLET, GREY, WHITE
    }
    int value(String[] colors) {
        int dezena = Color.valueOf(colors[0].toUpperCase()).ordinal();
        int unidade = Color.valueOf(colors[1].toUpperCase()).ordinal();

        String juntos = "" + dezena + unidade;
        return Integer.parseInt(juntos);
    }
}
