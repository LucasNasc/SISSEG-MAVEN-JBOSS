package br.com.bancoamazonia.sistema;

import br.com.amazoniafw.base.bootstrapper.builder.ConfigurationDefinitionProvider;
import br.com.amazoniafw.base.bootstrapper.builder.GeneralConfigurationBuilder;

public class SistemaConfiguration extends ConfigurationDefinitionProvider {
	
	@Override
	protected GeneralConfigurationBuilder createConfigurationBuilder() {
		return new GeneralConfigurationBuilder();
	}

}
