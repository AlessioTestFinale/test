package org.example;
import dao.DaoContoCorrente;

import dto.ContoCorrente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;


public class ContoCorrenteTest extends DaoAbstractTest {

    @Override
    @Test
    public void findByTextCognome() {
        DaoContoCorrente dao = new DaoContoCorrente();
        ContoCorrente expected = new ContoCorrente("Distefano");
        Assertions.assertDoesNotThrow(
                (Executable) ()-> dao.findByTextCognome("Distefano")
        );
    }

    @Override
    @Test
    public void findByTextCodiceFiscale() {
        DaoContoCorrente dao = new DaoContoCorrente();
        ContoCorrente expected = new ContoCorrente("DSTLSS96B05H355W");
        Assertions.assertDoesNotThrow(
                ()-> dao.findByTextCognome("DSTLSS96B05H355W")
        );
    }

    @Override
    @Test
    public void add() {
        DaoContoCorrente dao = new DaoContoCorrente();
        ContoCorrente contiNuovo = new ContoCorrente("2","01234", "56789","012345678901","Alessandro","Rocci","RCCLSN96B05H355W");
        Assertions.assertDoesNotThrow(() -> dao.add(contiNuovo));
        try{
            DaoContoCorrente preso = dao;
            Assertions.assertNotNull(preso, "errore di inserimento, utente inserito non dovrebbe essere nullo");
        } catch (Exception e) {
            System.out.println(e.getStackTrace().toString());
        }
    }
}

