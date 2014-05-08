package com.edwin.modle;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the COPTJ database table.
 * 
 */
@Embeddable
public class CoptjPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="TJ001")
	private String tj001;

	@Column(name="TJ002")
	private String tj002;

	@Column(name="TJ003")
	private String tj003;

	public CoptjPK() {
	}
	public String getTj001() {
		return this.tj001;
	}
	public void setTj001(String tj001) {
		this.tj001 = tj001;
	}
	public String getTj002() {
		return this.tj002;
	}
	public void setTj002(String tj002) {
		this.tj002 = tj002;
	}
	public String getTj003() {
		return this.tj003;
	}
	public void setTj003(String tj003) {
		this.tj003 = tj003;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CoptjPK)) {
			return false;
		}
		CoptjPK castOther = (CoptjPK)other;
		return 
			this.tj001.equals(castOther.tj001)
			&& this.tj002.equals(castOther.tj002)
			&& this.tj003.equals(castOther.tj003);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.tj001.hashCode();
		hash = hash * prime + this.tj002.hashCode();
		hash = hash * prime + this.tj003.hashCode();
		
		return hash;
	}
}