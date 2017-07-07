package org.yanghai.imp.intf;

import org.yanghai.dao.model.Person;

/**
 * Created by yh on 17-7-7.
 */
public interface ContactService {
   /**
    *
    * @param id　数据库中的主键
    * @return    返回的目标对象
    */
   public Person IselectByPrimaryKey(String id);
}
