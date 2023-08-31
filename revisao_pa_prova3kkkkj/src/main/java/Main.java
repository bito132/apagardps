import entidades.Alunokk;
import entidades.Notakk;
import entidades.Professorkk;
import entidades.Turmakk;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ///Alunokk aluno1 = new Alunokk("senhafuerte", Arrays.asList(new Notakk()));

        //Turmakk turma1 = new Turmakk(12, Arrays.asList());

        Professorkk professor1 = new Professorkk("senhafuerte", "123456789", "Juelinton", "sphihihiha");

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(professor1);

        transaction.commit();

        List<Professorkk> professoeskkj = session.createQuery("from Professorkk", Professorkk.class).list();

        professoeskkj.forEach(p -> System.out.println(p));
    }
}
