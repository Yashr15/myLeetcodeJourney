class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

         if (digits.length() == 0) {
            return result;
        }

        HashMap<Character, String> map = new HashMap<>();

        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        result.add("");

        for (int i = 0; i < digits.length(); i++) {

            char digit = digits.charAt(i);

            String letters = map.get(digit);

            List<String> newResult = new ArrayList<>();

            for (String str : result) {

                for (int j = 0; j < letters.length(); j++) {

                    newResult.add(str + letters.charAt(j));
                }
            }

            result = newResult;
        }

        return result;
    }
}