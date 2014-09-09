package guice.studentstore;

import com.google.inject.AbstractModule;

public class SimpleModule extends AbstractModule {

	@Override
	protected void configure() {

		bind(StudentStore.class).to(DummyStudentStore.class);

		bind(Registrar.class).to(LenientRegistrar.class);
	}

}