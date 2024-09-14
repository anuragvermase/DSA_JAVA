package String;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        /*
        //charAt() index 0
        System.out.println(sb.charAt(0)); //T

        //setCharAt index 0
        sb.setCharAt(0,'P');
        System.out.println(sb); //Pony
        */

        // insert()
        sb.insert(2, "n");
        System.out.println(sb); //Tonny

        //delete() - delete the extra 'n'
        sb.delete(2,4);
        System.out.println(sb); //Toy

        //append()
        sb.append(" ");
        sb.append("Car");
        System.out.println(sb); //Toy Car

        //length()
        System.out.println(sb.length()); //7
    }
}
