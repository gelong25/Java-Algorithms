// 시간 N을 입력받고 00시 00분 00초 ~ N시 59분 59초까지
// 3이 포함된 시간을 모두 세는 프로그램 

import java.util.Scanner;

public class CountTime {
    
    // 3이 들어 있는 시간 확인하기 
    public static boolean countTime (int h, int m, int s) {
        if(h % 10 == 3 || m % 10 == 3 || m / 10 == 3 || s % 10 == 3 || s / 10 == 3){
            return true;
        }
        return false;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();

        // N 입력 받기
        int N = sc.nextInt();
        int count = 0;

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    //시간 안에 3이 포함 돼 있으면 카운트 증가
                    if(countTime(i, j, k)) count++;
                }
            }
        }
            System.out.println(count);
    }

}
