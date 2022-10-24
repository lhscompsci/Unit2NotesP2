import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        Bug dude = new Bug(35,false);  //instantiation
        Bug dudette = new Bug(25,true);
        Bug dudekid = new Bug();

        dudette.speak();
        dudekid.speak();
        dudekid.speak();
        dudette.sayName();
        dude.sayName();

        dude.setFly(true);
        dudette.setSize(43);


        int ans = dudette.multiplicator(7,9);
        out.println("the answer is " + ans);

        //static methods
        //mostly in library/helper classes

        //The Math class

        out.println(Math.pow(3,7));


        // Random Numbers (RNG)  (PNG)
        //  Math.random() ==>  [0.0, 1.0)

        // range = upper - lower + 1
        // (int)(Math.random() * range + lower)

        int d6 = (int)(Math.random()*6 + 1);
        out.println("you rolled: " + d6);


        //Strings
        //          0123456789
        String s = "howdy yall";
        //stings are immutable

        out.println(s.charAt(4));
        out.println(s.length());
        out.println(s.substring(3));    // from spot to the end
        out.println(s.substring(3,7));          // from first up to but not including second
        out.println(s.indexOf("owd"));
        out.println(s.indexOf("dog"));
        out.println(s.lastIndexOf("all"));
        out.println(s.indexOf("y"));
        out.println(s.lastIndexOf("y"));


    }
}