void main() {
    double n1 = Double.parseDouble(IO.readln("Introdueix el primer número: "));
    double n2 = Double.parseDouble(IO.readln("Introdueix el segon número: "));
    String op = IO.readln("Operació (+, -, *): ");
    double r = switch (op){
      case "+" -> (n1 + n2);
      case "*" -> (n1 * n2);
      case "-" -> (n1 - n2);
      default -> 0;
    };
    IO.println("Resultat: " + n1 + " " + op + " " + n2 + " " + "= " + r);
}