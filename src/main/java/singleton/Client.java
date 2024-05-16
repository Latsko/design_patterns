package singleton;

public class Client {

	public static void main(String[] args) {
		System.out.println("Eager Singleton");
		EagerRegistry registry = EagerRegistry.getInstance();
		EagerRegistry registry2 = EagerRegistry.getInstance();
		EagerRegistry registry3 = EagerRegistry.getInstance();
		System.out.println(registry == registry2);
		System.out.println(registry3 == registry2);
		System.out.println(registry3 == registry);

		System.out.println("**************************************");
		System.out.println("Lazy Singleton with DCL");
		LazyRegistryWithDCL lazyRegistry = LazyRegistryWithDCL.getInstance();
		LazyRegistryWithDCL lazyRegistry2 = LazyRegistryWithDCL.getInstance();
		System.out.println(lazyRegistry == lazyRegistry2);

		System.out.println("**************************************");
		System.out.println("Lazy Singleton with IODH");
		LazyRegistryIODH singleton;
		singleton = LazyRegistryIODH.getInstance();

		System.out.println("**************************************");

	}

}
