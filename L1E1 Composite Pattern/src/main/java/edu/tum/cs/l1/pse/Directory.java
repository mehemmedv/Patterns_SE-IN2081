package edu.tum.cs.l1.pse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends FileSystemObject {

	
	//TODO: add the missing inheritance
	//TODO: add the missing field
	//TODO: add the missing methods
	
	List<FileSystemObject> children = new ArrayList<FileSystemObject>();

	public Directory(String name) {
		super(name);
	}
	
	public List<FileSystemObject> getChildren() {
		return children;
	}

	@Override
	public void list(int level) {
		printName(level);

		Iterator<FileSystemObject> iterator = children.iterator();
		while (iterator.hasNext()) {
			FileSystemObject child = (FileSystemObject) iterator.next();
			child.list(level + 1);
		}
	}
	
	public void addChild(FileSystemObject file) {
		children.add(file);
	}
	
	public void removeChild(FileSystemObject file) {
		children.remove(file);
	}
}
