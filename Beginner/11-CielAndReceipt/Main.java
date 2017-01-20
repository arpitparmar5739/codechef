import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menuList[] = {1,2,4,8,16,32,64,128,256,512,1024,2048};

        for(int testCases = sc.nextInt() ; testCases > 0 ; testCases--) {
            int p = sc.nextInt(), minMenu = 0;

            while(p>0) {
                for(int j = menuList.length-1 ; j >= 0 ; j--) {
                    if(p >= menuList[j]) {
                        p = p - menuList[j];
                        minMenu++;
                        break;
                    }
                }
            }
            System.out.println(minMenu);
        }
    }
}