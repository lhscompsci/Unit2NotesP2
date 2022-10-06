import static java.lang.System.*;
// object class
// object factory
// blueprints
public class Bug {

    //instance variables
    private int size;
    private boolean fly;

    //constructors
    public Bug(){       //default
        size = 3;
        fly = false;
    }

    public Bug(int s, boolean f){   //overridden
        size = s;
        fly = f;
    }

    //modifier methods
    public void setSize(int sz){
        size = sz;      // private = param
    }
    public void setFly(boolean f){
        fly = f;
    }

    //accessor methods
    public int getSize(){
        return size;
    }
    public boolean canFly(){
        return fly;
    }


    public void speak(){
        out.println("chirp chirp!");
    }

    public void sayName(){
        out.println("creepy crawly bug");
    }

    public int multiplicator(int alpha, int beta){
        return alpha * beta;
    }

}
