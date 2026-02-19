class ReverseString {

    String reverse(String inputString) {
        if(inputString == null) return null;
        return new StringBuilder(inputString).reverse().toString();
    }
  
}
