package org.example;

import org.junit.jupiter.api.BeforeAll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
public abstract class DaoAbstractTest{
    private static final String URL = "URL";
    private static final String USER = "USERNAME";
    private static final String PASSWORD = "PASSWORD";
    private static String url;
    private static String user;
    private static String password;

    @BeforeAll
    public static void initTest(){
        DaoAbstractTest.getConnection("./config.properties");
        DaoAbstractTest.initDB("./testContoCorrente.sql");
    }

    public static void getConnection(String configProperties){
        Properties p = new Properties();
        try(InputStream is = DaoAbstractTest.class.getClassLoader().getResourceAsStream(configProperties)){
            p.load(is);
            url = p.getProperty(URL);
            user = p.getProperty(USER);
            password = p.getProperty(PASSWORD);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void initDB(String scriptSql){
        try(Connection c = DriverManager.getConnection(url, user, password)){
            Statement stm = c.createStatement();
            InputStream is = DaoAbstractTest.class.getClassLoader().getResourceAsStream(scriptSql);
            String initInstructions = "";
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line;
            while ((line = br.readLine()) != null){
                initInstructions += line;
            }
            String[] arrayInstr = initInstructions.split(";");
            for(int i = 0; i < arrayInstr.length; i++){
                stm.executeUpdate(arrayInstr[i]);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public abstract void findByTextCognome() ;
    public abstract void findByTextCodiceFiscale();
    public abstract void add();

}