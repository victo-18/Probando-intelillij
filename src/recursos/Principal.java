package recursos;

import java.awt.*;

public class Principal {
    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Ventana vent = new Ventana();
            }
        });
    }
}
