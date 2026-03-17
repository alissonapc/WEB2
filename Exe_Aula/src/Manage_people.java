import java.util.List;
import java.util.ArrayList;

public class Manage_people {
	
	private List<Person> Listapessoas;
	
	
	public Manage_people() {
		
		Listapessoas = new ArrayList<>();	
	}
	
	public List<Person> getListapessoas(){
		return Listapessoas;
	}
	
	public boolean save (Person pessoa) {
		if (pessoa != null) {
			Listapessoas.add(pessoa);
			return true;
		}
		return false;
	}
	public Person search(String cpf) {
		for(Person pessoa: Listapessoas) {
			if(pessoa.getcpf().equals(cpf)) {
				return pessoa;
			}
		}

		return null;
	}
	public boolean update(String cpf, String newName) {
		Person pessoa = search(cpf);
		if(pessoa != null) {
			int index = Listapessoas.indexOf(pessoa);
			if(index != -1) {
				pessoa.setname(newName);
				Listapessoas.set(index,  pessoa);
				return true;
			}
		}
		return false;
	}
	public boolean remove(String cpf) {
		Person pessoa = search(cpf);
		if(pessoa != null) {
			Listapessoas.remove(pessoa);
			return true;
		}
		return false;
	}

}