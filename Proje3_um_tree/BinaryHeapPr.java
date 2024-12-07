package Proje3_um_tree;

public class BinaryHeapPr {
	UmAlani arr[];
	int sizeOfTree;

	public BinaryHeapPr(int size) {
		arr = new UmAlani[size+1];
		this.sizeOfTree = 0;
		System.out.println("Binary Heap has been created");
	}

	public boolean isEmpty() {
		if (sizeOfTree == 0) {
			return true;
		} else {
			return false;
		}
	}

	public String peek() {
		if (isEmpty()) {
			System.out.println("Binary Heap is Empty");
			return null;
		}
		return arr[1].toString();

	}

	public int sizeOfBP() {
		return sizeOfTree;
	}

	public void levelOrder() {
		for (int i =1; i<=sizeOfTree; i++) {
			System.out.println(arr[i].name + ", ");

		}
	}


	public void  heapifyBottomToUp(int index){

		int parent = index / 2 ;
		if(index <= 1){
			return;
		}
		else if(arr[parent].name.compareTo(arr[index].name) > 0 ){
			UmAlani temp = arr[index];
			arr[index] = arr[parent];
			arr[parent] = temp;

			heapifyBottomToUp(parent);
		}


	}


	public void insert(UmAlani umAlani){
		arr[sizeOfTree+1] = umAlani;
		sizeOfTree++;
		heapifyBottomToUp(sizeOfTree);

	}









}