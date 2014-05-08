package com.edwin.modle;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the COPTC database table.
 * 
 */
@Embeddable
public class CoptcPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="TC001")
	private String tc001;

	@Column(name="TC002")
	private String tc002;

	public CoptcPK() {
	}
	public String getTc001() {
		return this.tc001;
	}
	public void setTc001(String tc001) {
		this.tc001 = tc001;
	}
	public String getTc002() {
		return this.tc002;
	}
	public void setTc002(String tc002) {
		this.tc002 = tc002;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CoptcPK)) {
			return false;
		}
		CoptcPK castOther = (CoptcPK)other;
		return 
			this.tc001.equals(castOther.tc001)
			&& this.tc002.equals(castOther.tc002);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.tc001.hashCode();
		hash = hash * prime + this.tc002.hashCode();
		
		return hash;
	}
}