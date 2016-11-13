package wordpress.fluentlenium.data;

public class FileMedia {
	private String name;
	private String dir;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public String getPath() {
		return this.dir + "/" + this.name;
	}

	public String getShortName() {
		return getName().split("\\.")[0];
	}

}
