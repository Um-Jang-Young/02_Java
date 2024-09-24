package com.hw1.run;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.hw1.model.dto.Friend;

public class Run {

	public static void main(String[] args) {
		List<Friend> list = new ArrayList<Friend>();
		
		Friend f1 = new Friend("짱구");
		Friend f2 = new Friend("철수");
		Friend f3 = new Friend("유리");
		Friend f4 = new Friend("훈이");
		Friend f5 = new Friend("맹구");
		
		list.add(f1);
		list.add(f2);
		list.add(f3);
		list.add(f4);
		list.add(f5);
		
		Random random = new Random();
		
		int index = random.nextInt(5);
		
		Friend leader = list.get(index);
		
		leader.pickLeader();
	}

}
