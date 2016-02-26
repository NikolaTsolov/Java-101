package wednesday;

import java.lang.annotation.Annotation;

@ClassInfo (
		   author = "Nikola Tsolov",
		   currentRevision = 3,
		   checked = true,
		   releated = {String.class, Integer.class}
		)

public class ExampleClass {

	public static void main(String[] args) {
		
		Annotation[] a = ClassInfo.class.getAnnotations();		
	}
}
