void main() {
    int[] numero = {10, 20, 30, 40, 50};
    IO.println("Array inicial:");
    for (int i = 0; i < 5; i++) {
        IO.print(numero[i] + " ");
    }
    IO.println();
    int cambio = Integer.parseInt(IO.readln("Posició que vols modificar: "));
    int valor = Integer.parseInt(IO.readln("Nou valor: "));
    numero[cambio] = valor;
    IO.println("Array modificat:");
    for (int i = 0; i < 5; i++) {
        IO.print(numero[i] + " ");
    }

}