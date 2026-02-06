import java.util.Scanner;

class Complex {
    int num1,num2;

    public Complex(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    static void add(Complex n1,Complex n2)
    {
        int real = n1.num1+ n2.num1;
        int img = n1.num2 + n2.num2;
        System.out.print(real+" + "+img+"i");
    }
    

    // TODO: parameterized constructor Complex(int real, int imag)

    // TODO: Method to add two complex numbers: add(Complex other) returning new Complex
    // Or static method add(Complex c1, Complex c2)
}

public class ComplexAddition {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // TODO: Read real1, imag1
            // TODO: Read real2, imag2
            
            // TODO: Create two Complex objects
            
            // TODO: Add them
            
            // TODO: Print result in "real + imagi" format (e.g., "6 + 8i")
            int real1 = sc.nextInt();
            int img1 = sc.nextInt();
            Complex c1  = new Complex(real1,img1);

            int real2 = sc.nextInt();
            int img2 = sc.nextInt();
            Complex c2  = new Complex(real2,img2);

            Complex.add(c1,c2);
        }
        
    
}
