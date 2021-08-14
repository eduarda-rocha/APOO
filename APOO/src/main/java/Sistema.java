public class Sistema {
    
    private Notebook notebook = new Notebook();

    private Mouse mouse = new Mouse();

    public boolean cad(Notebook notebook) {
        if (cons(notebook)) {
            return false;
        } else {
            BDEstoque.getInstance().getBdNotebook().add(notebook);
            return true;
        }
    }

    public boolean cons(Notebook notebook) {
        for (Notebook n : BDEstoque.getInstance().getBdNotebook()) {
            if (n.getModelo().equals(notebook.getModelo())) {
                return true;
            }
        }
        return false;
    }

    public boolean cad(Mouse mouse) {
        if (cons(mouse)) {
            return false;
        } else {
            BDEstoque.getInstance().getBdMouse().add(mouse);
            return true;
        }
    }

    public boolean cons(Mouse mouse) {
        for (Mouse m : BDEstoque.getInstance().getBdMouse()) {
            if (m.getModelo().equals(mouse.getModelo())) {
                return true;
            }
        }
        return false;
    }

    public void del(Notebook notebook) {
        BDEstoque.getInstance().getBdNotebook().remove(notebook);
    }

    public void del(Mouse mouse) {
        BDEstoque.getInstance().getBdMouse().remove(mouse);
    }

    public boolean att(Notebook notebook) {
        for (int i = 0; i < BDEstoque.getInstance().getBdNotebook().size(); i++) {
            if (notebook.getModelo().equals(BDEstoque.getInstance().getBdNotebook().get(i).getModelo())) {
                BDEstoque.getInstance().getBdNotebook().set(i, notebook);
                return true;
            }
        }
        return false;
    }

    public boolean att(Mouse mouse) {
        for (int i = 0; i < BDEstoque.getInstance().getBdMouse().size(); i++) {
            if (mouse.getModelo().equals(BDEstoque.getInstance().getBdMouse().get(i).getModelo())) {
                BDEstoque.getInstance().getBdMouse().set(i, mouse);
                return true;
            }
        }
        return false;
    }

}
