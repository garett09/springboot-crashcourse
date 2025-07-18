public class Calculator {

    public boolean status = false;
    public boolean isOn() {
        return status; // Placeholder implementation
    }
    public void turnOn() {
        status = true; // Set the calculator to "on"
    }

    public void turnOff() {
        status = false; // Set the calculator to "off"
    }

    public boolean isOff(){
    return !status;
    }

    public int sum(int a, int b){
        return a+b; // Returns the sum of two integers
    }

    public int difference(int a, int b){
        return a - b; // Returns the difference of two integers
    }

    public float divide(float a, float b){
        return a / b; // Returns the quotient of two floats
    }

    public int multiply(int a, int b) {
        return a * b; // Returns the product of two integers
    }


}
