package com.treesets;

import java.util.Objects;

public class CollectionInfo implements Comparable<CollectionInfo> {

	private String name;
	private String version;
	
	public CollectionInfo(String name, String version) {
		super();
		this.name = name;
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "CollectionInfo [name=" + name + ", version=" + version + "]";
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash(name, version);
	}
	
	@Override
    public boolean equals(Object obj) {
    	if(obj == null)
    		return false;
    	if(this.getClass() != obj.getClass())
    		return false;
    	
    	CollectionInfo info = (CollectionInfo) obj;
    	return (this.name.equals(info.name)
    			&& this.version.equals(info.version)
    			);
    }
	
	
	@Override
	public int compareTo(CollectionInfo ob) {
	return this.version.compareTo(ob.version);
	
}
	
	
	
	
}
