package Proje3_um_tree;





import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class BinaryTree {


	int numberOfNode = -1;
	UmAlani root;
	int height;

	BinaryTree(){
		this.root = null;
	}


	// Print um alan
	public void printUmalan() {
		Queue<UmAlani> queue = new LinkedList<UmAlani>();
		numberOfNode += 1;
		queue.add(root);
		while (!queue.isEmpty()) {
			numberOfNode+=1;
			UmAlani presentUmAlani = queue.remove();
			System.out.println(presentUmAlani.toString());
			System.out.println();
			if (presentUmAlani.left != null) {
				queue.add(presentUmAlani.left);
			}
			if (presentUmAlani.right != null) {
				queue.add(presentUmAlani.right);
			}
		}
		System.out.println("Number of UmAlan objects: " + numberOfNode);
	}


	// Search And print  Method
	public void searchAndPrintInRange() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please type the first character: ");
		char input = scanner.next().charAt(0);
		input = Character.toUpperCase(input);


		System.out.print("Please type the second character: ");
		char input2 = scanner.next().charAt(0);
		input2 = Character.toUpperCase(input2);


		Queue<UmAlani> queue = new LinkedList<UmAlani>();
		queue.add(root);
		while (!queue.isEmpty()) {
			UmAlani presentUmAlani = queue.remove();
			if (presentUmAlani.name.charAt(0) >= coverTrChar(input)
				&  presentUmAlani.name.charAt(0) <= coverTrChar(input2)) {
				System.out.println("The value-"+presentUmAlani.name+" is avalaible in this range");

			}
			if (presentUmAlani.left!=null) {
				queue.add(presentUmAlani.left);
			}
			if (presentUmAlani.right!=null) {
				queue.add(presentUmAlani.right);
			}
		}
		//System.out.println("The value-"+umalan.name+" is not found in Tree");
	}


	public char coverTrChar(char character){
		if(character == 'Ç' ){
			character = 'C';
		}
		else if (character == 'Ğ') {
			character = 'G';
		}
		else if (character == 'İ') {
			character = 'I';
		}
		else if (character == 'Ö') {
			character = 'O';
		}
		else if (character == 'Ş') {
			character = 'S';
		}
		else if (character == 'Ü'){
			character = 'U';
		}
		return character;

	}



	// Insert Method (Balanced Tree)
	public void insert(UmAlani umAlan) {

		if (root == null) {
			root = umAlan;
			//System.out.println("Inserted new node at Root");
			return;
		}
		Queue<UmAlani> queue = new LinkedList<UmAlani>();
		queue.add(root);
		while (!queue.isEmpty()) {
			UmAlani presentUmAlani = queue.remove();
			if (presentUmAlani.left == null) {
				presentUmAlani.left = umAlan;
				//System.out.println("Successfully Inserted");
				break;
			} else if (presentUmAlani.right == null) {
				presentUmAlani.right = umAlan;
				//System.out.println("Successfully Inserted");
				break;
			} else {
				queue.add(presentUmAlani.left);
				queue.add(presentUmAlani.right);
			}
		}
	}

	private  int findHeight(UmAlani root) {
		if (root == null) {
			return 0;
		} else {
			// Sol ve sağ alt ağaçların yüksekliğini bul
			int leftHeight = findHeight(root.left);
			int rightHeight = findHeight(root.right);

			// Daha büyük olan alt ağacın yüksekliğine 1 ekleyerek toplam yüksekliği bul
			return Math.max(leftHeight, rightHeight) + 1;
		}
	}



	public int getHeight(){
		return findHeight(root);
	}



	// Add the nodes to the tree alphabetically


	// Insert Method







	public void levelOrder(){
		Queue<UmAlani> queue = new LinkedList<UmAlani>();
		queue.add(root);
		while (!queue.isEmpty()) {
			UmAlani presentNode = queue.remove();
			System.out.println(presentNode.name + " ");
			if (presentNode.left != null) {
				queue.add(presentNode.left);
			}
			if (presentNode.right != null) {
				queue.add(presentNode.right);
			}
		}
	}







}



























