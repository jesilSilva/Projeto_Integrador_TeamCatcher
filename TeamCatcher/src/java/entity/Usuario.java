package entity;

/**
 *
 * @author Jesiel
 */
public class Usuario {
    
    private int codigo;
    private String primeiroNome;
    private String segundoNome;
    private int cep;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public void setSegundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public Usuario() {
    }

    public Usuario(int codigo, String primeiroNome, String segundoNome, int cep) {
        this.codigo = codigo;
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.cep = cep;
    }
    
    
}
