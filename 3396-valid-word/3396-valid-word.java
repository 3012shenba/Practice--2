class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) return false;

        boolean hasVowel = false;
        boolean hasConsonant = false;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (!Character.isLetterOrDigit(c)) {
                return false; 
            }

            if (Character.isLetter(c)) {
                char lower = Character.toLowerCase(c);
                if ("aeiou".indexOf(lower) != -1) {
                    hasVowel = true;
                } else {
                    hasConsonant = true;
                }
            }
        }

        return hasVowel && hasConsonant;
    }
}
