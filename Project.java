package com.ProjectPhase1.sys;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
public class Project {
	public static void main(String args[]) {
		String path ="/home/deepakgupta2mph/Downloads/SImplilearn/";
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> l = new ArrayList<>();
	
		while(true) {
			
			System.out.println("Enter 1 for DISPLAY the existing list\n "
					+ "Enter 2 for ADD/CREATE file\n"
					+ "Enter 3 for DELETE file\n"
					+ "Enter 4 for SEARCH file\n"
					+ "Enter 5 for EXIT from loop ");
			System.out.println();
			int c= sc.nextInt();
			switch(c) {
			case 1:
				//Display File
				while(true) {
				File f=new File(path);
				File filename[]=f.listFiles();
				for(File ff:filename) {
					System.out.println(ff);
				}
				System.out.println();

				break;
				}
				break;
			case 2://add file
				while(true) {
					System.out.println("enter the file name to create");
					String filename=sc.next();
					String finalname=filename;
					System.out.println(finalname);

					//create a file 

					File f=new File(finalname);
					boolean b = false;
					try {
						b = f.createNewFile();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(b!=true) {
						System.out.println("the file not created");
					}
					else {
						l.add(filename);
						System.out.println("file created");
					}

					System.out.println("the collection of files is "+ l);
					break;
				}
				break;
			case 3: //delete file
				while(true) {
					System.out.println("enter the file name to be deleted");
					String filname=sc.next();
					String finalfile=path+filname;
					File file=new File(finalfile);
					file.delete();
					System.out.println("file deleted");
					break;
					
				}
				System.out.println();
				break;
			case 4: //search file
				while(true) {
					File f=new File(path);
					System.out.println("enter the file name to search");
					String filsearchname=sc.next();
					File filename[]=f.listFiles();
					int flag=0;
					for(File ff:filename) {
						if(ff.getName().equals(filsearchname)) {
							flag=1;
							break;
						}
						else {
							flag=0;
						}
						
						
						
					}

					if(flag==1) {
						System.out.println("found the file");
					}
					else {
						System.out.println("file is not found");
					}
					break;
				}
				break;
			case 5: //exit from the loop
				System.exit(0);

				break;
				default:
					System.out.println("oops! please enter a valid key\n"
							+ "Thanks!");
					
				
			}
		}
}
}