import static java.lang.IO.print;
import static java.lang.IO.println;

void main() {
    for (int i = 0; i < 4; i++) {
        print("A");
    }
    for (int j = 0; j < 10; j++) {
        print("A");
        print("j");
        print("A");
        for (int k = 0; k < 3; k++) {
            if (j <= 8) {
                print("-");
            }
        }
    }
    for (int i = 0; i < 4; i++) {
        print("A");
    }
    print("j");


}