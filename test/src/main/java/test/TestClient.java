package test;

import com.caucho.hessian.client.HessianProxyFactory;
import org.yanghai.dao.model.Person;
import org.yanghai.imp.intf.ContactService;


/**
 * Created by yh on 17-7-5.
 */
public class TestClient {
    public static void main(String[] args) throws Exception {

        String url = "http://127.0.0.1:8080/hession/ContactService";
        HessianProxyFactory factory = new HessianProxyFactory();
        ContactService contactService = (ContactService) factory.create(ContactService.class,url);
        Person p =contactService.IselectByPrimaryKey("1");
        System.out.println(p.toString());

    }
}
