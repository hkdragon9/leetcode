class Solution {
    public String countAndSay(int n) {
        // 1 11 21 1211 111221  312211 13112221


        String s = "1";


        for (int i = 1; i < n; i++) {
            String new_String = "";

            char[] array = s.toCharArray();
            char c = array[0];
            int count = 1;
            for (int j = 1; j < s.length(); j++) {
                if (array[j] == c) {count++;}
                else {
                    new_String = new_String + count + c;
                    c = array[j];
                    count = 1;

                    //System.out.println(new_String);
                }
            }
            new_String = new_String + count + c;


            s = new_String;
        }

        return s;
    }
}
