package org.hihn.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Start {

	public static void main(String[] args) {

		try {
			final Injector injector = Guice.createInjector(new Modul());
			Main m = injector.getInstance(Main.class);
			m.work();
		} catch (final Exception e) {
			e.printStackTrace();
		}
		System.out.println("DONE");
	}

}
