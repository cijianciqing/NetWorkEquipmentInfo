package jsjzx.wlyw.sb004;

import org.codehaus.groovy.runtime.powerassert.SourceText;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Sb004ApplicationTests {

	@Autowired
	DataSource dataSource;

	@Autowired
	DataSource druid;

	@Test
	public void contextLoads() throws SQLException {
		System.out.println(dataSource.getClass());
		System.out.println("=========================="+dataSource);
		System.out.println("--------------------------"+druid);
		System.out.println(dataSource.getConnection());
	}

}
