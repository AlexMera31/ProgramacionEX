void main() {
    int num1 = Integer.parseInt(IO.readln("Introdueix el primer enter: "));
    int num2 = Integer.parseInt(IO.readln("Introdueix el segon enter: "));
    IO.println("Suma: " + (num1+num2));
    IO.println("Resta: " + (num1-num2));
    IO.println("Multiplicació: " + (num1*num2));
    IO.println("Divisió entera: " + (num1/num2));
    IO.println("Residu: " + (num1%num2));
}