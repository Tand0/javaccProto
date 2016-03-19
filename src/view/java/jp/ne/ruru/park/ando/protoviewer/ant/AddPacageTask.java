package jp.ne.ruru.park.ando.protoviewer.ant;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.apache.tools.ant.BuildException;

/**
 * Add importer
 * @author foobar@em.boo.jp
 */
public class AddPacageTask extends org.apache.tools.ant.Task {
	/*
	 * (non-Javadoc)
	 * @see org.apache.tools.ant.Task#execute()
	 */
	@Override
	public void execute() throws BuildException {
		File fromDirFile = new File(fromdir);
		File toDirFile = new File(todir);
		if (!fromDirFile.isDirectory()) {
			throw new BuildException("fromdir is not directory");
		}
		if (!fromDirFile.isDirectory()) {
			throw new BuildException("todir is not directory");
		}
		Arrays.asList(fromDirFile.listFiles()).stream().forEach(e->next(e,toDirFile));

	}
	/**
	 * copy from to todir
	 * @param from
	 * @param toDir
	 * @throws BuildException
	 */
	private void next(File from,File toDir) throws BuildException {
		String name = from.getName();
		File to = new File(toDir,name);
		try (FileReader fr = new FileReader(from);
				BufferedReader br = new BufferedReader(fr);
				FileOutputStream os = new FileOutputStream(to);
				OutputStreamWriter osw = new OutputStreamWriter(os);) {
			osw.write("package ");
			osw.write(packagename);
			osw.write(";\r\n\r\n\r\n");
			for (String string : br.lines().collect(Collectors.toList())) {
				osw.write(string + "\r\n");
			}
		} catch (FileNotFoundException e1) {
			throw new BuildException("FileNotFoundException",e1);
		} catch (IOException e1) {
			throw new BuildException("IOException",e1);
		}

	}
	/** from dir getter
	 * @return the fromdir
	 */
	public String getFromdir() {
		return fromdir;
	}
	/** from dir setter
	 * @param fromdir the fromdir to set
	 */
	public void setFromdir(String fromdir) {
		this.fromdir = fromdir;
	}
	/** to dir getter
	 * @return the todir
	 */
	public String getTodir() {
		return todir;
	}
	/** to dir setter
	 * @param todir the todir to set
	 */
	public void setTodir(String todir) {
		this.todir = todir;
	}
	/** package name getter
	 * @return the packagename
	 */
	public String getPackagename() {
		return packagename;
	}
	/** package name setter
	 * @param packagename the packagename to set
	 */
	public void setPackagename(String packagename) {
		this.packagename = packagename;
	}
	/** from dir */
	private String fromdir;
	/** to dir */
	private String todir;
	/** package name */
	private String packagename;
}
