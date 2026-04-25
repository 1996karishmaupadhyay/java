public class PassbyRef {
    public static void main(String[] args) {
        Random r1 = new Random(5, 8);
          System.out.println(r1.x + " " + r1.y);
     sum(r1); 

        System.out.println(r1.x + " " + r1.y);
    }

    static void sum(Random r) {
        r.x = r.x + 10;
        r.y = r.y + 6;
    }
}

class Random {
    int x;
    int y;

    Random(int x, int y) {
        this.x = x;
        this.y = y;
    }
}