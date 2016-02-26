package wednesday_friday;

public class ReduceFilePath {

	public static String reduceFilePath(String filePath) {
		StringBuilder reducedFP = new StringBuilder();
		reducedFP.append("/");
		String[] str = filePath.split("/");
		
		for (int i = 0; i < str.length; i++) {
			boolean isEmpty = str[i].equals("");
			
			if (!isEmpty && !str[i].equals(".") && !str[i].equals("..")) {
				if (i + 1 < str.length && str[i + 1].equals("..")) {
					i++;
				} else {
					reducedFP.append(str[i] + "/");
				}				
			}
		}
		
		if(reducedFP.length() > 1) {
			reducedFP.deleteCharAt(reducedFP.length() - 1);
			return reducedFP.toString();
		}	

		return reducedFP.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reduceFilePath("/srv/../"));
		System.out.println(reduceFilePath("/srv/www/htdocs/wtf"));
		System.out.println(reduceFilePath("/"));
		System.out.println(reduceFilePath("/srv/www/htdocs/wtf/"));
		System.out.println(reduceFilePath("/srv/./././././"));
		System.out.println(reduceFilePath("/etc//wtf/"));
		System.out.println(reduceFilePath("/etc/../etc/../etc/../"));
		System.out.println(reduceFilePath("//////////////"));
		System.out.println(reduceFilePath("/../"));
	}

}
