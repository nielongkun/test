package jvm;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

public class SoftRef {
	
	
	//软引用：SoftReference
	//弱引用：WeakReference
	public static void main(String[] args) {
		//引用队列
		ReferenceQueue<byte[]> refq = new ReferenceQueue<>();
		List<SoftReference<byte[]>> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			//SoftReference<byte[]> ref = new SoftReference<>(new byte[StringUtil._4MB]);
			//关联引用队列,当软引用所关联的byte[]被回收时，软引用自己会被加入到引用队列中
			SoftReference<byte[]> ref = new SoftReference<>(new byte[StringUtil._4MB],refq);
			System.out.println(ref.get());
			list.add(ref);
			System.out.println(list.size());
		}
		System.out.println("输出");
		//移除无用的软引用
		Reference<? extends byte[]> poll = refq.poll();
		while(poll !=null){
			list.remove(poll);
			poll = refq.poll();
		}
		for (SoftReference<byte[]> ref1 : list) {
			System.out.println(ref1.get());
		}
	}
}
