package cn.tedu._03mybatis;

import cn.tedu._03mybatis.mapper.UserMapper;
import cn.tedu._03mybatis.mapper.WeiboMapper;
import cn.tedu._03mybatis.pojo.entity.User;
import cn.tedu._03mybatis.pojo.entity.Weibo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Date;

@SpringBootTest
class ApplicationTests {
	@Autowired
	private UserMapper userMapper;


	@Test
	void contextLoads() {
	}

	/**
	 * 测试方法：在用户表中插入一条数据
	 * 所有的测试方法要求无参无返回值
	 */
	@Test
	void insertUserTest(){
		User user=new User();
		user.setUsername("李知恩");
		user.setPassword("19930516");
		user.setNickname("IU");
		user.setCreated(new Date());
		userMapper.insertUser(user);//调用接口方法
	}

	@Autowired
	private WeiboMapper weiboMapper;

	@Test
	void insertWeiboTest(){
		Weibo weibo = new Weibo();
		weibo.setContent("如果有一天我变得很有钱，我会买下所有难得一见的笑脸");
		weibo.setCreated(new Date());
		weibo.setUserId(100L);
		System.out.println(weiboMapper.insertWeibo(weibo));
	}

	/*
	    根据微博id删除1条微博
	 */
	@Test
	void deleteByIdTest(){
		System.out.println(weiboMapper.deleteById(207));
	}
}
