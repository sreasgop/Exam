class ThreadSleep extends Thread
{  
	public void run() {  
		for(int i=1;i<=5;i++){  
			try {  
				System.out.println(currentThread().getName() + " = " + i);
				sleep(5000);  
			}
			catch(Exception e){
				System.out.println(e);
			}  
	    }  
	}  
}

class T1_ThreadSleep{
	public static void main(String args[]) {  
		
        ThreadSleep t1=new ThreadSleep();
		t1.setName("RED");

		ThreadSleep t2=new ThreadSleep();
		t2.setName("BLUE");
		
        ThreadSleep t3=new ThreadSleep();
		t3.setName("GREEN");

		t1.start();
		t2.start();
		t3.start();  
	}  
}
