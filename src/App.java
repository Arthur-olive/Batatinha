import classes.Categoria;
import classes.Produto;

public class App {
    public static void main(String[] args){
        
        // CADASTRAR CATEGORIA
         //Categoria categoria = new Categoria(0);
         //categoria.setNome("Categoria Batata");
         //categoria.adicionar();

         //BUSCAR CATEGORIA
         Categoria categoria = new Categoria (1);
         System.out.println(categoria.getNome());

         //BUSCAR PRODUTO
         Produto produto = new Produto(1);
         System.out.println(produto.getNome());
    }
}
