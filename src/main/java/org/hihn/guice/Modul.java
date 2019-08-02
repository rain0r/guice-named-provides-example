package org.hihn.guice;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Named;

public class Modul extends AbstractModule {

	@Provides
	@Named("leet")
	public BizLogic createBizLogic() {
		return new BizLogic(1337);
	}

	@Provides
	@Named("hundred")
	public BizLogic createBizLogicA() {
		return new BizLogic(100, 100);
	}

	@Override
	protected void configure() {
	}

}
