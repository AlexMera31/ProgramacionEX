void main() {
    int inicio = Integer.parseInt(IO.readln("Posición inicial: "));
    int objetivo = Integer.parseInt(IO.readln("Posición objetivo: "));
    int distancia = Integer.parseInt(IO.readln("Distancia por movimiento: "));

    for (; ; inicio += distancia) {
        IO.println(inicio);
        if (inicio > objetivo) {
            break;
        }
    }
}