import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(),p1=0,p2=0,l1=0,l2=0,maxLp1=0,maxLp2=0,lead=0;

        for(int i=1 ; i<=t ; i++) {
            p1 = p1 + sc.nextInt();
            p2 = p2 + sc.nextInt();

            lead = p1-p2;

            if(lead>0) {
                l1 = l1 + lead;
                if(maxLp1<lead) {
                    maxLp1 = lead;
                }
            } else {
                l2 = l2 - lead;
                if(maxLp2<-lead) {
                    maxLp2 = -lead;
                }
            }
        }
        if(l1>l2) {
            System.out.println("1 "+maxLp1);
        } else {
            System.out.println("2 "+maxLp2);
        }
    }
}