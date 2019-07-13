import com.bdqn.supermarket.entity.User;
import com.bdqn.supermarket.service.UserService;
import com.bdqn.supermarket.service.impl.UserServiceImpl;

/**
 * Created by Administrator on 2019/2/23.
 */
public class Test {
    @org.junit.Test
    public void getUser(){
        UserService userService=new UserServiceImpl();
        User user1=new User("admin","123456");
        User user2= userService.getUser(user1);
        System.out.println(user2.getUsername());
    }


}
