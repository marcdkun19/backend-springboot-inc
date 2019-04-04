package inc.sgnorth.org.model;

import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * The persistent class for the officers database table.
 * 
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="officers")
public class Officer extends BaseModel  {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sn;

	@Column(name = "office")
	private String office;

	@Column(name = "post")
	private String post;
}