void main() {
    int s = Integer.parseInt(IO.readln("Introdueix els segons totals: "));
    IO.println(s + " segons equivalen a: " + (s/60) + " minuts i " + (s%60) + " segonds");
}