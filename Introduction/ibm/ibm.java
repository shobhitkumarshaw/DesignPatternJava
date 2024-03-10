package Introduction.ibm;

import java.util.*;

public class ibm {

    static String rollingString(String s, List<String> op) {

        char[] charArr = s.toCharArray();

        for (String opStr : op) {
            int i = Integer.parseInt(String.valueOf(opStr.charAt(0)));
            int j = Integer.parseInt(String.valueOf(opStr.charAt(1)));
            char intOp = opStr.charAt(2);

            if(intOp == 'R') {
                for(int k= i; k<=j; k++) {
                    if(charArr[k] == 'z') {
                        charArr[k] = 'a';
                    } else {
                        charArr[k]+= 1;
                    }
                }

            }

            if(intOp == 'L') {
                for(int k= i; k<=j; k++) {
                    if(charArr[k] == 'a') {
                        charArr[k] = 'z';
                    } else {
                        charArr[k]-= 1;
                    }
                }

            }

            


        }

        return String.valueOf(charArr);

    }

    public static void main(String[] args) {
        String input = "abc";
        List<String> operations = List.of("01L", "12R", "02R");

        String result = rollingString(input, operations);

        if (result != null &&
                result.equals("ace")) {
            System.out.println("Test 1 case passed output: " + result);
        } else {
            System.err.println("Test 1 case failed output: " + result);
        }

        

        result = rollingString("abc", List.of("00L", "22L", "02R"));

        if (result != null &&
                result.equals("acc")) {
            System.out.println("Test 2 case passed output: " + result);
        } else {
            System.err.println("Test 2 case failed output: " + result);
        }
    }
}
