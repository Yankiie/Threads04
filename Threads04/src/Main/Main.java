package Main;
import Controller.Controller;

public class Main {
        public static void main(String[] args) {
            int sapo = 0;
            for (int op = 1; op < 6; op ++) {
                Thread Controller = new Controller(sapo, op);
                Controller.start();
        }
    }
}

