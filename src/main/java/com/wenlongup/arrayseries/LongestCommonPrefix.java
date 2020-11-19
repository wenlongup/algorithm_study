package com.wenlongup.arrayseries;

/**
 * @author 李文龙
 * @Description: 最长公共前缀
 * @date 2020/11/19
 */
public class LongestCommonPrefix {

    public static void main(String args[]) {
        String strArray[] = {"flowytr", "flowerfd", "flowightfdse", "flowfdsae"};

        String first = strArray[0];

        for (int i = 0; i < first.length(); i++) {

            String pre = first.substring(0, first.length() - i);

            boolean flag = true;
            for (String str1 : strArray) {
                if (!str1.startsWith(pre)) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(pre);
                break;
            }
        }
    }
}
