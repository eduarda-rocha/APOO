
import java.util.ArrayList;
import java.util.List;

public class BDEstoque {
	
	private static BDEstoque instance;
	
	private List<Notebook> bdNotebook;
	private List<Mouse> bdMouse;
	//private List<Produtos> bdProdutos;
	
	private BDEstoque() {
		bdNotebook = new ArrayList<>();
		bdMouse = new ArrayList<>();
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
	
	public List <Mouse> getBdMouse(){
		return bdMouse;
	}
}
	
