
import java.util.Random;


/**
 * Driver class for experimentations. 
 * 
 * @author Bee
 */
public class Driver {

	/**
	 * The main method. Used for testing the speed of each lists' 
	 * prepend, append, and search methods.
	 */
	public static void main(String[] args) {
		

		 Random random = new Random();
		
		//start array list experiment
		
		//prepend 1
		ArrayList<Integer> ALp1=new ArrayList<Integer>();
		
		
		long startTimeALp1 = System.currentTimeMillis();
		for(int i=0; i<1000; i++){
			ALp1.prepend(random.nextInt());
		}
		long endTimeALp1 = System.currentTimeMillis();

		System.out.println("ArrayList Prepend 1000 random elements:	"+(endTimeALp1-startTimeALp1)+" milliseconds");
		
		
		//prepend 2
		ArrayList<Integer> ALp2=new ArrayList<Integer>();
				
				
		long startTimeALp2 = System.currentTimeMillis();
		for(int i=0; i<10000; i++){
			ALp2.prepend(random.nextInt());
		}
		long endTimeALp2 = System.currentTimeMillis();

		System.out.println("ArrayList Prepend 10000 random elements: "+(endTimeALp2-startTimeALp2)+" milliseconds");		
		
		
		
		//prepend 3
				ArrayList<Integer> ALp3=new ArrayList<Integer>();
						
						
				long startTimeALp3 = System.currentTimeMillis();
				for(int i=0; i<100000; i++){
					ALp3.prepend(random.nextInt());
				}
				long endTimeALp3 = System.currentTimeMillis();

				System.out.println("ArrayList Prepend 100000 random elements: "+(endTimeALp3-startTimeALp3)+" milliseconds");		
				
	
				//prepend 4
				ArrayList<Integer> ALp4=new ArrayList<Integer>();
						
						
				long startTimeALp4 = System.currentTimeMillis();
				for(int i=0; i<1000000; i++){
					ALp4.prepend(random.nextInt());
				}
				long endTimeALp4 = System.currentTimeMillis();

				System.out.println("ArrayList Prepend 1000000 random elements: "+(endTimeALp4-startTimeALp4)+" milliseconds");		
					
	
				
		//append 1
		ArrayList<Integer> ALa1=new ArrayList<Integer>();
		
		long stALa1=System.currentTimeMillis();
		for (int i=0; i<1000; i++){
			ALa1.append(random.nextInt());
		}
		long etALa1=System.currentTimeMillis();
		
		System.out.println("ArrayList Append 1000 random elements: "+(etALa1-stALa1)+" milliseconds");	
		
		
		//append 2
				ArrayList<Integer> ALa2=new ArrayList<Integer>();
				
				long stALa2=System.currentTimeMillis();
				for (int i=0; i<10000; i++){
					ALa2.append(random.nextInt());
				}
				long etALa2=System.currentTimeMillis();
				
				System.out.println("ArrayList Append 10000 random elements: "+(etALa2-stALa2)+" milliseconds");	
				
				
				
				
				
				//append 3
				ArrayList<Integer> ALa3=new ArrayList<Integer>();
				
				long stALa3=System.currentTimeMillis();
				for (int i=0; i<100000; i++){
					ALa3.append(random.nextInt());
				}
				long etALa3=System.currentTimeMillis();
				
				System.out.println("ArrayList Append 100000 random elements: "+(etALa3-stALa3)+" milliseconds");	
				
				
				
		
				//append 4
				ArrayList<Integer> ALa4=new ArrayList<Integer>();
				
				long stALa4=System.currentTimeMillis();
				for (int i=0; i<1000000; i++){
					ALa4.append(random.nextInt());
				}
				long etALa4=System.currentTimeMillis();
				
				System.out.println("ArrayList Append 1000000 random elements: "+(etALa4-stALa4)+" milliseconds");		
		
			
		//search 1 using append 1
				long s1=System.currentTimeMillis();
				for (int i=0; i<1000; i++){
					ALa1.search(random.nextInt(), 0, 999);
				}
				long e1=System.currentTimeMillis();
				
				System.out.println("ArrayList Search 1000 random elements: "+(e1-s1)+" milliseconds");	
				
				
				
				//search 2 using append 2
				long s2=System.currentTimeMillis();
				for (int i=0; i<10000; i++){
					ALa2.search(random.nextInt(), 0, 9999);
				}
				long e2=System.currentTimeMillis();
				
				System.out.println("ArrayList Search 10000 random elements: "+(e2-s2)+" milliseconds");		
				
				//search 3 using append 3
				long s3=System.currentTimeMillis();
				for (int i=0; i<100000; i++){
					ALa3.search(random.nextInt(), 0, 99999);
				}
				long e3=System.currentTimeMillis();
				
				System.out.println("ArrayList Search 100000 random elements: "+(e3-s3)+" milliseconds");					
	
		
				//search 4 using append 4
				long s4=System.currentTimeMillis();
				for (int i=0; i<1000000; i++){
					ALa3.search(random.nextInt(), 0, 999999);
				}
				long e4=System.currentTimeMillis();
				
				System.out.println("ArrayList Search 1000000 random elements: "+(e4-s4)+" milliseconds");		
				
						
				
//end array list experiment								
								
		
	
				
//start linked list experiment
				
				//prepend 1
				LinkedList<Integer> Lp1=new LinkedList<Integer>();
				
				
				long startTimeLp1 = System.currentTimeMillis();
				for(int i=0; i<1000; i++){
					Lp1.prepend(random.nextInt());
				}
				long endTimeLp1 = System.currentTimeMillis();

				System.out.println("LinkedList Prepend 1000 random elements:	"+(endTimeLp1-startTimeLp1)+" milliseconds");
				
				
				//prepend 2
LinkedList<Integer> Lp2=new LinkedList<Integer>();
				
				
				long startTimeLp2 = System.currentTimeMillis();
				for(int i=0; i<10000; i++){
					Lp2.prepend(random.nextInt());
				}
				long endTimeLp2 = System.currentTimeMillis();

				System.out.println("LinkedList Prepend 10000 random elements:	"+(endTimeLp2-startTimeLp2)+" milliseconds");
				
				
				
				//prepend 3
LinkedList<Integer> Lp3=new LinkedList<Integer>();
				
				
				long startTimeLp3 = System.currentTimeMillis();
				for(int i=0; i<100000; i++){
					Lp3.prepend(random.nextInt());
				}
				long endTimeLp3 = System.currentTimeMillis();

				System.out.println("LinkedList Prepend 100000 random elements:	"+(endTimeLp3-startTimeLp3)+" milliseconds");
			
	
			
						//prepend 4
LinkedList<Integer> Lp4=new LinkedList<Integer>();
				
				
				long startTimeLp4 = System.currentTimeMillis();
				for(int i=0; i<1000000; i++){
					Lp4.prepend(random.nextInt());
				}
				long endTimeLp4 = System.currentTimeMillis();

				System.out.println("LinkedList Prepend 1000000 random elements:	"+(endTimeLp4-startTimeLp4)+" milliseconds");
			
		
				
				//append 1
				LinkedList<Integer> La1=new LinkedList<Integer>();
				
				long stLa1=System.currentTimeMillis();
				for (int i=0; i<1000; i++){
					La1.append(random.nextInt());
				}
				long etLa1=System.currentTimeMillis();
				
				System.out.println("LinkedList Append 1000 random elements: "+(etLa1-stLa1)+" milliseconds");	
				
				
				//append 2
LinkedList<Integer> La2=new LinkedList<Integer>();
				
				long stLa2=System.currentTimeMillis();
				for (int i=0; i<10000; i++){
					La2.append(random.nextInt());
				}
				long etLa2=System.currentTimeMillis();
				
				System.out.println("LinkedList Append 10000 random elements: "+(etLa2-stLa2)+" milliseconds");	
						
						
						
						
						//append 3
LinkedList<Integer> La3=new LinkedList<Integer>();
				
				long stLa3=System.currentTimeMillis();
				for (int i=0; i<100000; i++){
					La3.append(random.nextInt());
				}
				long etLa3=System.currentTimeMillis();
				
				System.out.println("LinkedList Append 100000 random elements: "+(etLa3-stLa3)+" milliseconds");	
						
						
						
			
						//append 4
LinkedList<Integer> La4=new LinkedList<Integer>();
				
				long stLa4=System.currentTimeMillis();
				for (int i=0; i<100000; i++){
					La4.append(random.nextInt());
				}
				long etLa4=System.currentTimeMillis();
				
				System.out.println("LinkedList Append 1000000 random elements: "+(etLa4-stLa4)+" milliseconds");	
	
				
					
				//search 1 using append 1
						long sl1=System.currentTimeMillis();
						for (int i=0; i<1000; i++){
							La1.search(random.nextInt(), 0, 999);
						}
						long el1=System.currentTimeMillis();
						
						System.out.println("LnkedList Search 1000 random elements: "+(el1-sl1)+" milliseconds");	
						
						
						
						//search 2 using append 2
						long sl2=System.currentTimeMillis();
						for (int i=0; i<10000; i++){
							La2.search(random.nextInt(), 0, 9999);
						}
						long el2=System.currentTimeMillis();
						
						System.out.println("LnkedList Search 10000 random elements: "+(el2-sl2)+" milliseconds");	
						
						//search 3 using append 3
						long sl3=System.currentTimeMillis();
						for (int i=0; i<100000; i++){
							La3.search(random.nextInt(), 0, 99999);
						}
						long el3=System.currentTimeMillis();
						
						System.out.println("LinkedList Search 100000 random elements: "+(el3-sl3)+" milliseconds");					

		
						//search 4 using append 4
						long sl4=System.currentTimeMillis();
						for (int i=0; i<1000000; i++){
							La4.search(random.nextInt(), 0, 999999);
						}
						long el4=System.currentTimeMillis();
						
						System.out.println("LinkedList Search 1000000 random elements: "+(el4-sl4)+" milliseconds");				
				
				
						
//end linked list experiment				
				
						
						
//start double linked experiment
						
						//prepend 1
						DoubleLinkedList<Integer> dp1=new DoubleLinkedList<Integer>();
						
						
						long startTimedp1 = System.currentTimeMillis();
						for(int i=0; i<1000; i++){
							dp1.prepend(random.nextInt());
						}
						long endTimedp1 = System.currentTimeMillis();

						System.out.println("DoubleLinkedList Prepend 1000 random elements:	"+(endTimedp1-startTimedp1)+" milliseconds");						
						
						
						//prepend 2
						DoubleLinkedList<Integer> dp2=new DoubleLinkedList<Integer>();
						
						
						long startTimedp2 = System.currentTimeMillis();
						for(int i=0; i<10000; i++){
							dp2.prepend(random.nextInt());
						}
						long endTimedp2 = System.currentTimeMillis();

						System.out.println("DoubleLinkedList Prepend 10000 random elements:	"+(endTimedp2-startTimedp2)+" milliseconds");						
												
						
						//prepend 3
						DoubleLinkedList<Integer> dp3=new DoubleLinkedList<Integer>();
						
						
						long startTimedp3 = System.currentTimeMillis();
						for(int i=0; i<100000; i++){
							dp3.prepend(random.nextInt());
						}
						long endTimedp3 = System.currentTimeMillis();

						System.out.println("DoubleLinkedList Prepend 100000 random elements:	"+(endTimedp3-startTimedp3)+" milliseconds");		
						
						
				
						//prepend 4
						DoubleLinkedList<Integer> dp4=new DoubleLinkedList<Integer>();
						
						
						long startTimedp4 = System.currentTimeMillis();
						for(int i=0; i<1000000; i++){
							dp4.prepend(random.nextInt());
						}
						long endTimedp4 = System.currentTimeMillis();

						System.out.println("DoubleLinkedList Prepend 1000000 random elements:	"+(endTimedp4-startTimedp4)+" milliseconds");		
					
						
						//append 1
						DoubleLinkedList<Integer> DLa1=new DoubleLinkedList<Integer>();
						
						long stDLa1=System.currentTimeMillis();
						for (int i=0; i<1000; i++){
							DLa1.append(random.nextInt());
						}
						long etDLa1=System.currentTimeMillis();
						
						System.out.println("DoubleLinkedList Append 1000 random elements: "+(etDLa1-stDLa1)+" milliseconds");		
						
						
						
						//append 2
						DoubleLinkedList<Integer> DLa2=new DoubleLinkedList<Integer>();
						
						long stDLa2=System.currentTimeMillis();
						for (int i=0; i<10000; i++){
							DLa2.append(random.nextInt());
						}
						long etDLa2=System.currentTimeMillis();
						
						System.out.println("DoubleLinkedList Append 10000 random elements: "+(etDLa2-stDLa2)+" milliseconds");							
						
						
						//append 3
						DoubleLinkedList<Integer> DLa3=new DoubleLinkedList<Integer>();
						
						long stDLa3=System.currentTimeMillis();
						for (int i=0; i<100000; i++){
							DLa3.append(random.nextInt());
						}
						long etDLa3=System.currentTimeMillis();
						
						System.out.println("DoubleLinkedList Append 100000 random elements: "+(etDLa3-stDLa3)+" milliseconds");	
						
						
					
						//append 4
						DoubleLinkedList<Integer> DLa4=new DoubleLinkedList<Integer>();
						
						long stDLa4=System.currentTimeMillis();
						for (int i=0; i<1000000; i++){
							DLa4.append(random.nextInt());
						}
						long etDLa4=System.currentTimeMillis();
						
						System.out.println("DoubleLinkedList Append 1000000 random elements: "+(etDLa4-stDLa4)+" milliseconds");	
						
						
						
						//search 1 using append 1
						long sdl1=System.currentTimeMillis();
						for (int i=0; i<1000; i++){
							DLa1.search(random.nextInt(), 0, 999);
						}
						long edl1=System.currentTimeMillis();
						
						System.out.println("DoubleLinkedList Search 1000 random elements: "+(edl1-sdl1)+" milliseconds");							
						
						
						//search 2 using append 2
						long sdl2=System.currentTimeMillis();
						for (int i=0; i<10000; i++){
							DLa2.search(random.nextInt(), 0, 9999);
						}
						long edl2=System.currentTimeMillis();
						
						System.out.println("DoubleLinkedList Search 10000 random elements: "+(edl2-sdl2)+" milliseconds");			
						
						
						//search 3 using append 3
						long sdl3=System.currentTimeMillis();
						for (int i=0; i<100000; i++){
							DLa3.search(random.nextInt(), 0, 99999);
						}
						long edl3=System.currentTimeMillis();
						
						System.out.println("DoubleLinkedList Search 100000 random elements: "+(edl3-sdl3)+" milliseconds");
						
						
						//search 4 using append 4
						long sdl4=System.currentTimeMillis();
						for (int i=0; i<1000000; i++){
							DLa4.search(random.nextInt(), 0, 999999);
						}
						long edl4=System.currentTimeMillis();
						
						System.out.println("LnkedList Search 1000000 random elements: "+(edl4-sdl4)+" milliseconds");					
						
							
//end double link list experiment						
						
						
						
						
		
	}

}
