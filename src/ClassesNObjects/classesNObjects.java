package ClassesNObjects;

public class classesNObjects {
    public static void main(String[] args) {
//        Great p1 = new Great();
//        System.out.println(p1.x); //0
//        Great p2 = new Great();
//        p2.y = 20;
//        System.out.println(p2.y); //20

        //After creating constructor.
        //constructor with two parameter
        Great p3 = new Great(100,200);
        System.out.println(p3.x+p3.y); //300
        System.out.println(p3.y); //200
        //constructor with no parameter
        Great p4 = new Great();
        System.out.println(p4.x); //0
        System.out.println(p4.y); //0

//        Great p5 = new Great(10,20.0);
//        System.out.println(p5.x); //0
//        System.out.println(p5.y); //0

    }
    //creating class
    public static class Great{
        int x;
        int y;
       //constructor
        Great(int u, int v){
            x=u;
            y=v;
        }
        Great(){

        }
        Great(long d1, long d2){
//            x=d1;
//            y=d2;
        }
    }
}
