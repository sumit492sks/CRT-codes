import java.util.Scanner;

public class PowerSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int l = a.length();
        String[] res = new String[1<<l];
        for(int i=0;i<(1<<l);i++){
            String t= "";
            int m=1<<l-1;
            for(int j=0;j<l;j++){
                if((i&m)!=0)
                    t = t+a.charAt(j);
                m >>=1;
            }res[i] = t;
        }
        for(String i:res){
            System.out.println(i);
        }
    }
}
