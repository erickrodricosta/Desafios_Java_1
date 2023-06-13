/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia_11;

/**
 *
 * @author ficdev
 */
import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TesteObra {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("GaleriaPU2");
        EntityManager em = factory.createEntityManager();

        ObraDeArte obra = new ObraDeArte();
        obra.setAutor("Adir Sodré");
        obra.setTitulo("Caminho de São Francisco");
        obra.setProcedencia("Museu da Caixa D'Agua");
        obra.setTipo("quadro");
        obra.setDataObra(parseData("25/11/1988"));
        obra.setTecnica("Óleo sobre tela");
        obra.setDimensoes("154cm x 154cm");

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        em.persist(obra);
        tx.commit();

        em.close();
        factory.close();
    }

    private static Calendar parseData(String data) {
        try {
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(data);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return calendar;
        } catch (ParseException ex) {
            throw new IllegalArgumentException(ex);
        }
    }
}
