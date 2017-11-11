package aaaa;

import static org.junit.Assert.*;

import org.junit.Test;

public class lab1Test {
	public static lab1 m = new lab1();
	//�������ʴ��ڲ��������·��
	@Test
	public void testCalcShortestPath1() {
		m.showDirectedGraph("C:\\Users\\hasee\\Desktop\\test1.txt");
		String result = m.calcShortestPath("big", "one");
		 assertEquals("big->data->time->servitization->becomes->one", result);
	}
    //ǰһ�����ʲ�����
	@Test
	public void testCalcShortestPath2() {
		m.showDirectedGraph("C:\\Users\\hasee\\Desktop\\test1.txt");
		String result = m.calcShortestPath("ass", "in");
		 assertEquals("No \"ass\" in the graph!", result);
	}
	//��һ�����ʲ�����
		@Test
		public void testCalcShortestPath3() {
			m.showDirectedGraph("C:\\Users\\hasee\\Desktop\\test1.txt");
			String result = m.calcShortestPath("in", "ass");
			 assertEquals("No \"ass\" in the graph!", result);
		}
	//�������ʶ�������
		@Test
		public void testCalcShortestPath4() {
			m.showDirectedGraph("C:\\Users\\hasee\\Desktop\\test1.txt");
			String result = m.calcShortestPath("ass", "abb");
			 assertEquals("No \"ass\" in the graph!No \"abb\" in the graph!", result);
		}
		//�������ʶ����ڲ���û�����·��
		@Test
		public void testCalcShortestPath5() {
			m.showDirectedGraph("C:\\Users\\hasee\\Desktop\\test1.txt");
			String result = m.calcShortestPath("cn", "in");
			 assertEquals("no path", result);
		}	
	
}
