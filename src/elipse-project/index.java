package elipse-project;

public class index {

    public static void main(String[] args){
        // create object 
        Calculator a =new Calculator();
        // use object method
        int addition = a.add(3,5);
        int subtraction = a.sub(3,5);
        int divide = a.div(3,5);
        int multiplication = a.mul(2,3);
        // Output 
        System.out.println("Sum : "+addition);
        System.out.println("Sub : "+subtraction);
        System.out.println("Mul : "+multiplication);
        System.out.println("Div : "+divide);
        
        
    }
    
}
