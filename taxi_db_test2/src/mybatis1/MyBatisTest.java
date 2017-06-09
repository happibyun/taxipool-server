package mybatis1;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.my.vo.CustomerInfo;

public class MyBatisTest {

	public static void main(String[] args) {
		String resource = "mybatis-config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			// DB와 연결
			SqlSession session = sqlSessionFactory.openSession();
			try {
			  //Blog blog = session.selectOne("org.mybatis.example.BlogMapper.selectBlog", 101);
				CustomerInfo c = session.selectOne("CustomerMapper.selectById", "id1");
				System.out.println(c);
				
				/*List<Customer> list = session.selectList("CustomerMapper.selectAll","desc");
				for(Customer cc: list){
					System.out.println(cc);
				}*/
				
				/*int count = session.selectOne("CustomerMapper.selectCount","%1%");
				System.out.println(count);*/
				
				/*HashMap<String, Integer> map = session.selectOne("CustomerMapper.selectCount2","1");
				System.out.println(map.get("CNT1"));
				System.out.println(map.get("CNT2"));*/
				/*try{
					Customer c = new Customer();
					c.setId("i53"); c.setPassword("p53"); c.setName("n53");
					session.insert("CustomerMapper.insert", c);
					session.commit();
				} catch(Exception e) {
					session.rollback();
					e.printStackTrace();
				} finally{
					session.close();
				}*/
				HashMap<String, String> map = new HashMap<>();
				
				map.put("id", "i53");
				map.put("name", "upd1");
				int rowcnt = session.update("CustomerMapper.update",map);
				session.commit();
				System.out.println("처리건수: "+rowcnt);
				
			} finally {
			  session.close();
			}			
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
