void main() {
    int alcada = Integer.parseInt(IO.readln("Introduix alçada: "));
    int ample = Integer.parseInt(IO.readln("Introduix ample: "));
    for (int i = 0; i < alcada; i++){
        IO.print("\n");
        for (int j = 0; j < ample; j++){
            IO.print("#");
        }
    }
}