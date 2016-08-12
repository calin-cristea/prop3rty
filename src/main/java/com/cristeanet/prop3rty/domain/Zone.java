package com.cristeanet.prop3rty.domain;

public enum Zone {
	
	andrei_muresanu ("Andrei Muresanu"),
	becas ("Becas"),
	borhanci ("Borhanci"),
	bulgaria ("Bulgaria"),
	buna_ziua ("Buna Ziua"),
	centru ("Centru"),
	dambul_rotund ("Dambul Rotund"),
	europa ("Europa"),
	faget ("Faget"),
	gheorgheni ("Gheorgheni"),
	grigorescu ("Grigorescu"),
	gruia ("Gruia"),
	intre_lacuri ("Intre Lacuri"),
	iris ("Iris"),
	manastur ("Manastur"),
	marasti ("Marasti"),
	plopilor ("Plopilor"),
	someseni ("Someseni"),
	sopor ("Sopor"),
	zorilor ("Zorilor");
	
	private String displayName;
	
	Zone(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}
}
