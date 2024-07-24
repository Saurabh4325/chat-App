public class Lecture5 {
    public static void main(String[] args){
        float f=(float)5.5;//by default consider decimal to be double
        float f2=5.5f;
        double d=10.5;
        char ch='a';
        System.out.println(ch);
        int m=5;
        int n=m++; // n will be 5, m will be 6
        System.out.println("M is: "+m+",N is: "+n);
        int p=5;
        int q=++p; // p and q will be 6
        System.out.println("P is: "+p+",Q is: "+q);
    }
}
