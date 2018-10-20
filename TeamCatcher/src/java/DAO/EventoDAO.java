package DAO;

import entity.Evento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Jesiel
 */
public class EventoDAO {

    public void cadastrar(Evento evento) {

        try {
            Connection cn = Conexao.getConexao();
            PreparedStatement pstm = cn.prepareStatement(
                    "INSERT INTO evento VALUES (?,?,?,?,?,?,?,?)");

            pstm.setInt(1, evento.getCodigo());
            pstm.setString(2, evento.getNome());
            pstm.setTime(3, evento.getHoraInicio());
            pstm.setTime(4, evento.getHoraFim());
            pstm.setDate(5, new java.sql.Date(evento.getDataInicio().getTime()));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Evento leUm(int codigo) {
        Evento evento = new Evento();

        try {
            Connection cn = Conexao.getConexao();
            PreparedStatement pstm = cn.prepareStatement("SELECT * FROM evento WHERE codigo = ?");
            pstm.setInt(1, codigo);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                evento = new Evento();
                evento.setCodigo(rs.getInt("codigo"));
                evento.setNome(rs.getString("nome"));
                evento.setHoraInicio(rs.getTime("horaInicio"));
                evento.setHoraFim(rs.getTime("horaFim"));
                evento.setDataInicio(rs.getDate("dataInicio"));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return evento;
    }

    public List<Evento> leTodos() {
        List<Evento> eventos = new ArrayList<Evento>();
        try {
            Connection cn = Conexao.getConexao();
            Statement stm = cn.createStatement();
            ResultSet rs = stm.executeQuery(
                    "SELECT * FROM evento");
            eventos = new ArrayList<Evento>();
            while (rs.next()) {
                Evento evento = new Evento();
                evento.setCodigo(rs.getInt("codigo"));
                evento.setNome(rs.getString("nome"));
                evento.setHoraInicio(rs.getTime("horaInicio"));
                evento.setHoraFim(rs.getTime("horaFim"));
                evento.setDataInicio(rs.getDate("dataInicio"));
                eventos.add(evento);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return eventos;
    }

    public void altera(Evento evento) {
        FacesContext ct = FacesContext.getCurrentInstance();
        FacesMessage mensagem;

        try {
            Connection cn = Conexao.getConexao();
            PreparedStatement pstm = cn.prepareStatement(
                    "UPDATE evento SET tipo = ?, nome=? WHERE idEvento = ?");
            pstm.setInt(1, evento.getCodigo());
            pstm.setString(2, evento.getNome());
            pstm.setTime(3, evento.getHoraInicio());
            pstm.setTime(4, evento.getHoraFim());
            pstm.setDate(5, new java.sql.Date(evento.getDataInicio().getTime()));
            mensagem = new FacesMessage("Usuário alterado com sucesso");
            mensagem.setSeverity(FacesMessage.SEVERITY_INFO);
            pstm.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }
    }

    public int exclui(int codigo) {
        int ret = 0;
        try {
            Connection cn = Conexao.getConexao();
            PreparedStatement pstm = cn.prepareStatement(
                    "DELETE FROM evento WHERE codigo = ?");
            pstm.setInt(1, codigo);
            ret = pstm.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }
        return ret;
    }

}
