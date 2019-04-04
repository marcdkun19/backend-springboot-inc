package inc.sgnorth.org.model;

import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * The persistent class for the user2 database table.
 * 
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "user2")
@NamedQuery(name="User2.findAll", query="SELECT u FROM User2 u")
public class User2 extends BaseModel  {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="member_id")
	private int memberId;

	@Column(name = "addedby")
	private String addedby;

	@Column(name = "firstname")
	private String firstname;

	@Column(name = "lastname")
	private String lastname;

	@Column(name = "level")
	private String level;

	@Column(name = "login")
	private String login;

	@Column(name = "nickname")
	private String nickname;

	@Column(name = "passwd")
	private String passwd;

	@Column(name = "psswdclue")
	private String psswdclue;
}