package foo.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit5.service.ServiceExtension;

import com.liferay.portal.kernel.model.Portlet;

@ExtendWith(ServiceExtension.class)
public class FooTest {

	@InjectService
	ServiceAware<Portlet> portlets;

	@Test
	public void test() throws Exception {
		assertThat(portlets.getServices()).isNotEmpty();
	}

}