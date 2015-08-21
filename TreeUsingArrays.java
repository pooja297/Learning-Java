
public class TreeUsingArrays {
	//we will be implementing the binary trees using arrays
	/* we will be implementing the following array properties to create the tree:
    1. The left child of the node with index i has index 2i.
    2. The right child of the node with index i has index 2i + 1.
    3. The parent of the node with index i has index i/2 (rounded down).
	 */
	
	//The instance variable is an array of Object
	Object[] Tarray;

	//constructor which initializes this array with some size
    public TreeUsingArrays () {
    	Tarray = new Object [128];
    } 
    //to check if the root node is null -- here we use the property that root node is at index 1
    public boolean CheckEmpty () {
        return (Tarray[1] == null);
    } 
    
    //implementing the left, right and parent using the array arithmetic properties definde above
    public int left (int i) {  
    	return 2*i;  //left child = 2i
    }
    public int right (int i) {  
    	return 2*i + 1;  //right child = 2i+1
    }
    public int parent (int i) {  
    	return i/2;  //parent = floor of i/2
    }
    
    //node references are the integer indices of the array
    //thus to get or set an element of the array, we will perform simple check for arrays' length
    //**************keep return type as Object(with "O" in caps)***********
    //region - accessor  methods
    public Object getStringValue(int i){
    	if(i<0 || i>= Tarray.length ){
    		return null;
    	}
    	else {
    		return Tarray[i];
    	}
    		
    }
    
    public void setStringValue(int i, Object value){
    	if(i<0 || i>= Tarray.length ){
    		return;
    	}
    	else {
    		Tarray[i] = value;
    	}
    }
    //endregion - accessor  methods
    
    //region- print preorder
    public void printPreorder(int i){
    	if (getStringValue(i) == null){
    		return;
    	}
    	else {
    		System.out.println(getStringValue(i));
    		printPreorder(left(i));
    		printPreorder(right(i));
    	}
    }
    //end region - print preorder
    
    //region- printpostorder
    public void printPostorder(int i){
    	if(getStringValue(i) == null){
    		return;
    		
    	}
    	else {
    		printPreorder(left(i));
    		printPreorder(right(i));
    		System.out.println(getStringValue(i));
    	}
    }
    //endregion - print postorder
    
    //region-print inorder
    public void printInorder(int i){
    	if(getStringValue(i) == null){
    		return;
    		
    	}
    	else {
    		printInorder(left(i));
    		System.out.println(getStringValue(i));
    		printInorder(right(i));
    		
    	}
    }
    //endregion- print inorder
}
