package vendedores;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import template.Vendedor;

public class ListeVendedores {

	public static void listarVendedores(List<Vendedor> vend)
    {
        Collections.sort(vend, new Comparator<Vendedor>() {
            @Override
            public int compare(Vendedor  ven1, Vendedor  ven2)
            {
                return  ven1.getNome().compareTo(ven2.getNome());
            }
        });
		
		System.out.println(vend);
		
    }
	

}
