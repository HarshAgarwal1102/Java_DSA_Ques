class Solution {

    String keys[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinationsHelper(String digits) {
        if(digits.length() == 0){
            List<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        char num = digits.charAt(0); // fetch first character
        int index = num - '0'; // convert char to num
        String phoneKey = keys[index]; // accessing index
        List<String> finalResult = new ArrayList<>();
        for(int i =0; i<phoneKey.length(); i++){
            List<String> result = letterCombinationsHelper(digits.substring(1));
            for(String s : result){
                finalResult.add(phoneKey.charAt(i) + s);
            }
        }
        return finalResult;
    }

    public List<String> letterCombinations(String digits) {

        if(digits.length() == 0){
            List<String> list = new ArrayList<>();
            return list;
        }
        List<String> ans = letterCombinationsHelper(digits);

        return ans;
    }
}
