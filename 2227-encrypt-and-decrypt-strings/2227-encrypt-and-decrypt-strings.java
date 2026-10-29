import java.util.*;

class Encrypter {
    private Map<Character, String> keyMap;
    private Map<String, Integer> dictMap;

    public Encrypter(char[] keys, String[] values, String[] dictionary) {
        keyMap = new HashMap<>();
        dictMap = new HashMap<>();

        for (int i = 0; i < keys.length; i++) {
            keyMap.put(keys[i], values[i]);
        }

        for (String word : dictionary) {
            String encrypted = encrypt(word);
            if (encrypted != null) {
                dictMap.put(encrypted, dictMap.getOrDefault(encrypted, 0) + 1);
            }
        }
    }

    public String encrypt(String word1) {
        StringBuilder result = new StringBuilder();

        for (char c : word1.toCharArray()) {
            if (!keyMap.containsKey(c)) {
                return "";
            }
            result.append(keyMap.get(c));
        }

        return result.toString();
    }

    public int decrypt(String word2) {
        return dictMap.getOrDefault(word2, 0);
    }
}