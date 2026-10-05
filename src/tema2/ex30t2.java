void main() {
    int alcada = Integer.parseInt(IO.readln("Introduix alçada: "));
    int ample = alcada;
    for (int i = 0; i < alcada; i++){

        for (int k = 1; k < ample; k++){
            IO.print(" ");
        }
        for (int j = alcada; j >= ample; j--){
            IO.print("\uD83C\uDF77");
        }
        ample--;
        IO.print("\n");
    }
}