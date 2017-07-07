package org.yanghai.imp.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yanghai.dao.mapper.PersonMapper;
import org.yanghai.dao.model.Person;
import org.yanghai.imp.intf.ContactService;

import javax.annotation.PostConstruct;

/**
 * Created by yh on 17-7-7.
 */
@Service("conversionService")
public class ContactImp implements ContactService {

    @Autowired
    private PersonMapper personMapper;

    public ContactImp(){
        System.out.println("12313131312");
        System.out.println("12313131312");
        System.out.println("12313131312");
        System.out.println("12313131312");
        System.out.println("12313131312");

    }



    @PostConstruct
    public void init(){
        Person person = this.IselectByPrimaryKey("1");
        System.out.println(person);
    }

    public Person IselectByPrimaryKey(String id) {

        Person p= personMapper.selectByPrimaryKey(id);

        return p;
    }
}
