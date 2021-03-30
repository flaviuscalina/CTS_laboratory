package ro.ase.csi.cts.dp.prototype;

public class TestProtype {

	public static void main(String[] args) throws CloneNotSupportedException {

		Tree3DModel tree1 = new Tree3DModel("Green", 200);
		Tree3DModel tree2 = new Tree3DModel("Red", 150);
		Tree3DModel tree3 = new Tree3DModel("Green", 200);
		
		//shallow copy
		//just another reference pointing to tree1
		Tree3DModel tree4=(Tree3DModel) tree1.clone();
		
	//	Tree3DModel tree5=tree1.clone();
	}

}
