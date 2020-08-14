package jvm;

import java.util.ArrayList;
import java.util.List;

public class GcTest {
	//-Xmx20m  -Xms20m -Xmn10m -XX:+UseSerialGC  -XX:+PrintGCDetails -verbose:gc
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<byte[]> list = new ArrayList<>();
		list.add(new byte[StringUtil._8MB]);
		list.add(new byte[StringUtil._6MB]);
		list.add(new byte[StringUtil._1MB]);
		list.add(new byte[StringUtil._1MB]);
		list.add(new byte[StringUtil._4MB]);
	}

}
