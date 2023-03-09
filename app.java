import javax.swing.JOptionPane;

/*
 * Criar uma aplicação em Java que calcule o volume de concreto para o 
    trabalho com vigas em construção civil.
    Sabe-se que a fórmula para o cálculo deste volume é:
            (base x altura x comprimento).
    O cliente necessita de uma aplicação que solicite os dados referentes
    à base, altura e comprimento das vigas a serem trabalhadas e seja 
    informado o resultado através de uma caixa de mensagem.
    Faça uso das técnicas de encapsulamento.
 */

public class app {

    public static void main(String[] args) {
        String baseSt, alturaSt, comprimentoSt;
        Concreto concreto = new Concreto();
        baseSt = JOptionPane.showInputDialog("Digite o tamanho da base em mts");
        alturaSt = JOptionPane.showInputDialog("Digite o tamanho da altura em mts");
        comprimentoSt = JOptionPane.showInputDialog("Digite o tamanho do comprimento em mts");

        double baseDouble = Float.parseFloat(baseSt);
        double alturaDouble = Float.parseFloat(alturaSt);
        double comprimentoDouble = Float.parseFloat(comprimentoSt);
        double volume;
        volume = baseDouble * alturaDouble * comprimentoDouble;
        
        concreto.mostrarResultado((float) volume);
    }
    
}
