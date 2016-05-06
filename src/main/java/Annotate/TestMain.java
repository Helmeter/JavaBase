package Annotate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by helmeter on 4/19/16.
 */
public class TestMain {

    public static void main(String []args)
            throws InstantiationException, IllegalAccessException {
        @SuppressWarnings({ "unchecked", "serial" })
        List<HashMap<String , String>> list = Arrays.asList(
                new HashMap<String , String>() {
                    {
                        put("name" , "xieyuooo");
                        put("title" , "ddddd");
                    }
                },
                new HashMap<String , String>() {
                    {
                        put("name" , "ffff");
                        put("title" , "uuu");
                    }
                }
        );
        List<UserDao>users = new ArrayList<UserDao>(list.size());
        for(HashMap<String , String> row : list) {
            users.add(ConvertionService.convertMapToBean(row, UserDao.class));
        }
        try {
            Class c1 = Class.forName("Annotate.UserDao");
            UserDao o = (UserDao) c1.newInstance();

            System.out.println(o.getLoginTimes());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
