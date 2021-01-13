public class Hilo2 extends Thread {
    public boolean c2 = true;
    int contador2 = 0;

    public int getContador2() {
        return contador2;
    }

    public void setContador2(int contador2) {
        this.contador2 = contador2;
    }

    public void run() {
        while (c2) {
            contador2 = contador2 + 1;
            DEF123.Actdef.correr2(getContador2());
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
