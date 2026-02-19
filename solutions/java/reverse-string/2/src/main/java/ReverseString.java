class ReverseString {

    String reverse(String inputString) {
        if(inputString == null) return null;

        char[] characters = inputString.toCharArray();

        int left = 0;
        int right = characters.length - 1;

        while(left < right) {
            char temp = characters[left];
            
            characters[left] = characters[right];
            characters[right] = temp;

            left++;
            right--;
        }
        return new String(characters);
    }
  
}
