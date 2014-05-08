package com.edwin.modle;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the COPTD database table.
 * 
 */
@Embeddable
public class CoptdPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="TD001")
	private String td001;

	@Column(name="TD002")
	private String td002;

	@Column(name="TD003")
	private String td003;

	public CoptdPK() {
	}
	public String getTd001() {
		return this.td001;
	}
	public void setTd001(String td001) {
		this.td001 = td001;
	}
	public String getTd002() {
		return this.td002;
	}
	public void setTd002(String td002) {
		this.td002 = td002;
	}
	public String getTd003() {
		return this.td003;
	}
	public void setTd003(String td003) {
		this.td003 = td003;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CoptdPK)) {
			return false;
		}
		CoptdPK castOther = (CoptdPK)other;
		return 
			this.td001.equals(castOther.td001)
			&& this.td002.equals(castOther.td002)
			&& this.td003.equals(castOther.td003);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.td001.hashCode();
		hash = hash * prime + this.td002.hashCode();
		hash = hash * prime + this.td003.hashCode();
		
		return hash;
	}
}