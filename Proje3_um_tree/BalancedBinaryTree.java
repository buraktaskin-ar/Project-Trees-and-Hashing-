package Proje3_um_tree;

import java.util.*;


public class BalancedBinaryTree {
	TreeNode root;

	public BalancedBinaryTree() {
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

	TreeNode sortedArrayToBST(UmAlani[] umAlanlari, int start, int end) {
		if (start > end) {
			return null;
		}

		int mid = (start + end) / 2;
		TreeNode newNode = new TreeNode(umAlanlari[mid]);

		newNode.left = sortedArrayToBST(umAlanlari, start, mid - 1);
		newNode.right = sortedArrayToBST(umAlanlari, mid + 1, end);

		return newNode;
	}

	public void createBalancedTree(UmAlani[] umAlanlari) {
		Arrays.sort(umAlanlari, Comparator.comparing(um -> um.name));
		root = sortedArrayToBST(umAlanlari, 0, umAlanlari.length - 1);
	}

	void inOrderTraversal(TreeNode root) {
		if (root != null) {
			inOrderTraversal(root.left);
			System.out.println(root.data.name);
			inOrderTraversal(root.right);
		}
	}

	void levelOrderTraversal() {
		if (root == null) {
			return;
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			TreeNode tempNode = queue.poll();
			System.out.println(tempNode.data.name);

			if (tempNode.left != null) {
				queue.add(tempNode.left);
			}

			if (tempNode.right != null) {
				queue.add(tempNode.right);
			}
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

	public int getHeight() {
		return height(root);
	}
}