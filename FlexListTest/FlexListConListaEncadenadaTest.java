	public static int CAPACIDAD = 5;

	private Node head = null;
	private int size=0;

	public FlexList() {
		//constructor vacio
	}

	public FlexList(int[] l) {
		//constructor usado para las pruebas
		for (int i=l.length-1 ; i >=0; i--) {
			Node n = new Node(l[i]);
			n.setNext(head);
			head = n;
			size++;

		}
	}

	public int[] toArray() {
		int[] a = new int[CAPACIDAD];
		Node currentNode = head;
		int i=0;
		while (currentNode!=null) {
			a[i] = currentNode.getData();
			currentNode = currentNode.getNext();
			i++;
		}
		return a;
	}
