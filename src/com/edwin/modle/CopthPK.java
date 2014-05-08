package com.edwin.modle;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the COPTH database table.
 * 
 */
@Embeddable
public class CopthPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="TH001")
	private String th001;

	@Column(name="TH002")
	private String th002;

	@Column(name="TH003")
	private String th003;

	public CopthPK() {
	}
	public String getTh001() {
		return this.th001;
	}
	public void setTh001(String th001) {
		this.th001 = th001;
	}
	public String getTh002() {
		return this.th002;
	}
	public void setTh002(String th002) {
		this.th002 = th002;
	}
	public String getTh003() {
		return this.th003;
	}
	public void setTh003(String th003) {
		this.th003 = th003;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CopthPK)) {
			return false;
		}
		CopthPK castOther = (CopthPK)other;
		return 
			this.th001.equals(castOther.th001)
			&& this.th002.equals(castOther.th002)
			&& this.th003.equals(castOther.th003);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.th001.hashCode();
		hash = hash * prime + this.th002.hashCode();
		hash = hash * prime + this.th003.hashCode();
		
		return hash;
	}
}