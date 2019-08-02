package org.hihn.guice;

import javax.inject.Inject;

import com.google.inject.name.Named;

public class Main {

	@Inject
	@Named("leet")
	private BizLogic bizLogic;

	@Inject
	@Named("hundred")
	private BizLogic biBizLogic;

	public void work() {
		System.out.println(bizLogic.getA());
		System.out.println(biBizLogic.getB());
	}

}
