package entity;

/**
 *
 * @author Jesiel
 */
public class Participa {
    private Usuario codigoUsuario;
    private Evento codigoEvento;

    public Participa(Usuario codigoUsuario, Evento codigoEvento) {
        this.codigoUsuario = codigoUsuario;
        this.codigoEvento = codigoEvento;
    }

    public Usuario getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(Usuario codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public Evento getCodigoEvento() {
        return codigoEvento;
    }

    public void setCodigoEvento(Evento codigoEvento) {
        this.codigoEvento = codigoEvento;
    }

    public Participa() {
    }
    
    
    
}
