package file_package;

import java.io.*;

import java.util.Scanner;

public class File1 {
		Scanner sc = new Scanner(System.in);
		String name,write,read;
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File1 obj = new File1();
	obj.create();
	obj.write1();
	obj.read();
		obj.del();

	}
	public void create() throws IOException {
		System.out.println("Enter a file name");
		name=sc.nextLine();
		File obj = new File(name);
		if(obj.createNewFile()) {
			System.out.println("the file has been CREATED");
		}
		else {
			System.out.println("File already exists");
		}
		
	}
	    public void write1() throws IOException {
	    	System.out.println("Enter to write");
	    	write=sc.nextLine();
	    	FileWriter obj1 = new FileWriter(name);
	    	System.out.println("Is file readable?");
	    	obj1.write(write);
	    	obj1.close();
	    	
	}
	    public void read() throws IOException {
	    	System.out.println("yess the file can write");
	    	File obj = new File(name);
	    	Scanner sc = new Scanner(obj);
	    	while(sc.hasNextLine()) {
	    		String s = sc.nextLine();
	    		System.out.println(s);
	    	}
	    	
		
	}
	    public void del() throws IOException {
	    	System.out.println("You can delete this file");
	    	name=sc.nextLine();
	    	File obj = new File(name);
	    	if(obj.delete()) {
	    		System.out.println("The file is deleted");
	    	}
	    	else {
	    		System.out.println("The file is not deleted");
	    	}
	    }

}
