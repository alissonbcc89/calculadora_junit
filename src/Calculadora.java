public class Calculadora {

    private int resultado = 0;
    public double somar(int a, int b) {
        resultado = a + b;
        return resultado;
    }

    public double subtrair(int a, int b) {
        resultado = a - b;
        return resultado;

    }

    public double multiplicar(int a, int b)
    {
        resultado = a * b;
        return resultado;
    }

    public double dividir(int a, int b){
        double d1 = Double.valueOf(a);
        double d2 = Double.valueOf(b);

        double r = d1 / d2;
        return r;
    }


}
