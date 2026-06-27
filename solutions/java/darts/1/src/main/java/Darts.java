class Darts {
    int score(double xOfDart, double yOfDart) {
        double point = Math.sqrt(xOfDart*xOfDart + yOfDart*yOfDart);

        if(point <= 1)
            return 10;
        else if (point <= 5)
            return 5;
        else if (point <= 10)
            return 1;
        else
            return 0;
    }
}
