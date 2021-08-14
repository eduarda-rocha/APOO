
import java.util.ArrayList;
import java.util.List;

public class BDEstoque {
	
	private static BDEstoque instance;
	
	private List<Notebook> bdNotebook;
	private List<Mouse> bdMouse;
	
	private BDEstoque() {
		bdNotebook = new ArrayList<Notebook>();
		bdMouse = new ArrayList<Mouse>();
	}
	
	public static synchronized BDEstoque getInstance(){
		if(instance == null){
			instance = new BDEstoque();
	    }
	    return instance;
	    }
	
	public List<Notebook> getBdNotebook(){
		return bdNotebook;
	}
	
	public List<Mouse> getBdMouse(){
		return bdMouse;
	}
}