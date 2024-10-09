import javax.swing.JOptionPane;

public class CalculadoraBásica {
    
    public static void soma(int a, int b) {

        int soma = a + b;
        JOptionPane.showMessageDialog(null,"A soma dos números é "+soma,"calculadora",-1);

    }

    public static void subtracao(int a, int b){

        int subtracao = a - b;
        JOptionPane.showMessageDialog(null,"A subtração dos números é "+subtracao, "Calculadora",-1);

    }
        public static void divisao(int a, int b){

            int divisao = a / b;
            JOptionPane.showMessageDialog(null,"A divisão dos números é "+divisao, "Calculadora",-1);

    }
        public static void multiplicacao(int a, int b){

            int multiplicacao = a * b;
            JOptionPane.showMessageDialog(null,"A multiplicação dos números é "+multiplicacao, "Calculadora",-1);
            
    }

    public static void main(String[] args) {
        
        String entrada = JOptionPane.showInputDialog(null, "Digite o 1º número inteiro: ", "Calculadora",-1);
        int a = Integer.parseInt(entrada);

        entrada = JOptionPane.showInputDialog(null, "Digite o 2º número inteiro: ","Calculadora",-1);
        int b = Integer.parseInt(entrada);

        soma(a, b);
        subtracao(a, b);
        divisao(a, b);
        multiplicacao(a, b);


    }

    }
        
    

