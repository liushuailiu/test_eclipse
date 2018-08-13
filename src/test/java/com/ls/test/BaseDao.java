package com.ls.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 閰嶇疆spring鍜宩unit鏁村悎锛宩unit鍚姩鍔犺浇Ioc瀹瑰櫒
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})//鍛婅瘔spring閰嶇疆鏂囦欢鐨勪綅缃�
public class BaseDao {
}
