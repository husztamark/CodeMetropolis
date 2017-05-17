package codemetropolis.toolchain.commons.cmxml.comparators;

import java.util.Comparator;

import codemetropolis.toolchain.commons.cmxml.Buildable;

public class BuildableWidthComparator implements Comparator<Buildable> {

	@Override
	public int compare(Buildable b1, Buildable b2) {
		return b1.getSizeX() - b2.getSizeX();
	}

}
