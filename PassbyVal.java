public class PassbyVal {
    public static void main(String[] args) {
        int x=4;
        int y=5;
        System.out.println(x +" " +y);
        sum(x,y);
        System.out.println(x+" "+ y);
    }
    static void sum(int x,int y){
        x=x+2;
        y=y+3;
    }
}

// //size of object =>header size(object headers=>) +fields size(total size depends on the variable) + padding(optinal , 8 k multiples ko complete krne k liye)
