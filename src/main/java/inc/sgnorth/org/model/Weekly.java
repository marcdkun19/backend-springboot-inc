package inc.sgnorth.org.model;

import javax.persistence.*;


/**
 * The persistent class for the weekly database table.
 * 
 */
@Entity
@Table(name = "weekly")
public class Weekly extends BaseModel  {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sn;

	@Column(name = "area")
	private int area;

	@Column(name = "date")
	private String date;

	@Column(name = "description")
	private String description;

	@Column(name = "grp")
	private int grp;

	@Column(name = "name")
	private String name;

	@Column(name = "sn2")
	private String sn2;
}