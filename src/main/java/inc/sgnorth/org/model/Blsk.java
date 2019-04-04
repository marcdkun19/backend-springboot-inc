package inc.sgnorth.org.model;

import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * The persistent class for the blsk database table.
 * 
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "blsk")
public class Blsk extends BaseModel  {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sn;

	@Column(name = "area")
	private int area;

	@Column(name = "date")
	private String date;

	@Column(name = "firstname")
	private String firstname;

	@Column(name = "gender")
	private String gender;

	@Column(name = "grp")
	private int grp;

	@Column(name = "io")
	private String io;

	@Column(name = "lastname")
	private String lastname;

	@Column(name = "sn2")
	private String sn2;
}