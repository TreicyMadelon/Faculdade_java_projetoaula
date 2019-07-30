package projetopesquisa;

import javax.swing.JOptionPane;

public class ProjetoPesquisa {

    public static void main(String[] args) {
        String str, ops;
        int op=9;
        Pesquisa p1 = new Pesquisa();
        str="";
        do{
            str= "Pesquisa de satisfação\n1. Chateado\n2. Insatisfeito\n3. Satisfeito\n4. Muito Statisfeito\n0. Sair";            
            ops = JOptionPane.showInputDialog(str+"\n\n"+p1.mostrarResultado()+"\n\n Entre com um inteiro:");
            op = Integer.parseInt(ops);
            if(op==1){
                p1.IncrementarChateado();
            }else if(op==2){
                p1.IncrementarInsatisfeito();
            }else if(op==3){
                p1.IncrementarSatisfeito();
            }else if(op==4){
                p1.IncrementarMuitoSatisfeito();
            }else if(op>4){
                JOptionPane.showMessageDialog(null,"Opção não existe!!");
            }
        }while (op!=0);
    }
    
}
