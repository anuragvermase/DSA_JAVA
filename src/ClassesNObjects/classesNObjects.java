package ClassesNObjects;

public class classesNObjects {
    public static void main(String[] args) {
//        Great p1 = new Great();
//        System.out.println(p1.x); //0
//        Great p2 = new Great();
//        p2.y = 20;
//        System.out.println(p2.y); //20
        Great p3 = new Great(100,200);
        System.out.println(p3.x+p3.y); //300
        System.out.println(p3.y); //200
        Great p4 = new Great();
        System.out.println(p4.x); //0
        System.out.println(p4.y); //0

    }
    //creating class
    public static class Great{
        int x;
        int y;
//        constructor
        Great(int u, int v){
            x=u;
            y=v;
        }
        Great(){

        }
    }
}
