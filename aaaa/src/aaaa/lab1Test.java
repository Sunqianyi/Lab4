package aaaa;

import static org.junit.Assert.*;

import org.junit.Test;

public class lab1Test {
	public static lab1 m = new lab1();
	//两个单词存在并且有最短路径
	@Test
	public void testCalcShortestPath1() {
		m.showDirectedGraph("C:\\Users\\hasee\\Desktop\\test1.txt");
		String result = m.calcShortestPath("big", "one");
		 assertEquals("big->data->time->servitization->becomes->one", result);
	}
    //前一个单词不存在
	@Test
	public void testCalcShortestPath2() {
		m.showDirectedGraph("C:\\Users\\hasee\\Desktop\\test1.txt");
		String result = m.calcShortestPath("ass", "in");
		 assertEquals("No \"ass\" in the graph!", result);
	}
	//后一个单词不存在
		@Test
		public void testCalcShortestPath3() {
			m.showDirectedGraph("C:\\Users\\hasee\\Desktop\\test1.txt");
			String result = m.calcShortestPath("in", "ass");
			 assertEquals("No \"ass\" in the graph!", result);
		}
	//两个单词都不存在
		@Test
		public void testCalcShortestPath4() {
			m.showDirectedGraph("C:\\Users\\hasee\\Desktop\\test1.txt");
			String result = m.calcShortestPath("ass", "abb");
			 assertEquals("No \"ass\" in the graph!No \"abb\" in the graph!", result);
		}
		//两个单词都存在并且没有最短路径
		@Test
		public void testCalcShortestPath5() {
			m.showDirectedGraph("C:\\Users\\hasee\\Desktop\\test1.txt");
			String result = m.calcShortestPath("cn", "in");
			 assertEquals("no path", result);
		}	
	
}
