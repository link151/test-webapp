import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.cn.link.model.User;
import com.cn.link.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
// 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class UserTest {
	private static Logger logger = Logger.getLogger(UserTest.class);

	@Resource
	private UserService userService;

	@Test
	public void selectByPrimaryKey() {
		User user = userService.selectByPrimaryKey(1);
		System.out.println("user:" + user);
		logger.info(JSON.toJSONString(user));
	}
}
