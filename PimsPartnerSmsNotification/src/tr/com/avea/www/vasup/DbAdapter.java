package tr.com.avea.www.vasup;


import javax.sql.DataSource;
import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

public class DbAdapter  {

	private static final Logger logger = Logger.getLogger(DbAdapter.class);

	private SimpleJdbcInsert insertTemplate;
	private JdbcTemplate selectTemplate;

	public void setDataSource(DataSource dataSource) {
		this.insertTemplate = new SimpleJdbcInsert(dataSource);

		if (insertTemplate.getTableName() != "mdl_sms_receiver") {
			insertTemplate.setTableName("mdl_sms_receiver");
			insertTemplate.setGeneratedKeyName("ID");
		}
		insertTemplate.compile();
		selectTemplate = new JdbcTemplate(dataSource);
	}
	public String insertReceiver;
		
	public String getInsertReceiver() {
		return insertReceiver;
	}
	public void setInsertReceiver(String insertReceiver) {
		this.insertReceiver = insertReceiver;
	}

	public int insertReceiver(String destination, String text,String msisdn,String messageKey) {

		return selectTemplate.update(insertReceiver, new Object[] { destination,text,msisdn,messageKey});
	}

	
	
}