class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length() == 0) {
            return 0;
        }

        char[] array = s.toCharArray();
        int n = s.length();
        int end = -1;
        for (int i = n-1; i >= 0; i--) {
            if (array[i] != ' ') {
                end = i;
                break;
            }
        }

        int start = -1;
        for (int i = end - 1; i >= 0; i--) {
            if (array[i]  == ' ') {
                start = i;
                break;
            }
        }

        return end - start;

    }
}
