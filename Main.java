public class Main {

    public static void main(String[] args){
        int x = 2;
        int y = 2;

        System.out.println(maxOfTwo(x, y));

    }

    public static int maxOfTwo(int x, int y){
        int greater = 0;
        if (x == y){
            greater = x;
            System.out.println("values identical");
        }
        if (x > y ){
            System.out.print("x: ");
            greater = x;
        } else if (x < y ){
            System.out.print("y: ");
            greater = y;
        
        }
        return greater;
    }
}