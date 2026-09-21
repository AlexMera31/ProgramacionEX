void main() {
    int numero1 = Integer.parseInt(IO.readln("Introdueix el primer número: "));
    int numero2 = Integer.parseInt(IO.readln("Introdueix el segon número: "));
    int numero3 = Integer.parseInt(IO.readln("Introdueix el tercer número: "));
    if (numero1 > numero2){
        if (numero1 > numero3){
            IO.println("El número " + numero1 +" es el major.");
        } else {
            IO.println("El número " + numero3 +" es el major.");
        }
    } else if (numero2 > numero1){
        if (numero2 > numero3){
            IO.println("El número " + numero2 +" es el major.");
        } else {
            IO.println("El número " + numero3 +" es el major.");
        }
    } else if (numero3 > numero1) {
        if (numero3 > numero2){
            IO.println("El número " + numero3 +" es el major.");
        } else {
            IO.println("El número " + numero2 +" es el major.");
        }
    } else {
        IO.println("Els tres numeros son iguals");
    }
}