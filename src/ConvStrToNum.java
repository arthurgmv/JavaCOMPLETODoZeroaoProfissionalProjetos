import javax.swing.*;

public class ConvStrToNum {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo número: ");

        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);
        System.out.println(numero1 + numero2);

        double soma = numero1 + numero2;
        JOptionPane.showMessageDialog(null,"A soma é: " + soma +" \n A média é: " + soma/2);


    }

}
