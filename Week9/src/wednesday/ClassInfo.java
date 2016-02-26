package wednesday;

public @interface ClassInfo {
	String author();
	int currentRevision() default 1;
	boolean checked() default true;
	Class<?>[] releated();
}
