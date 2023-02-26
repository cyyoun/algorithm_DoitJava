package ch03_DataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class Q001 {
    public static void main(String[] args){

        Scanner scnt = new Scanner(System.in);

     /*나는 int로 받아서 String-Array로 변환해서 합을 구했는데,
     * 해설에 의하면 int로 받는게 아니라 String으로 바로 받아서 toCharArray를 사용해 합을 구함
     * 이렇게 하면, int->String 변환 과정이 없어도 됨!!
     * 그리고 toCharArray를 사용함으로써 -'0' 를 해줌(아스키코드 48) */
        Scanner snum = new Scanner(System.in);
        int cnt = scnt.nextInt();
        int num = snum.nextInt();

        String[] anum = String.valueOf(num).split("");

        int sum = 0;

        if (1<=cnt && cnt<=100 && cnt==anum.length) {
            for(int i=0; i<anum.length; i++){
                sum += Integer.valueOf(anum[i]);
            }
            System.out.println("합계 : "+sum);
        }
        else {
            System.out.println("다시 숫자를 입력해 주세요");
        }
    }
}
