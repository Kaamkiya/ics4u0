/**
 * Author: Zia M
 * Date: Oct 30, 2026
 * Topic: unit 6 problemset 2
 */
import java.util.Arrays;
public class MyArray {
    public int[] fill(int n) {
        int[] a = new int[n];
        for (int i=0;i<n;i++) {
            a[i] = (int)(Math.random()*n)+1;
        }
        return a;
    }

    public void print(int[] a) {
        for (int n:a) System.out.print(n+",");

        System.out.println();
    }

    public int[] searchPositions(int[] a, int b) {
        int count=0;
        for (int n:a) {
            if (n==b) count++;
        }

        int[] res = new int[count];
        int idx=0;
        for (int i=0;i<a.length;i++) {
            if (a[i]==b) {
                res[idx]=i;
                idx++;
            }
        }
        return res;
    }

    public int[] addEnd(int[] a, int v) {
        int[] res = new int[a.length+1];
        for (int i=0;i<a.length;i++) {
            res[i]=a[i];
        }
        res[a.length]=v;
        return res;
    }

    public int[] addFront(int[] a, int v) {
        int[] res = new int[a.length+1];
        for (int i=0;i<a.length;i++) {
            res[i+1]=a[i];
        }
        res[0]=v;
        return res;
    }

    public int[] remove(int[] a, int v) {
        int[] res = new int[a.length-1];
        for (int i=0;i<a.length;i++) {
            if (i<v) {
                res[i]=a[i];
            } else if (i==v) {
                continue;
            } else {
                res[i-1]=a[i];
            }
        }
        return res;
    }

    public int[] insert(int[] a, int n, int p) {
        int[] res = new int[a.length+1];
        for (int i=0;i<a.length;i++) {
            if (i<p) {
                res[i]=a[i];
            } else {
                res[i+1]=a[i];
            }
        }
        res[p]=n;
        return res;
    }

    public int[] sort(int[] a) {
        Arrays.sort(a);
        return a;
    }

    public int[] twoSmallest(int[] a) {
        int[] res = new int[2];
        int smallest=Integer.MAX_VALUE;
        int smallestIdx = -1;
        for (int i=0;i<a.length;i++) {
            if (a[i]<smallest) {
                smallest=a[i];
                smallestIdx=i;
            }
        }
        res[0]=smallest;
        a=remove(a,smallest);
        smallest=Integer.MAX_VALUE;
        for (int n:a) {
            if (n<smallest) smallest=n;
        }
        res[1]=smallest;
        return res;
    }

    public String[] sort(String[] a) {
        Arrays.sort(a);
        return a;
    }

    public boolean palindrome(String s) {
        int left=0,right=s.length()-1;
        while (left!=right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public String[] insert(String[] a, String n, int p) {
        String[] res = new String[a.length+1];
        for (int i=0;i<a.length;i++) {
            if (i<p) {
                res[i]=a[i];
            } else {
                res[i+1]=a[i];
            }
        }
        res[p]=n;
        return res;
    }

    public int[] reverse(int[] a) {
        int[] res = new int[a.length];

        int j=0;
        for (int i=a.length-1;i>=0;i--) {
            res[j]=a[i];
            j++;
        }

        return res;
    }

    public String[] remove(String[] a, int v) {
        String[] res = new String[a.length-1];
        for (int i=0;i<a.length;i++) {
            if (i<v) {
                res[i]=a[i];
            } else if (i>v) {
                res[i-1]=a[i];
            }
        }
        return res;
    }
}
