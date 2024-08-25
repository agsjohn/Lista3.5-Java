package lista3_5;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Lista3_5 {
    public static void main(String[] args) {
        float pedido = 0;
        int escolha, quantidade =0;
        DecimalFormat df = new DecimalFormat("0.00");
        do{
            escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha seu pedido\n10. Cachorro Quente (R$2,50)"
                    + "\n11. Bauru simples (R$6,00)\n12. Bauru com ovo (R$6,50)\n13. Hambúrguer (R$5,00)"
                    + "\n14. CheeseBurguer (R$5,50)\n15. Refrigerante (R$2,00)\n 0. Para finalizar pedido"));
            switch(escolha){
                case 10:
                    quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
                    pedido += (float) (quantidade * 2.5);
                    break;
                case 11:
                    quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
                    pedido += (float) (quantidade * 6);
                    break;
                case 12:
                    quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
                    pedido += (float) (quantidade * 6.5);
                    break;
                case 13:
                    quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
                    pedido += (float) (quantidade * 5);
                    break;
                case 14: 
                    quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
                    pedido += (float) (quantidade * 5.5);
                    break;
                case 15: 
                    quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade: "));
                    pedido += (float) (quantidade * 2);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Pedido concluído, o total foi R$"+df.format(pedido));
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
            }
        }while(escolha != 0);
    }
}
