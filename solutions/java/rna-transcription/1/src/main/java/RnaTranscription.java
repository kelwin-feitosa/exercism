class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder rna = new StringBuilder();

        for(char dna : dnaStrand.toCharArray()) {
            switch (dna) {
                case 'G' -> rna.append('C');
                case 'C' -> rna.append('G');
                case 'T' -> rna.append('A');
                case 'A' -> rna.append('U');
                default -> throw new IllegalArgumentException("Invalid character!" + rna);
            }
        }
        return rna.toString();
    }

}
