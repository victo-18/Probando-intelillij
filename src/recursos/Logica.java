package recursos;
public class Logica {
 private int l;

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public int[] getLost() {
        return lost;
    }

    public void setLost(int[] lost) {
        this.lost = lost;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    private String n;
 private int[] lost;
        public int menu(){
            int[] x ={6,8,9,10};
            int suma =0;
            for (int i = 0;i< x.length;i++){
                suma += x[i];
            }
          return suma;
        }

}
