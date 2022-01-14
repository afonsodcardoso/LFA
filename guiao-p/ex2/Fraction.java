import static java.lang.System.*;
import java.util.Scanner;

public class Fraction {
    public Fraction(long num, long den){
        this.num = num;
        this.den = den;
    }

    public long num(){
        return num;
    }

    public long den(){
        return den;
    }

    @Override public String toString(){
        return ""+num+(den != 1 ? "/"+den : "");
    }

    public Fraction mult(Fraction other){
        long newNum = num * other.num;
        long newDen = den * other.den;
        Fraction res = new Fraction(newNum, newDen);
        return res;
    }

    public Fraction div(Fraction other){
        long newNum = num * other.den;
        long newDen = den * other.num;
        Fraction res = new Fraction(newNum, newDen);
        return res;
    }

    public Fraction add(Fraction other){
        long newNum = (num * other.den) + (other.num * den) ;
        long newDen = den * other.den;
        Fraction res = new Fraction(newNum, newDen);
        return res;
    }

    public Fraction sub(Fraction other){
        long newNum = (num * other.den) - (other.num * den) ;
        long newDen = den * other.den;
        Fraction res = new Fraction(newNum, newDen);
        return res;
    }

    private long num;
    private long den;
    static final Scanner input = new Scanner(System.in);
}