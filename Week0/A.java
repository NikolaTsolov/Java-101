//import B.java;
public class A extends B {
        public static void main(String args[]){
        System.out.println("Hello World");
        int l = args.length;
        for(int i=0;i<l;i++) System.out.println(args[i]);
        System.out.println(B.rock());
    }
}
