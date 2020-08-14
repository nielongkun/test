package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import model.Dog;

public class TestStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listStr = Arrays.asList("a","b","","c","d");
		//collect：实现了很多归约操作，例如将流转换成集合和聚合元素，可用于返回列表或字符串
		//返回列表(filter：过滤条件,去除集合中的空值)
		List<String> filtered = listStr.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		//返回列表(map:映射元素，获取每个元素在该条件下得到的值)
		List<Boolean> filteredmap = listStr.stream().map(string -> !string.isEmpty()).collect(Collectors.toList());
		//返回字符串
		String filtered1 = listStr.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(" | "));
		System.out.println(filtered);
		System.out.println(filtered1);
		//迭代(输出string)
		//listStr.forEach(System.out::println);
		/*listStr.forEach(str ->{
			System.out.println(str);
		});*/
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		// 获取对应的平方数(去重)
		//map（映射，将结果集中的每个元素进行处理）
		List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
		System.out.println("测试map");
		squaresList.forEach(num ->{
			System.out.println(num);
		});
		//limit:获取指定数量的流,获取指定数量的元素
		List<Integer> numLimit=numbers.stream().limit(2).collect(Collectors.toList());
		System.out.println("测试limit");
		numLimit.forEach(i ->{
			System.out.println(i);
		});
		//sorted测试排序(默认升序)
		List<Dog> dogList = new ArrayList<Dog>();
		Dog dog1 = new Dog("小小", 2, "1", "筷子"); 
		Dog dog2 = new Dog("花花", 1, "2", "舌头"); 
		Dog dog3 = new Dog("白白", 3, "3", "勺子"); 
		dogList.add(dog1);
		dogList.add(dog2);
		dogList.add(dog3);
		Random random = new Random();
		System.out.println("测试排序");
		//random.ints(10):生成10个int类型数
		//random.ints(5,10,100):生成5个（10,100）范围的int类型数
		//random.ints().limit(10)--》random.ints(10)
		random.ints().limit(10).sorted().limit(4).forEach(System.out::println);
		//排序处理(升序)
		dogList.stream().sorted(Comparator.comparing(Dog::getAge)).collect(Collectors.toList()).forEach(Dog ->{
			System.out.println(Dog.toString());
		});
		//排序处理(降序)
		dogList.stream().sorted(Comparator.comparing(Dog::getAge).reversed()).collect(Collectors.toList()).forEach(Dog ->{
			System.out.println(Dog.toString());
		});
		//多个字段排序
		/*dogList.stream().sorted(Comparator.comparing(Dog::getAge).thenComparing(Dog::getFood,Comparator.reverseOrder())).collect(Collectors.toList()).forEach(Dog ->{
			System.out.println(Dog.toString());
		});*/
		
	}
	

}
