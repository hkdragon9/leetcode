class Solution {
    //because of the bit limit, can not convert the strings into ints first.
   //have to appraoch this regularly
    public String addBinary(String a, String b) {
        int m = a.length();
        int n = b.length();
        if (m > n) {
            for (int i = 0; i < m-n; i++) {
                b = "0" + b;
            }
        } else if (m < n) {
            for (int i = 0; i < n-m; i++) {
                a = "0" + a;
            }
        }


        char[] Aarray = a.toCharArray();
        char[] Barray = b.toCharArray();
        int length = Aarray.length;
        boolean carry_on = false;
        for (int i = length - 1; i >= 0; i--) {
            if (Barray[i] == '0' && Aarray[i] == '0') {
                if (carry_on) {
                    Barray[i] = '1';
                    carry_on = false;
                } else {
                    Barray[i] = '0';
                    carry_on = false;
                }
            } else if (Barray[i] == '1' && Aarray[i] == '1') {
                if (carry_on) {
                    Barray[i] = '1';
                    carry_on = true;
                } else {
                    Barray[i] = '0';
                    carry_on = true;
                }
            } else { // the case of 1 + 0
                if (carry_on) {
                    Barray[i] = '0';
                    carry_on = true;
                } else {
                    Barray[i] = '1';
                    carry_on = false;
                }
            }
        }

        String answer = new String(Barray);
        if(carry_on) {
            answer = '1' + answer;
        }

        return answer;
    }
}
