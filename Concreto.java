/*
 * Classe Concreto para instânciar o objeto concreto.
 * Atributos abstraidos: base, altura, comprimento.
 * Método concretoVolume(); para calcular o volume do concreto.
 */
import javax.swing.JOptionPane;

public class Concreto{
    private float base;
    private float altura;
    private float comprimento;
    public float getBase() {
        return base;
    }
    public void setBase(float base) {
        this.base = base;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getComprimento() {
        return comprimento;
    }
    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public void mostrarResultado(float volume){
        String volume1 = Float.toString(volume);
        JOptionPane.showMessageDialog(null,"O volume de concreto calculado é: "+ volume1 + "mts cubicos.");
    }
    
}