package Controller;

public class Controller extends Thread{
        private int sapo;
        private int op;
        private int ale;
        private static int posi;
        private static int[] vt = new int[5] ;

        public Controller(int sapo, int op) {
            this.sapo = sapo;
            this.op = op;
        }
        public void run() {
            while (sapo <= 100) {
                ale = (int) (Math.random()*51);
                sapo = sapo + ale;
                if(sapo < 100){
                    System.out.println("Sapo "+ op +" pulou "+ale +" metros, falta "+(100-sapo)+" metros, total= "+sapo);
                }if (sapo > 100) {
                    colocacao();
                    System.out.println("Sapo "+ op +" cruzou a linha de chegada em "+ posi+"o lugar");
                }
            }
        }
        public void colocacao(){
            posi++;
    }
}

