package foo.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Rule;
import org.junit.Test;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit4.service.ServiceRule;

import com.liferay.portal.kernel.model.Portlet;


public class FooTest {

	@Rule
	public ServiceRule serviceRule = new ServiceRule();

	@InjectService
	ServiceAware<Portlet> portlets;

	@Test
	public void test() throws Exception {
		assertThat(portlets.getServices()).isNotEmpty();
	}

}