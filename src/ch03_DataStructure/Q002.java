package ch03_DataStructure;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Q002 {
    public static void main(String[] args){

        Scanner ssubCnt = new Scanner(System.in);
        int iSubCnt = ssubCnt.nextInt();
        Scanner sSubScore = new Scanner(System.in);
        String strSubScore = sSubScore.nextLine();

        //Stream으로 String 배열을 int 배열로 변환하는 방법...!
        int[] arrScore = Stream.of(strSubScore.split(" ")).mapToInt(Integer::parseInt).toArray();

        if(iSubCnt <= 1000){
            int maxScore = arrScore[0] ;
            double  sumScore = 0;
            double  avgScore = 0;


            //최대점수 구하기
            for(int i=0; i<arrScore.length; i++){
                int score = arrScore[i];
                if (maxScore < score) {
                    maxScore = score;
                }
            }

            for(int i=0; i<arrScore.length; i++){
                double score = arrScore[i];
                if(score<=100 && score>0){
                    double newScore = score/maxScore*100;
                    sumScore +=  newScore;
//                    System.out.println("newScore : " +newScore);
                }else {
                    System.out.println("조건에 부합하지 않습니다...");
                    continue;
                }
            }
            System.out.println("새로운 합계 :"+sumScore);
            avgScore = sumScore/ arrScore.length;
            System.out.println("새로운 평균 : "+avgScore);

        }

    }
}

