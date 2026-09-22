void main() {
    int numero = Integer.parseInt(IO.readln("Introdueix un número: "));
    for (int i = 10; i > 0; i--){
        IO.println(numero + " * " + i + " = " + (numero*i));
    }
}