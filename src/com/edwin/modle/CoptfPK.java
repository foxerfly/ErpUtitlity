package com.edwin.modle;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the COPTF database table.
 * 
 */
@Embeddable
public class CoptfPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="TF001")
	private String tf001;

	@Column(name="TF002")
	private String tf002;

	@Column(name="TF003")
	private String tf003;

	@Column(name="TF004")
	private String tf004;

	public CoptfPK() {
	}
	public String getTf001() {
		return this.tf001;
	}
	public void setTf001(String tf001) {
		this.tf001 = tf001;
	}
	public String getTf002() {
		return this.tf002;
	}
	public void setTf002(String tf002) {
		this.tf002 = tf002;
	}
	public String getTf003() {
		return this.tf003;
	}
	public void setTf003(String tf003) {
		this.tf003 = tf003;
	}
	public String getTf004() {
		return this.tf004;
	}
	public void setTf004(String tf004) {
		this.tf004 = tf004;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CoptfPK)) {
			return false;
		}
		CoptfPK castOther = (CoptfPK)other;
		return 
			this.tf001.equals(castOther.tf001)
			&& this.tf002.equals(castOther.tf002)
			&& this.tf003.equals(castOther.tf003)
			&& this.tf004.equals(castOther.tf004);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.tf001.hashCode();
		hash = hash * prime + this.tf002.hashCode();
		hash = hash * prime + this.tf003.hashCode();
		hash = hash * prime + this.tf004.hashCode();
		
		return hash;
	}
}