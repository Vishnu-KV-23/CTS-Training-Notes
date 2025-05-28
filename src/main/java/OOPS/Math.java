package OOPS;

public class Math {

    /**
     * polymorphism: existrs in different forms
     * 1.Static / compile time polymorphism function overloading , no operator overloading
     * 2.dynamic/runtime  polymorphism: inheritance
     *
     * Function overloading  : having multiple methgds with same name but with different parameters / with different function signature(method name and
     * parameter list(number.type,order))
     *
     *
     */
    //FUNCTION OVERLOADING
    // make number ,order or type differrent
public int sum(int a, int b){
    return a+b ;
}
public long sum(long a, long b){
    return a+b ;
}
public long sum(int a, long b){
    return a+b ;
}
public long sum(long a, int b){
    return a+b ;
}




}
