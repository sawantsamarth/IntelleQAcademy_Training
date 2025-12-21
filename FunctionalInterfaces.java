// the functional interface  can have a single abstract method.

// return type functionName(){
//      return a+b;
// }

// int add(int a, int b)
// if two abstract methods are present then it violets the rule of functinal interface and it is no longer remains a functional interface. 


@FunctionalInterface
interface MathOperation {
    int operate(int a, int b); 
}

public class FunctionalInterfaces {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a+b;

        MathOperation multiply = (a, b) -> a*b;

        System.out.println("Addition: "+ add.operate(6, 9));
        System.out.println("Multiply: "+ multiply.operate(6, 9));
    }
}