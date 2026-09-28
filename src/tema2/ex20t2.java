void main() {
    for (int i = 1; ; i++){
        IO.println(i);
        String eleccion = IO.readln("Desitja continuar (yes / no)? ");
        if (eleccion.equals("no")) {
            IO.println("Bye bye");
            break;
            }
    }
}