package com.edwin.modle;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the COPTE database table.
 * 
 */
@Embeddable
public class CoptePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="TE001")
	private String te001;

	@Column(name="TE002")
	private String te002;

	@Column(name="TE003")
	private String te003;

	public CoptePK() {
	}
	public String getTe001() {
		return this.te001;
	}
	public void setTe001(String te001) {
		this.te001 = te001;
	}
	public String getTe002() {
		return this.te002;
	}
	public void setTe002(String te002) {
		this.te002 = te002;
	}
	public String getTe003() {
		return this.te003;
	}
	public void setTe003(String te003) {
		this.te003 = te003;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CoptePK)) {
			return false;
		}
		CoptePK castOther = (CoptePK)other;
		return 
			this.te001.equals(castOther.te001)
			&& this.te002.equals(castOther.te002)
			&& this.te003.equals(castOther.te003);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.te001.hashCode();
		hash = hash * prime + this.te002.hashCode();
		hash = hash * prime + this.te003.hashCode();
		
		return hash;
	}
}