package springTest;


import org.colin.demo.mappers.RoleMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class RoleTest extends AbstractJUnit4SpringContextTests{
	
	@Autowired RoleMapper roleMapper;
	
	@Test
	public void xxx(){
		System.out.println(roleMapper.selectAll());
	}

}
