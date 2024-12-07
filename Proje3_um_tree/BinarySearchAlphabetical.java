package Proje3_um_tree;

class TreeNode {
	UmAlani data;
	TreeNode left, right;

	public TreeNode(UmAlani data) {
		this.data = data;
		this.left = this.right = null;
	}
}

public class BinarySearchAlphabetical {
	TreeNode root;

	public BinarySearchAlphabetical() {
		root = null;
	}

	void insert(UmAlani data) {
		root = insertRec(root, data);
	}

	TreeNode insertRec(TreeNode root, UmAlani data) {
		if (root == null) {
			return new TreeNode(data);
		}

		if (data.name.compareTo(root.data.name) < 0) {
			root.left = insertRec(root.left, data);
		} else if (data.name.compareTo(root.data.name) > 0) {
			root.right = insertRec(root.right, data);
		}

		return root;
	}

	void levelOrderTraversal() {
		int height = height(root);
		for (int i = 1; i <= height; i++) {
			printGivenLevel(root, i);
		}
	}

	int height(TreeNode root) {
		if (root == null) {
			return 0;
		} else {
			int leftHeight = height(root.left);
			int rightHeight = height(root.right);

			return Math.max(leftHeight, rightHeight) + 1;
		}
	}

	void printGivenLevel(TreeNode root, int level) {
		if (root == null) {
			return;
		}
		if (level == 1) {
			System.out.println(root.data.toString());
		} else if (level > 1) {
			printGivenLevel(root.left, level - 1);
			printGivenLevel(root.right, level - 1);
		}
	}
}