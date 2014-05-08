package com.edwin.modle;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the COPTN database table.
 * 
 */
@Embeddable
public class CoptnPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="TN001")
	private String tn001;

	@Column(name="TN002")
	private String tn002;

	public CoptnPK() {
	}
	public String getTn001() {
		return this.tn001;
	}
	public void setTn001(String tn001) {
		this.tn001 = tn001;
	}
	public String getTn002() {
		return this.tn002;
	}
	public void setTn002(String tn002) {
		this.tn002 = tn002;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CoptnPK)) {
			return false;
		}
		CoptnPK castOther = (CoptnPK)other;
		return 
			this.tn001.equals(castOther.tn001)
			&& this.tn002.equals(castOther.tn002);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.tn001.hashCode();
		hash = hash * prime + this.tn002.hashCode();
		
		return hash;
	}
}