package com.monkey.inspection.core.annotation;
/**
 * 与RequestMapping一同使用
 * @author tangjf
 *
 */
public @interface Interface {

	@interface Api {
		String url() default "";

		String auth() default "";

		String version() default "";
	}

	@interface Param {
		int index() default -1;

		String name() default "";

		String path();
	}
}
