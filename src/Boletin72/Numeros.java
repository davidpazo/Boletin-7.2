package Boletin72;

/**
 *
 * @author dpazolopez
 */
import javax.swing.JOptionPane;

public class Numeros {

    private short num1;
    private short num2;

    public Numeros() {
    }

    public Numeros(short n1) {
        num1 = n1;
    }

    public void setNum1(short n1) {
        num1 = n1;
    }

    public short getNum1() {
        return num1;
    }

    public short pedirDato() {
        String v = JOptionPane.showInputDialog("Introduce dato");
        short valor = Short.parseShort(v);
        return valor;
   // Tamen return ShortParseShort(JOptionpane.ShowInputDialog("introduce dato");
    }

    public void Condicion() {
        if (num1 > 0) {
            JOptionPane.showMessageDialog(null, "+");
        } else if (num1 < 0) {
            JOptionPane.showMessageDialog(null, "-");
        }
        else{
            JOptionPane.showMessageDialog(null, "0");
    }
}
}
