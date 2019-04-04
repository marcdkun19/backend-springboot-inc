package inc.sgnorth.org.model;

import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.Date;


/**
 * The persistent class for the history database table.
 * 
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "history")
public class History extends BaseModel  {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int serialnumber;

	@Column(name = "activity")
	private String activity;

	@Column(name = "activitydate")
	@Temporal(TemporalType.DATE)
	private Date activitydate;

	@Column(name = "birthdate")
	@Temporal(TemporalType.DATE)
	private Date birthdate;

	@Column(name = "firstname")
	private String firstname;

	@Column(name = "gender")
	private String gender;

	@Column(name = "idnumber")
	private String idnumber;

	@Column(name = "lastname")
	private String lastname;

	@Column(name = "maidenname")
	private String maidenname;

	@Column(name = "middlename")
	private String middlename;

	@Column(name = "r201number")
	private String r201number;

	@Column(name = "remarks")
	private String remarks;

	@Column(name = "user")
	private String user;
}