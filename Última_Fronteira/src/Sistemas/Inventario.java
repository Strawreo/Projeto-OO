package Sistemas;
import java.util.ArrayList;
import equip.*;
import personagens.Personagem;

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

        if(ItemJaExisteNoInv && item instanceof Item_Jogável || item instanceof Item_Usável) {
        	
        	double pesoItem = item.getPeso();
        	personagem.addToPeso(pesoItem);
        	
        	if (item instanceof Item_Jogável) {
        		((Item_Jogável) item).addToQuantidade(1);
        		System.out.println("Obteve: " + item.getNome());
        		bool = false;
        	}
        	else if (item instanceof Item_Usável) {
        		((Item_Usável) item).addToQuantidade(1);
        		System.out.println("Obteve: " + item.getNome());
        		bool = false;
        	}
        }
        
        for (int i = 0; i < inventario.size(); i++) {
        	
        	if (inventario.get(i) == null) {
        		
        		if(item instanceof Item_Jogável || item instanceof Item_Usável) {
        			
        			if (item instanceof Item_Jogável && ItemJaExisteNoInv == false) {
        				((Item_Jogável) item).addToQuantidade(1);
        				this.inventario.set(i, item);
        				double pesoItem = item.getPeso();
        				personagem.addToPeso(pesoItem);
        				System.out.println("Obteve: " + item.getNome());
        				bool = false;
        				break;
        			} else if(item instanceof Item_Usável && ItemJaExisteNoInv == false) {
        				((Item_Usável) item).addToQuantidade(1);
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
    		if (inventario.get(i) instanceof Item_Equipável) {
    			if (((Item_Equipável) inventario.get(i)).getEquipado()) {
    				
    				((Item_Equipável) inventario.get(i)).desequipar(personagem);
    				
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
    		
    		else if(inventario.get(i) instanceof Item_Usável || inventario.get(i) instanceof Item_Jogável) {
    			if (inventario.get(i) instanceof Item_Usável) {
    				((Item_Usável) inventario.get(i)).takeFromQuantidade(1);
    				double pesoItem = inventario.get(i).getPeso();
        			personagem.takeFromPeso(pesoItem);
        			
        			if (((Item_Usável) inventario.get(i)).getQuantidade() <= 0) {
        				inventario.remove(i);
            			inventario.add(null);
        			}
    
    			} else if (inventario.get(i) instanceof Item_Jogável) {
    				((Item_Jogável) inventario.get(i)).takeFromQuantidade(1);
    				double pesoItem = inventario.get(i).getPeso();
        			personagem.takeFromPeso(pesoItem);
        			
        			if (((Item_Jogável) inventario.get(i)).getQuantidade() <= 0) {
        				inventario.remove(i);
            			inventario.add(null);
        			}
        			
        			System.out.println("Item descartado!!: " + nomeItem);
    			}
    		}
    			
    		else {
    			
    			double pesoItem = inventario.get(i).getPeso();
    			personagem.takeFromPeso(pesoItem);
    			
    			inventario.remove(i);
    			inventario.add(null);
    			
    			System.out.println("Item Descartado!!: " + nomeItem);
    			
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
    			if (inventario.get(i) instanceof Item_Equipável) {
    				if (((Item_Equipável) inventario.get(i)).getEquipado()) {
    					System.out.println(num + ". " + inventario.get(i).getNome() + ": Equipado!");
    				} else {
    					System.out.println(num + ". " + inventario.get(i).getNome());
    				}
    				
    			} else if(inventario.get(i) instanceof Item_Usável || inventario.get(i) instanceof Item_Jogável) {
    				if(inventario.get(i) instanceof Item_Jogável) {
    					System.out.println(num + ". " + inventario.get(i).getNome() + "x" + ((Item_Jogável) inventario.get(i)).getQuantidade());
    				} else if (inventario.get(i) instanceof Item_Usável) {
    					System.out.println(num + ". " + inventario.get(i).getNome() + "x" + ((Item_Usável) inventario.get(i)).getQuantidade());
    				}
    			} 
    		} else {
    			System.out.println(num + ". Slot Vazio");
    		}
    	}
    }
    				
    public void equipar(String nome, Personagem personagem) {
    	ReadInventario read = this.read(nome);
    	Boolean bool = read.getBool();
    	int i = read.getI();
    	
    	if (bool) {
    		if (inventario.get(i) instanceof Item_Equipável) {
    			
    			if (((Item_Equipável)inventario.get(i)).getEquipado()) {
    				((Item_Equipável)inventario.get(i)).desequipar(personagem);
    			} else {
    				if (inventario.get(i) instanceof ItemEquipavelMao) {
    					ReadInventario read1 = this.readEquip(ItemEquipavelMao.class);
    					System.out.println("Item de mao"); //debugg
    					if (read1.getBool()) {
    						System.out.println("Você já tem: " + inventario.get(read1.getI()).getNome() + " equipado na sua mão!"); 	
    						System.out.println("Desequipando " + inventario.get(read1.getI()).getNome() + " e equipando " + inventario.get(i).getNome());
    						
    						((Item_Equipável)inventario.get(read1.getI())).desequipar(personagem);
    						((Item_Equipável)inventario.get(i)).equipar(personagem);
    					} else {
    						((Item_Equipável)inventario.get(i)).equipar(personagem);
    					}
    				} else if (inventario.get(i) instanceof ItemEquipavelCabeca) {
    					System.out.println("Item de cabeca"); //debugg
    					ReadInventario read1 = this.readEquip(ItemEquipavelCabeca.class);
    					if (read1.getBool()) {
    						System.out.println("Você já tem: " + inventario.get(read1.getI()).getNome() + " equipado na sua cabeça!");
    						System.out.println("Desequipando " + inventario.get(read1.getI()).getNome() + " e equipando " + inventario.get(i).getNome());
    						
    						((Item_Equipável)inventario.get(read1.getI())).desequipar(personagem);
    						((Item_Equipável)inventario.get(i)).equipar(personagem);
    					} else {
    						((Item_Equipável)inventario.get(i)).equipar(personagem);
    					}
    				} else if (inventario.get(i) instanceof ItemEquipavelArma) {
    					System.out.println("Item arma"); //debugg
    					ReadInventario read1 = this.readEquip(ItemEquipavelArma.class); 
    					if (read1.getBool()) {
    						System.out.println("Você já tem: " + inventario.get(read1.getI()).getNome() + " equipado como arma!");
    						System.out.println("Desequipando " + inventario.get(read1.getI()).getNome() + " e equipando " + inventario.get(i).getNome());
    						
    						((Item_Equipável)inventario.get(read1.getI())).desequipar(personagem);
    						((Item_Equipável)inventario.get(i)).equipar(personagem);
    					} else {
    						((Item_Equipável)inventario.get(i)).equipar(personagem);
    					}
    				} else if (inventario.get(i) instanceof ItemEquipavelPerna) {
    					System.out.println("Item perna"); //debugg
    					ReadInventario read1 = this.readEquip(ItemEquipavelPerna.class);
    					if (read1.getBool()) {
    						System.out.println("Você já tem: " + inventario.get(read1.getI()).getNome() + " equipado nas pernas!");
    						System.out.println("Desequipando " + inventario.get(read1.getI()).getNome() + " e equipando " + inventario.get(i).getNome());
    						
    						((Item_Equipável)inventario.get(read1.getI())).desequipar(personagem);
    						((Item_Equipável)inventario.get(i)).equipar(personagem);
    					} else {
    						((Item_Equipável)inventario.get(i)).equipar(personagem);
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
    		if (inventario.get(i) instanceof Item_Usável) {
    			((Item_Usável) inventario.get(i)).usar(personagem);
    			
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
    		System.out.println(this.inventario.get(i).getDescricao());
    		
    	} else {
    		System.out.println("Item não encontrado no inventário!!");
    	}
    }
    
    public ReadInventario read(String nome) throws NullPointerException {
    	boolean bool = false;
    	int inteiro = -1;
    	
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
    
    public int getTamanho() {
    	return this.tamanho;
    }
    
    public ReadInventario readEquip(Class<? extends Item_Equipável> classe){
    	boolean bool = false;
    	int inteiro = -1;
    	
    	for (int i = 0; i < this.tamanho;i++) {
    		if (inventario.get(i) != null) {
    			if (inventario.get(i).getClass() == classe && ((Item_Equipável)inventario.get(i)).getEquipado()) {
        			return new ReadInventario(true,i);
        		}
    		}
    	}
    	
    	return new ReadInventario(bool,inteiro);
    }
}            	    