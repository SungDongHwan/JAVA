package 자료구조8장;

import java.util.Comparator;
import java.util.Scanner;


class SimpleObject {
	static final int NO = 1; // 번호를 읽어 들일까요?
	static final int NAME = 2; // 이름을 읽어 들일까요?

	private String no; // 회원번호
	private String name; // 이름

	// --- 문자열 표현을 반환 ---//
	public String toString() {
		return "(" + no + ") " + name;
	}
	public SimpleObject(String num, String name) {
		no= num;
		this.name=  name;
	}

	// --- 데이터를 읽어 들임 ---//
//	void scanData(String guide, int sw) {
//		System.out.println(guide + "할 데이터를 입력하세요."+ sw);
//		Scanner sc = new Scanner(System.in);
//		if ((sw & NO) == NO) { //& 는 bit 연산자임 
//			System.out.print("번호: ");
//			no = sc.next();
//		}
//		if ((sw & NAME) == NAME) {
//			System.out.print("이름: ");
//			name = sc.next();
//		}
//	}

	// --- 회원번호로 순서를 매기는 comparator ---//
	public static final Comparator<SimpleObject> NO_ORDER = new NoOrderComparator();

	private static class NoOrderComparator implements Comparator<SimpleObject> {
		public int compare(SimpleObject d1, SimpleObject d2) {
			int s ;
			int d ;
			 s = Integer.parseInt(d1.no);
			 d = Integer.parseInt(d2.no);
			return (s > d) ? 1 : (s < d) ? -1 : 0;
		}
	}

	// --- 이름으로 순서를 매기는 comparator ---//
	public static final Comparator<SimpleObject> NAME_ORDER = new NameOrderComparator();

	private static class NameOrderComparator implements Comparator<SimpleObject> {
		public int compare(SimpleObject d1, SimpleObject d2) {
			return d1.name.compareTo(d2.name);
		}
	}
}

class Node1 {
	SimpleObject data = new SimpleObject();
	Node1 link;
	public Node1(SimpleObject element) {
		data = element;
		link = null;
	}
}

class LinkedList1 {
	Node1 first;
	public LinkedList1() {
		first = null;
	}
	public void Delete(SimpleObject element) //delete the element
	{
		  Node1 current = first;
		  Node1 p = null;
		if (first == null) {
			System.out.println("List  is empty");
		}
		  while (current != null) {
		            if (current.data == element) {
		            	if(p==null) {
		            		first = current.link;	
		            		}
		            	p.link= current.link;
		            }
		            p = current;
		            current = current.link;
		            
		        }
		  		System.out.println("not found " + element);
		        
	}
	public void Show() { // 전체 리스트를 순서대로 출력한다.
		while(first != null) {
			System.out.println(first.data.toString()+" ");
			first.link=first;
		}
			System.out.println("비어있는 list입니다.");
	}
	public void Add(SimpleObject element, Comparator<? super SimpleObject> c) //임의 값을 삽입할 때 리스트가 오름차순으로 정렬이 되도록 한다 
	{	
		Node1 newNode = new Node1(element);
		System.out.println(" x = " + element);
 		Node1 p = first, q= null;
		if (p == null) {
			this.first = newNode;
			return;
		}
		while (p!=null) {
			//if (SimpleObject.NAME_ORDER.compare(p.data,element)>0) {
			if (c.compare(p.data,element)>0)
				newNode.link= p;
				if (q==null) 
					first = newNode;
				else 
				q.link = newNode;
				break;
			}else 
			{	
				q =p;
				p =p.link;
				if(p==null) {
					q.link = newNode;
				break;
				}
				
			}
		}
	}
	public boolean Search(SimpleObject data) { // 선택한 simple object 가 있는지 확인
		Node1 current = first;
		while(current != null){
			if(current.data == data) {
			return true;}
			current = current.link;
		}
		return false;
	}
}
public class Test8_Test_SimpleObjectList {

	 enum Menu {
	        Add( "삽입"),
	        Delete( "삭제"),
	        Show( "인쇄"),
	        Search( "검색"),
	        Exit( "종료");

	        private final String message;                // 표시할 문자열

	        static Menu MenuAt(int idx) {                // 순서가 idx번째인 열거를 반환
	            for (Menu m : Menu.values())
	                if (m.ordinal() == idx)
	                    return m;
	            return null;
	        }

	        Menu(String string) {                        // 생성자(constructor)
	            message = string;
	        }

	        String getMessage() {                        // 표시할 문자열을 반환
	            return message;
	        }
	    }

	    //--- 메뉴 선택 ---//
	    static Menu SelectMenu() {
			Scanner sc = new Scanner(System.in);
	        int key;
	        do {
	            for (Menu m : Menu.values()) {
	                System.out.printf("(%d) %s  ", m.ordinal(), m.getMessage());
	                if ((m.ordinal() % 3) == 2 &&
	                      m.ordinal() != Menu.Exit.ordinal())
	                    System.out.println();
	            }
	            System.out.print(" : ");
	            key = sc.nextInt();
	        } while (key < Menu.Add.ordinal() || 
	                                            key > Menu.Exit.ordinal());
	        return Menu.MenuAt(key);
	    }

	public static void main(String[] args) {
       Menu menu;                                // 메뉴 
		System.out.println("Linked List");
		LinkedList1 l = new LinkedList1();
		Scanner sc = new Scanner(System.in);
		SimpleObject data = null;
    System.out.println("inserted");
	     l.Show();		
	        do {
	            switch (menu = SelectMenu()) {	             
	             case Add :                           // 머리노드 삽입
	            	 System.out.println("회원번호를 입력해주세요");
	            	 String snum= sc.next();
	            	 System.out.println("회원이름를 입력해주세요");
	            	 String sname= sc.next();
		            data = new SimpleObject(snum,sname);
		            
	    	         l.Add(data, SimpleObject.NO_ORDER);            
	                     break;
	             case Delete :                          // 머리 노드 삭제
	            	 System.out.println("삭제된 데이터는 " );
	                    break;
	             case Show :                           // 꼬리 노드 삭제
	                    l.Show();
	                    break;
	             case Search :                           // 회원 번호 검색
	            	 System.out.println("회원번호를 입력해주세요");
	            	 String snum1= sc.next();
	            	 System.out.println("회원이름를 입력해주세요");
	            	 String sname1= sc.next();
		            data = new SimpleObject(snum1,sname1);
	            	String n = data.toString();
	                boolean result = l.Search(data);
	                    if (result == false)
	                        System.out.println("검색 값 = " + n + "데이터가 없습니다.");
	                    else
	                        System.out.println("검색 값 = " + n + "데이터가 존재합니다.");
	                     break;
	             case Exit :                           // 꼬리 노드 삭제
	                    break;
	            }
	        } while (menu != Menu.Exit);
	    }
}