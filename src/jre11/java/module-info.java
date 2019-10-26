module com.jwebmp.plugins.angulartouch {
	exports com.jwebmp.plugins.angulartouch;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.guicedee.guicedinjection;
	requires com.jwebmp.core.angularjs;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.angulartouch.AngularTouchPageConfigurator;
	provides com.jwebmp.core.base.angular.services.IAngularModule with com.jwebmp.plugins.angulartouch.AngularTouchModule;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.angulartouch.implementations.AngularTouchExclusionsModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.angulartouch.implementations.AngularTouchExclusionsModule;

}
