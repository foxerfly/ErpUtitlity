package com.edwin.modle;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the COPTI database table.
 * 
 */
@Embeddable
public class CoptiPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="TI001")
	private String ti001;

	@Column(name="TI002")
	private String ti002;

	public CoptiPK() {
	}
	public String getTi001() {
		return this.ti001;
	}
	public void setTi001(String ti001) {
		this.ti001 = ti001;
	}
	public String getTi002() {
		return this.ti002;
	}
	public void setTi002(String ti002) {
		this.ti002 = ti002;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CoptiPK)) {
			return false;
		}
		CoptiPK castOther = (CoptiPK)other;
		return 
			this.ti001.equals(castOther.ti001)
			&& this.ti002.equals(castOther.ti002);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.ti001.hashCode();
		hash = hash * prime + this.ti002.hashCode();
		
		return hash;
	}
}