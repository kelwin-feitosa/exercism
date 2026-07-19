class Acronym {

    private String phrase;
    
    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        String fraseFormatada = phrase.replace('-', ' ').replace('_', ' ');

        String[] palavras = fraseFormatada.split("\\s+");

        StringBuilder caractere = new StringBuilder();

        for(String palavra : palavras) {
            if(palavra.isEmpty()) continue;

            char primeiraLetra = palavra.charAt(0);

            if(Character.isLetter(primeiraLetra)){
                caractere.append(Character.toUpperCase(primeiraLetra));
            }
        }

        return caractere.toString();
    }

}
