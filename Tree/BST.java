import java.util.Stack;
class List{
	Node root;

	class Node{
		int data;
		Node left;
		Node right;

		Node(int a){
			data=a;
			left=null;
			right=null;
		}
	}

	public void insert_BST(int a){
		Node nnode = new Node(a);
		if(root==null){
			root=nnode;
		}
		else{
			Node temp=root;
			while(temp.left!=null || temp.right!=null){
				if(nnode.data>=temp.data && temp.right!=null){
					temp=temp.right;
				}
				else if(nnode.data<temp.data && temp.left!=null){
					temp=temp.left;
				}
				else{
					break;
				}
			}
			if(nnode.data>=temp.data){
				temp.right=nnode;
			}
			else{
				temp.left=nnode;
			}
		}
	}

	public void display_inorder(){
		if(root==null){
			System.out.println("Tree is Empty.");
		}
		else{
			Node temp=root;
			Stack <Node> st = new Stack<Node>();

			while(temp!=null || st.size()>0){
				while(temp!=null){
					st.push(temp);
					temp=temp.left;
				}
				temp=st.pop();
				System.out.print(temp.data+" ");
				temp=temp.right;
			}
		}
	}
}

class BST{
	public static void main(String[] args) {
		List obj = new List();
		obj.insert_BST(5);
		obj.insert_BST(8);
		obj.insert_BST(4);
		obj.insert_BST(6);
		obj.insert_BST(7);
		obj.display_inorder();
	}
}