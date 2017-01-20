//TODO :: Do this question again through Merge Sort and check whether it runs
//Under Construction ;P

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int a[] = new int[T];

        for (int i = 0; i < T; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 1; i < T; i++) {
            int j = i - 1, temp = a[i];

            while (j >= 0 && temp < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }

        for (int i = 0; i < T; i++) {
            System.out.println(a[i]);
        }
    }

    public void MergeSort(int a[],int l, int h) {
        if(l<h) {
            int mid = (l+h)/2;
            MergeSort(a, l, mid);
            MergeSort(a, mid+1, h);
            merge(a,l,mid,h);
        }
    }

    public void merge(int a[] ,int l, int mid, int h) {
        int i=l , j=mid+1,temp;
        while(i<=mid && j<=high) {
            if(a[i]>a[j]) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
}