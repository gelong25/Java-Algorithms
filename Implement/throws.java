// 절약 문제 
// income과 outcome을 계산해 지출이 가지고 있는 돈 보다 크면 실패 아니면 성공을 출력하는 문제 
import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        // BufferedReader를 사용하여 입력을 받을 준비를 함
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 첫 번째 줄의 입력을 받아 거래 건수로 변환
        String input = br.readLine();
        int size = input.charAt(0) - '0';
        
        // 거래 정보를 저장할 배열 선언
        String[] info = new String[size];
        
        // 거래 정보 입력받기
        for (int i = 0; i < size; i++) {
            info[i] = br.readLine();    
        }

        int balance = 0;  // 현재 잔액을 저장할 변수
        String result = "success";  // 결과값을 저장할 변수, 기본값은 "success"

        // 각 거래를 순서대로 처리
        for (int i = 0; i < size; i++) {
            // 공백을 기준으로 거래명을 분리하여 배열에 저장
            String[] sep = info[i].split(" ");
            String ci = sep[0];  // 거래명 (in / out)
            int vi = Integer.parseInt(sep[1]);  // 거래액

            // 거래명에 따라 잔액을 조정
            if (ci.equals("in")) {
                balance += vi;  // 수입인 경우 잔액을 증가
            } else {
                balance -= vi;  // 지출인 경우 잔액을 감소

                // 잔액이 음수이면 실패 처리
                if (balance < 0) {
                    result = "fail";
                    break;  // 더 이상 처리하지 않고 루프 종료
                }
            }
        }

        // 결과 출력
        System.out.println(result);    
    }
}
