void main() {
    int fila = Integer.parseInt(IO.readln("Introduix el número de files: "));
    int columna = Integer.parseInt(IO.readln("Introduix el número de columnes: "));
    for (int i = 0; i < fila; i++){
        IO.print("\n");
        for (int j = 0; j < columna; j++){
            IO.print("(" + i + "," + j + ")");
        }
    }
}   