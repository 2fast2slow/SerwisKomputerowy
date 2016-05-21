package model;

import app.Main;

public class NaprawaInsert {
	public void wstawNaprawe(Naprawa naprawa) {
		Main.entityManager.getTransaction().begin();
		Main.entityManager.persist(naprawa);
		Main.entityManager.getTransaction().commit();
	}
}
