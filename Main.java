public class Main {
    
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        
        Calculadora calculadora = new Calculadora();
        
        int resultadoSuma = calculadora.sumar(num1, num2);
        int resultadoResta = calculadora.restar(num1, num2);
        
        System.out.println("La suma de " + num1 + " y " + num2 + " es " + resultadoSuma);
        System.out.println("La resta de " + num1 + " y " + num2 + " es " + resultadoResta);
    }
}