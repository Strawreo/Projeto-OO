package sistemas;
import java.util.ArrayList;
import equip.*;
import personagens.Personagem;
import craft.Receita;

public class Inventario {

    private int tamanho;
    private ArrayList<ClassItem> inventario;

    public Inventario(int tamanho) {
        this.tamanho = tamanho;
        this.inventario = new ArrayList<ClassItem>(this.tamanho);

        for (int i = 0; i < this.tamanho; i++) {
            inventario.add(null);
        }
    }

    public void obter(ClassItem item,Personagem personagem) {
        ReadInventario read = this.read(item.getNome());
    	Boolean ItemJaExisteNoInv = read.getBool();
    	Boolean bool = true;

        if(ItemJaExisteNoInv && item instanceof ItemCraft || item instanceof ItemUsavel) {
        	
        	double pesoItem = item.getPeso();
        	personagem.addToPeso(pesoItem);
        	
        	if (item instanceof ItemCraft) {
        		((ItemCraft) item).addToQuantidade(1);
        		System.out.println("Obteve: " + item.getNome());
        		bool = false;
        	}
        	else if (item instanceof ItemUsavel) {
        		((ItemUsavel) item).addToQuantidade(1);
        		System.out.println("Obteve: " + item.getNome());
        		bool = false;
        	}
        }
        
        for (int i = 0; i < inventario.size(); i++) {
        	
        	if (inventario.get(i) == null) {
        		
        		if(item instanceof ItemCraft || item instanceof ItemUsavel) {
        			
        			if (item instanceof ItemCraft && ItemJaExisteNoInv == false) {
        				((ItemCraft) item).addToQuantidade(1);
        				this.inventario.set(i, item);
        				double pesoItem = item.getPeso();
        				personagem.addToPeso(pesoItem);
        				System.out.println("Obteve: " + item.getNome());
        				bool = false;
        				break;
        			} else if(item instanceof ItemUsavel && ItemJaExisteNoInv == false) {
        				((ItemUsavel) item).addToQuantidade(1);
        				this.inventario.set(i, item);
        				double pesoItem = item.getPeso();
        				personagem.addToPeso(pesoItem);
        				System.out.println("Obteve: " + item.getNome());
        				bool = false;
        				break;
        			}
        			
        		} else {
        			
        			this.inventario.set(i, item);
        			double pesoItem = item.getPeso();
        			personagem.addToPeso(pesoItem);
        			System.out.println("Obteve: " + item.getNome());
        			bool = false;
        			break;}
        	}
        }
        
        if (bool) {
        	System.out.println("Tentou obter " + item.getNome() + ", mas o inventário estava cheio!!");
        }
    }
        	
    public void descartar(String nomeItem, Personagem personagem) {
    	ReadInventario read = this.read(nomeItem);
    	Boolean bool = read.getBool();
    	int i = read.getI();
    	
    	if (bool) {
    		if (inventario.get(i) instanceof ItemEquipavel) {
    			if (((ItemEquipavel) inventario.get(i)).getEquipado()) {
    				
    				((ItemEquipavel) inventario.get(i)).desequipar(personagem);
    				
    				double pesoItem = inventario.get(i).getPeso();
    				personagem.takeFromPeso(pesoItem);
    				
    				inventario.remove(i);
    				inventario.add(null);
    				
    				System.out.println("Item desequipado e descartado!");
    				
    			} else {
    				
    				double pesoItem = inventario.get(i).getPeso();
    				personagem.takeFromPeso(pesoItem);
    				
    				inventario.remove(i);
    				inventario.add(null);
    				
    				System.out.println("Item descartado!");
    				
    				
    			}
    			
    		} 
    		
    		else if(inventario.get(i) instanceof ItemUsavel || inventario.get(i) instanceof ItemCraft) {
    			if (inventario.get(i) instanceof ItemUsavel) {
    				((ItemUsavel) inventario.get(i)).takeFromQuantidade(1);
    				double pesoItem = inventario.get(i).getPeso();
        			personagem.takeFromPeso(pesoItem);
        			
        			if (((ItemUsavel) inventario.get(i)).getQuantidade() <= 0) {
        				inventario.remove(i);
            			inventario.add(null);
        			}
    
    			} else if (inventario.get(i) instanceof ItemCraft) {
    				((ItemCraft) inventario.get(i)).takeFromQuantidade(1);
    				double pesoItem = inventario.get(i).getPeso();
        			personagem.takeFromPeso(pesoItem);
        			
        			if (((ItemCraft) inventario.get(i)).getQuantidade() <= 0) {
        				inventario.remove(i);
            			inventario.add(null);
        			}
        			
        			System.out.println("Item descartado!!: " + nomeItem);
    			}
    		}
    			
    		else {
    			
    			try {
    			
    			double pesoItem = inventario.get(i).getPeso();
    			personagem.takeFromPeso(pesoItem);
    			
    			inventario.remove(i);
    			inventario.add(null);
    			
    			System.out.println("Item Descartado!!: " + nomeItem);}
    			
    			catch(NullPointerException e) {
    				System.out.println("Slot já está vazio!");
    			}
    			
    		}
    		
    	} else {
    		System.out.println("Item não encontrado no inventário!");
    	}
    }
    			
    public void ler() {
    	System.out.println("Inventário:");
    	
    	for (int i = 0; i < inventario.size(); i++) {
    		int num = i + 1;
    		
    		if (inventario.get(i) != null) {
    			if (inventario.get(i) instanceof ItemEquipavel) {
    				if (((ItemEquipavel) inventario.get(i)).getEquipado()) {
    					System.out.println(num + ". " + inventario.get(i).getNome() + ": Equipado!");
    				} else {
    					System.out.println(num + ". " + inventario.get(i).getNome());
    				}
    				
    			} else if(inventario.get(i) instanceof ItemUsavel || inventario.get(i) instanceof ItemCraft) {
    				if(inventario.get(i) instanceof ItemCraft) {
    					System.out.println(num + ". " + inventario.get(i).getNome() + "x" + ((ItemCraft) inventario.get(i)).getQuantidade());
    				} else if (inventario.get(i) instanceof ItemUsavel) {
    					System.out.println(num + ". " + inventario.get(i).getNome() + "x" + ((ItemUsavel) inventario.get(i)).getQuantidade());
    				}
    			} 
    		} else {
    			System.out.println(num + ". Slot Vazio");
    		}
    	}
    }
    
    public void ler(ArrayList<Receita> receitas) {
    	for (int i = 0; i < receitas.size();i++) {
    		int num = i + 1;
    		System.out.println(num + "." + receitas.get(i).getNome());
    	}
    	
    }
    				
    public void equipar(String nome, Personagem personagem) {
    	ReadInventario read = this.read(nome);
    	Boolean bool = read.getBool();
    	int i = read.getI();
    	
    	if (bool) {
    		if (inventario.get(i) instanceof ItemEquipavel) {
    			
    			if (((ItemEquipavel)inventario.get(i)).getEquipado()) {
    				((ItemEquipavel)inventario.get(i)).desequipar(personagem);
    			} else {
    				if (inventario.get(i) instanceof ItemEquipavelMao) {
    					ReadInventario read1 = this.readEquip(ItemEquipavelMao.class);
    					if (read1.getBool()) {
    						System.out.println("Você já tem: " + inventario.get(read1.getI()).getNome() + " equipado na sua mão!"); 	
    						System.out.println("Desequipando " + inventario.get(read1.getI()).getNome() + " e equipando " + inventario.get(i).getNome());
    						
    						((ItemEquipavel)inventario.get(read1.getI())).desequipar(personagem);
    						((ItemEquipavel)inventario.get(i)).equipar(personagem);
    					} else {
    						((ItemEquipavel)inventario.get(i)).equipar(personagem);
    					}
    				} else if (inventario.get(i) instanceof ItemEquipavelCabeca) {
    					ReadInventario read1 = this.readEquip(ItemEquipavelCabeca.class);
    					if (read1.getBool()) {
    						System.out.println("Você já tem: " + inventario.get(read1.getI()).getNome() + " equipado na sua cabeça!");
    						System.out.println("Desequipando " + inventario.get(read1.getI()).getNome() + " e equipando " + inventario.get(i).getNome());
    						
    						((ItemEquipavel)inventario.get(read1.getI())).desequipar(personagem);
    						((ItemEquipavel)inventario.get(i)).equipar(personagem);
    					} else {
    						((ItemEquipavel)inventario.get(i)).equipar(personagem);
    					}
    				} else if (inventario.get(i) instanceof ItemEquipavelArma) {
    					ReadInventario read1 = this.readEquip(ItemEquipavelArma.class); 
    					if (read1.getBool()) {
    						System.out.println("Você já tem: " + inventario.get(read1.getI()).getNome() + " equipado como arma!");
    						System.out.println("Desequipando " + inventario.get(read1.getI()).getNome() + " e equipando " + inventario.get(i).getNome());
    						
    						((ItemEquipavel)inventario.get(read1.getI())).desequipar(personagem);
    						((ItemEquipavel)inventario.get(i)).equipar(personagem);
    					} else {
    						((ItemEquipavel)inventario.get(i)).equipar(personagem);
    					}
    				} else if (inventario.get(i) instanceof ItemEquipavelPerna) {
    					ReadInventario read1 = this.readEquip(ItemEquipavelPerna.class);
    					if (read1.getBool()) {
    						System.out.println("Você já tem: " + inventario.get(read1.getI()).getNome() + " equipado nas pernas!");
    						System.out.println("Desequipando " + inventario.get(read1.getI()).getNome() + " e equipando " + inventario.get(i).getNome());
    						
    						((ItemEquipavel)inventario.get(read1.getI())).desequipar(personagem);
    						((ItemEquipavel)inventario.get(i)).equipar(personagem);
    					} else {
    						((ItemEquipavel)inventario.get(i)).equipar(personagem);
    					}
    				}
    			}
    			
    		} else {
    			System.out.println("Item não equipável!");
    		}
    		
    	} else {
    		System.out.println("Item não encontrado no inventário!");
    	}
    }
    			
    public void usar(String nome, Personagem personagem) {
    	ReadInventario read = this.read(nome);
    	Boolean bool = read.getBool();
    	int i = read.getI();
    	
    	if (bool) {
    		if (inventario.get(i) instanceof ItemUsavel) {
    			((ItemUsavel) inventario.get(i)).usar(personagem);
    			
    			this.descartar(nome, personagem);
    			
    		} else {
    			System.out.println("Item não pode ser usado!");
    		}
    		
    	} else {
    		System.out.println("Item não encontrado no inventário!!");
    	}
    }
    
    public void inspecionar(String nome) {
    	ReadInventario read = this.read(nome);
    	Boolean bool = read.getBool();
    	int i = read.getI();
    	
    	if (bool) {
    		try{
    			System.out.println(this.inventario.get(i).getDescricao());
    		}
    		catch(IndexOutOfBoundsException e) {
    			System.out.println("Slot vazio!");
    		}
    		
    	} else {
    		System.out.println("Item não encontrado no inventário!!");
    	}
    }
    
    public void criar(Receita receita, Personagem personagem) {
		ReadInventario read;
		int itensAchados = 0;
		
		ArrayList<ClassItem> ingredientes = receita.getIngredientes();
		ClassItem item = receita.getItem();
		
		for (int i = 0; i < ingredientes.size(); i++) {
			String nome = ingredientes.get(i).getNome();
			read = this.read(nome);
			
			if (read.getBool()) {
				System.out.println("Você possui um dos itens necessários para o craft: " + nome );
				itensAchados += 1;
			} else {
				System.out.println("Você não possui um dos itens necessários para o craft do item!");
				break;
			}
			
			if(itensAchados == ingredientes.size()) {
				for (int j = 0; j < ingredientes.size();j++) {
					this.descartar(ingredientes.get(j).getNome(), personagem);
				}
				System.out.println("Itens descartados! \n" + "Criando: " + receita.getItem().getNome());
				this.obter(item, personagem);
			}
			
			
		}
	}
    
    public ReadInventario read(String nome) throws NullPointerException {
    	boolean bool = false;
    	int inteiro = -1;
    	boolean isInteger = true;
    	
    	try {
    		int numero = Integer.parseInt(nome);
    	} catch(NumberFormatException e) {
    		isInteger = false;
    		System.out.println("Entrada inválida!");
    	}
    	
    	if(isInteger) {
    		try {
    			int numero = Integer.parseInt(nome);
    			ClassItem item = this.inventario.get(numero-1);
    			if(this.inventario.get(numero-1) == null) {
    				System.out.println("Slot Vazio!");
    				return new ReadInventario(false,-1);
    			} else {
    			return new ReadInventario(true,numero-1);}
    		} catch(IndexOutOfBoundsException e) {
    			System.out.println("Entrada inválida!");
    			return new ReadInventario(false,-1);
    		}
    	} else {
    	
    	if (nome == null) {
    		throw new NullPointerException("O nome fornecido não pode ser nulo");
    		
    	} else {
    		for (int i = 0; i < this.tamanho; i++) {
    			if (inventario.get(i) != null && nome.equals(inventario.get(i).getNome())) {
    				bool = true;
    				inteiro = i;
    				break;
    			}
    		}
    	}
    	
    	if (inteiro != -1) {
    		return new ReadInventario(bool, inteiro);
    		
    	} else {
    		return new ReadInventario(false, 0);
    	}
    
    	}
    }
    
    public int getTamanho() {
    	return this.tamanho;
    }
    
    public ReadInventario readEquip(Class<? extends ItemEquipavel> classe){
    	boolean bool = false;
    	int inteiro = -1;
    	
    	for (int i = 0; i < this.tamanho;i++) {
    		if (inventario.get(i) != null) {
    			if (inventario.get(i).getClass() == classe && ((ItemEquipavel)inventario.get(i)).getEquipado()) {
        			return new ReadInventario(true,i);
        		}
    		}
    	}
    	
    	return new ReadInventario(bool,inteiro);
    }
}            	    