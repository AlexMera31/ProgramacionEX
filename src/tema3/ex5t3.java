void main() {
    int[] vida = {100, 85, 72, 60, 42, 15};
    for (int i = 0; i < 6; i++) {
        IO.print("Nivell 1: " + vida[i]);
        if (vida[i] < 20){
            IO.println(" PERILL");
        }
        IO.println();
    }
}