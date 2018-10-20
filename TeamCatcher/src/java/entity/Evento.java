package entity;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author Jesiel
 */
public class Evento {
    
    private int codigo;
    private String nome;
    private Time horaInicio;
    private Time horaFim;
    private Date dataInicio;
    private Date dataFim;
    private float custo;
    private int capacidade;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(Time horaFim) {
        this.horaFim = horaFim;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Evento() {
    }

    public Evento(int codigo, String nome, Time horaInicio, Time horaFim, Date dataInicio, Date dataFim, float custo, int capacidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.custo = custo;
        this.capacidade = capacidade;
    }
    
     
}
