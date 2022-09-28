import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        Bug dude = new Bug();  //instantiation
        Bug dudette = new Bug();
        Bug dudekid = new Bug();

        dudette.speak();
        dudekid.speak();
        dudekid.speak();
        dudette.sayName();
        dude.sayName();

        int ans = dudette.multiplicator(7,9);
        out.println("the answer is " + ans);
    }
}