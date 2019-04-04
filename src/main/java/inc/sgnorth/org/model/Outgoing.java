package inc.sgnorth.org.model;

import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.Date;


/**
 * The persistent class for the outgoing database table.
 * 
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "outgoing")
@Entity
@NamedQuery(name="Outgoing.findAll", query="SELECT o FROM Outgoing o")
public class Outgoing extends BaseModel  {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int serialnumber;

	@Column(name = "area")
	private String area;

	@Column(name = "cfo")
	private String cfo;

	@Column(name = "dateout")
	@Temporal(TemporalType.DATE)
	private Date dateout;

	@Column(name = "destination")
	private String destination;

	@Column(name = "firstname")
	private String firstname;

	@Column(name = "gender")
	private String gender;

	@Column(name = "gro")
	private String grp;

	@Column(name = "idnumber")
	private String idnumber;

	@Column(name = "lastname")
	private String lastname;

	@Column(name = "maidenname")
	private String maidenname;

	@Column(name = "middlename")
	private String middlename;

	@Column(name = "office")
	private String office;

	@Column(name = "office2")
	private String office2;

	@Column(name = "office3")
	private String office3;

	@Column(name = "office4")
	private String office4;

	@Column(name = "r201number")
	private String r201number;

	@Column(name = "user")
	private String user;

	@Column(name = "weekyear")
	private String weekyear;
}