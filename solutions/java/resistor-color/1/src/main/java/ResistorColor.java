class ResistorColor {
    public enum Color {
        BLACK, BROWN, RED, ORANGE, YELLOW, GREEN, BLUE, VIOLET, GREY, WHITE
    }
    
    int colorCode(String color) {
        return Color.valueOf(color.toUpperCase()).ordinal();
    }

    String[] colors() {
        Color[] allColors = Color.values();

        String[] colorsList = new String[allColors.length];

        for(int i=0; i < allColors.length; i++) {
            colorsList[i] = allColors[i].name().toLowerCase();
        }

        return colorsList;
    }
}
