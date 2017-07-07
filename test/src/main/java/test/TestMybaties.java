package test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.yanghai.dao.model.Person;
import org.yanghai.imp.impls.ContactImp;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by yh on 17-7-7.
 */
public class TestMybaties {
    public static void main(String[] args) throws Exception {
        ContactImp contactImp = new ContactImp();
        Person person =contactImp.IselectByPrimaryKey("1");
        System.out.printf(person.toString());

//        String  conf = "mybatiesconfig.xml";
//        Reader reader =
//                Resources.getResourceAsReader(conf);
//        //创建SessionFactory对象
//        SqlSessionFactoryBuilder sfb =
//                new SqlSessionFactoryBuilder();
//        SqlSessionFactory sf = sfb.build(reader);
//        //创建Session
//        SqlSession session = sf.openSession();
//        System.out.println(session.toString());
//        //关闭
//        session.close();

    }
}
