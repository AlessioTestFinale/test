package dao;

import dto.ContoCorrente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DaoContoCorrente implements IDao<ContoCorrente,String> {
    private static final String url = "URL";
    private static final String username = "USERNAME";
    private static final String password = "PASSWORD";
    public List<ContoCorrente> findByTextCognome(String text) {
        List<ContoCorrente> result = new ArrayList<>();
        try(Connection c = DriverManager.getConnection(url, username, password)){
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM test.conticorrenti where cognomeTitolare =" + text);
            while(rs.next()){
                ContoCorrente conti = new ContoCorrente(rs.getString("cognomeTitolare"));
                result.add(conti);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public List<ContoCorrente> findByTextCodiceFiscale(String text) {
        List<ContoCorrente> result = new ArrayList<>();
        try(Connection c = DriverManager.getConnection(url, username, password)){
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM test.conticorrenti where codiceFiscaleTitolare =" + text);
            while(rs.next()){
                ContoCorrente conti = new ContoCorrente(rs.getString("codiceFiscaleTitolare"));
                result.add(conti);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public ContoCorrente add(ContoCorrente elemento) {
        try(Connection c = DriverManager.getConnection(url,username,password)){
            PreparedStatement ps = c.prepareStatement("insert into test.conticorrenti(cin, abi, cab, numeroConto, nomeTitolare, cognomeTitolare, codiceFiscaleTitolare) values(?,?,?,?,?,',?);");
            ps.setString(1,elemento.getCin());
            ps.setString(2,elemento.getAbi());
            ps.setString(3,elemento.getCab());
            ps.setString(4,elemento.getNumeroConto());
            ps.setString(5,elemento.getNomeTitolare());
            ps.setString(6,elemento.getCognomeTitolare());
            ps.setString(7,elemento.getCodiceFiscaleTitolare());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return elemento;
    }
}
