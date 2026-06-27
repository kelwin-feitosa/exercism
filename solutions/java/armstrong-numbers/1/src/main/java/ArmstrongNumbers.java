class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        String txt = String.valueOf(numberToCheck);
        int n = txt.length();
        int number = numberToCheck;
        int soma = 0;

        for(int i = 0; i < n; i++) {
            soma += (int) Math.pow(number % 10, n);
            number /= 10;
        }

        return soma == numberToCheck;
    }
}
