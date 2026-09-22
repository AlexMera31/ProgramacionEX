void main() {
    int suma = 0;
    int contador = 0;
    int numero = Integer.parseInt(IO.readln("Introduce un número (0 para acabar): "));
    while (numero != 0) {
        suma += numero;
        contador += 1;
        numero = Integer.parseInt(IO.readln("Vuelve a introducir un número (0 para acabar): "));
    }
    IO.println("La suma total es de " + suma);
    if (contador == 0){
        IO.println("ERROR\nNo hay datos");
    } else {
        IO.println("La media es de " + (suma / contador));
    }
}