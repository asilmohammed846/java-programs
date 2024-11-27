public class StringOperations {
    // Method to get the length of a string
    public int getLength(String str) {
    return str.length();
    }
    // Method to get a character at a specified index
    public char getCharAt(String str, int index) {
    return str.charAt(index);
    }
    // Method to get a substring starting from a specified index
public String getSubstring(String str, int beginIndex) {
    return str.substring(beginIndex);
    }
    // Method to get a substring with a start and end index
    public String getSubstring(String str, int beginIndex, int endIndex) {
    return str.substring(beginIndex, endIndex);
    }

    public String toLowerCase(String str) {
        return str.toLowerCase();
        }
        // Method to convert a string to uppercase
        public String toUpperCase(String str) {
        return str.toUpperCase();
        }
        // Method to trim leading and trailing spaces
        public String trimString(String str) {
        return str.trim();
        }

// Method to replace characters in a string
public String replaceCharacter(String str, char oldChar, char newChar) {
    return str.replace(oldChar, newChar);
    }
    // Method to check if a string contains a substring
    public boolean containsSubstring(String str, String substring) {
    return str.contains(substring);
    }

    public boolean startsWith(String str, String prefix) {
        return str.startsWith(prefix);
        }
        // Method to check if a string ends with a specified suffix
        public boolean endsWith(String str, String suffix) {
        return str.endsWith(suffix);
        }
        // Method to split a string by a delimiter
        public String[] splitString(String str, String delimiter) {
        return str.split(delimiter);
        }

// Method to join multiple strings with a delimiter
public String joinStrings(String delimiter, String... elements) {
    return String.join(delimiter, elements);
    }
    // Method to compare two strings lexicographically
    public int compareStrings(String str1, String str2) {
    return str1.compareTo(str2);
    }
    }

