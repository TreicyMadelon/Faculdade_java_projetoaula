package projetopesquisa;

public class Pesquisa {
    private int chateado;
    private int insatisfeito;
    private int satisfeito;
    private int muitoSatisfeito;
    
    public void IncrementarChateado(){
        chateado++;
    }
    public void IncrementarInsatisfeito(){
        insatisfeito++;
    }
    public void IncrementarSatisfeito(){
        satisfeito++;
    }
    public void IncrementarMuitoSatisfeito(){
        muitoSatisfeito++;        
    }
    public String mostrarResultado(){
        return "Chateado: "+ chateado +"  Insatisfeito: "+ insatisfeito + "  Satisfeito: "+ satisfeito + "  Muito Satisfeito: "+ muitoSatisfeito;
    }
}
