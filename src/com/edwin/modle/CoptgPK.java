package com.edwin.modle;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the COPTG database table.
 * 
 */
@Embeddable
public class CoptgPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="TG001")
	private String tg001;

	@Column(name="TG002")
	private String tg002;

	public CoptgPK() {
	}
	public String getTg001() {
		return this.tg001;
	}
	public void setTg001(String tg001) {
		this.tg001 = tg001;
	}
	public String getTg002() {
		return this.tg002;
	}
	public void setTg002(String tg002) {
		this.tg002 = tg002;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CoptgPK)) {
			return false;
		}
		CoptgPK castOther = (CoptgPK)other;
		return 
			this.tg001.equals(castOther.tg001)
			&& this.tg002.equals(castOther.tg002);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.tg001.hashCode();
		hash = hash * prime + this.tg002.hashCode();
		
		return hash;
	}
}