package inc.sgnorth.org.model;

import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.Date;

/**
 * The persistent class for the areagrouptransfer database table.
 * 
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "areagrouptransfer")
public class Areagrouptransfer extends BaseModel {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int serialnumber;

	@Column(name = "address1")
	private String address1;

	@Column(name = "cfo")
	private String cfo;

	@Column(name = "date")
	@Temporal(TemporalType.DATE)
	private Date date;

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

	@Column(name = "newarea")
	private int newarea;

	@Column(name = "newgrp")
	private int newgrp;

	@Column(name = "oldarea")
	private int oldarea;

	@Column(name = "oldgrp")
	private int oldgrp;

	@Column(name = "phone1")
	private String phone1;

	@Column(name = "r201number")
	private String r201number;

	@Column(name = "user")
	private String user;

	@Column(name = "weekyear")
	private String weekyear;

}