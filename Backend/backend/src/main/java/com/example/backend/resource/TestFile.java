package com.example.backend.resource;
import java.util.*;

public class TestFile {
	
	
	public int searchArray(ArrayList<Integer> list, int num) {
		int l = 0;
		int r = list.size() - 1;
		int point;
		while(l<r) {
			point = (l+r)/2;
			if(list.get(point) == num) {
				return point;
			}else if(list.get(point)> num) {
				r= point;
			}else {
				l = point;
			}
			
		}
		return 0;
	}

}
