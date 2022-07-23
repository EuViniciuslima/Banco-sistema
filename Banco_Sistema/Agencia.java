import java.util.List;
import java.util.stream.*;
import java.util.ArrayList;

public class Agencia
{
    private String codigo;
    ArrayList<Conta> contas = new ArrayList<Conta>();
    
    public Agencia() {
        
    }
    
    public boolean sacar(String codigoConta, Double valorSaque) {
        Conta conta;
        conta = (contas.stream().filter(c -> c.getCodigo() == codigoConta).findFirst().get());
        return conta.sacar(valorSaque);
    }
    
    public Double verSaldo(String codigoConta) {
        Conta conta;
        conta = (contas.stream().filter
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public ArrayList<Conta> getContas() {
        return contas;
    }
    
    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }

}
