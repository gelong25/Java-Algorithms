import java.io.*;
class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        int size = input.charAt(0) - '0';
        
        String[] info = new String[size];
        for (int i = 0; i < size; i++) {
                info[i] = br.readLine();
            
        }

        int cnt = 0;
        String result; 

        for (int i = 0; i < size; i++) {
            String[] sep = info[i].split(" ");
            String ci = sep[0];

            int vi = Integer.parseInt(sep[1]);


            if (ci.equals("in")) {
                cnt += vi;
            } else {
                cnt -= vi;
            }
        }
        if (cnt > 0) {
            result = "Success";
        } else {
            result = "fail";
        }
        
    System.out.println(result);    
    }
}