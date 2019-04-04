package inc.sgnorth.org.model;

import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.Date;


/**
 * The persistent class for the logging database table.
 * 
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@NamedQuery(name="Logging.findAll", query="SELECT l FROM Logging l")
public class Logging extends BaseModel  {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int serialnumber;

	@Column(name = "browser")
	private String browser;

	@Column(name = "datetime")
	@Temporal(TemporalType.TIMESTAMP)
	private Date datetime;

	@Column(name = "ipaddress")
	private String ipaddress;

	@Column(name = "port")
	private String port;

	@Column(name = "session")
	private String session;

	@Column(name = "test1")
	private int test1;

	@Column(name = "test2")
	private int test2;

	@Column(name = "url")
	private String url;

	@Column(name = "user")
	private String user;
}