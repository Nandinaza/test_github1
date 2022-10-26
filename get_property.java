public class get_property{
	public static void main (String[] args) {
		System.out.println(System.getProperty("os.name"));
		String a[] = {
			"file.separator",
			"java.class.path",
			"java.home",
			"java.vendor",
			"java.vendor.url",
			"java.version",
			"line.separator",
			"os.arch",
			"os.name",
			"os.version",
			"path,separator",
			"user.dir",
			"user.home",
			"user.name"
		};
		for (int i = 0;i < a.length ;i++ ) {
			perin(a[i]);
		}
		
	}
	public static void perin(String a){
		String b = System.getProperty(a);
		System.out.printf("%s -> %s \n",a,b);
	}
}