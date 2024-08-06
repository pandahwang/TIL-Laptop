보통 Bean을 생성할 때, 앞 글자를 소문자로 한 이름으로 생성함.  

그런데 프로젝트를 만들다보면 bean의 이름이 겹칠 수 있음.  

이 때, 빈 이름을 자동으로 지정해주는 BeanDefinitionGenerator를 만들어보자.  

```java
package com.office.library.config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;

public class LibraryBeanNameGenerator implements BeanNameGenerator {

	@Override
	public String generateBeanName(BeanDefinition definition, BeanDefinitionRegistry registry) {
		
		return definition.getBeanClassName();
	}

}
```
Maven servlet-context.xml  
```xml
<!-- context:component-scan 뒤에 name-generator를 지정해줌. -->
<context:component-scan base-package="com.office.library" name-generator="com.office.library.config.LibraryBeanNameGenerator" />
```

이렇게 하면 bean 이름이 같아도 알아서 개별적인 id를 지정하여 중복되지 않게 해줌.  