
package exercicio3_uc6;

import java.util.ArrayList;

public class Pagamentos {
    
    private String nomeEmpresa;
    private ArrayList<Imposto> listaImpostos;
    
    public Pagamentos(String nomeEmpresa){
        this.nomeEmpresa = nomeEmpresa;
        this.listaImpostos = new ArrayList<>();
    }
    public void adicionarImposto(Imposto imposto){
        this.listaImpostos.add(imposto);
    }
    public String getNomeEmpresa(){
        return nomeEmpresa;
    }
    public void setNomeEmpresa(String nomeEmpresa){
        this.nomeEmpresa = nomeEmpresa;
    }
    public ArrayList<Imposto> getListaImpostos(){
        return listaImpostos;
        
    }
    
}
