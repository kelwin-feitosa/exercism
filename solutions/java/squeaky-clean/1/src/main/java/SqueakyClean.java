class SqueakyClean {
    static String clean(String identifier) {
        char[] asArray = identifier.toCharArray();
        StringBuilder builder = new StringBuilder();

        boolean convertToUpper = false;
        for (char ch: asArray) {
            if (ch == '4')
                ch = 'a';
            else if (ch == '3')
                ch = 'e';
            else if (ch == '0')
                ch = 'o';
            else if (ch == '1')
                ch = 'l';
            else if (ch == '7')
                ch = 't';
            
            
            if (Character.isWhitespace(ch)){
                builder.append("_");
            }
            else if (ch == '-'){
                convertToUpper = true;
                continue;
            }
            else if (convertToUpper) {
                builder.append(Character.toUpperCase(ch));
                convertToUpper = false;
            }
            else if (!Character.isLetter(ch)){
                continue;
            }
            
            else{
                builder.append(ch);
            }
            
        }
        return builder.toString();
    }
}
