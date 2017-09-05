package fr.Florent59.Armures;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Main extends JavaPlugin {
	
	public int taskId;
	public String[] slotsArmures = new String[4];
	public String slotsVides = "";
	
	@Override
	public void onEnable(){
		super.onEnable();
		
		
		// On lance une tâche répétitive.
		taskId = Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable(){
				
				
		@Override
		public void run(){
			
			for (Player player : Bukkit.getServer().getOnlinePlayers()) {			
				// Pour chaque joueur connecté...
				
				slotsVides = "";
				
				try{
				slotsArmures[0] = "" + player.getInventory().getHelmet().getItemMeta().getLore();
				} catch (NullPointerException e){
				slotsVides = slotsVides + "0";
				}
				
				try{
				slotsArmures[1] = "" + player.getInventory().getChestplate().getItemMeta().getLore();
				} catch (NullPointerException e){
				slotsVides = slotsVides + "1";
				}
				
				try{
				slotsArmures[2] = "" + player.getInventory().getLeggings().getItemMeta().getLore();
				} catch (NullPointerException e){
				slotsVides = slotsVides + "2";
				}
				
				try{
				slotsArmures[3] = "" + player.getInventory().getBoots().getItemMeta().getLore();
				} catch (NullPointerException e){
				slotsVides = slotsVides + "3";
				}
				
				// ... on récupère les lores (descriptions) des casques, plastrons, jambières et bottes qui sont portées.
				// Que l'on range dans le tableau slotsArmures de type chaîne de caractères.
				// S'il n'y a pas de pièce d'armure portée, on récupère l'exception NullPointerException générée.
				// Et on enregistre alors ce slot comme étant vide.
				// slotsVides est une chaîne de caractère qui peut être égale par exemple à : "23".
				// Pour les slots 2 et 3 qui seraient vides.
				
				for (int i = 0; i <= 3; i++){
					
					String num = "" + i;
					
					if(!slotsVides.contains(num)){
					
						// Pour chaque slot d'armure, exceptés ceux dont on sait qu'ils sont vides...
						// ... on applique un effet si l'on détecte un "code" dans la description.
						
						if(slotsArmures[i].contains("#absorption"))
							player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 9600, 1));
						
						if(slotsArmures[i].contains("#cécité"))
							player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 9600, 1));
						
						if(slotsArmures[i].contains("#nausée"))
							player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 9600, 1));
						
						if(slotsArmures[i].contains("#résistance"))
							player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 9600, 1));
						
						if(slotsArmures[i].contains("#célérité"))
							player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 9600, 1));
						
						if(slotsArmures[i].contains("#feu"))
							player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 9600, 1));
							
						if(slotsArmures[i].contains("#surbrillance"))
							player.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 9600, 1));
						
						if(slotsArmures[i].contains("#dégâts"))
							player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, 9600, 1));
						
						if(slotsArmures[i].contains("#soin"))
							player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 9600, 1));
						
						if(slotsArmures[i].contains("#vie"))
							player.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 9600, 1));
						
						if(slotsArmures[i].contains("#faim"))
							player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 9600, 1));
						
						if(slotsArmures[i].contains("#force"))
							player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 9600, 1));
						
						if(slotsArmures[i].contains("#invisible"))
							player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 9600, 1));
						
						if(slotsArmures[i].contains("#saut"))
							player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 9600, 1));
						
						if(slotsArmures[i].contains("#léviter"))
							player.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 9600, 1));
						
						if(slotsArmures[i].contains("#chance"))
							player.addPotionEffect(new PotionEffect(PotionEffectType.LUCK, 9600, 1));
						
						if(slotsArmures[i].contains("#vision"))
							player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 9600, 1)); 
						
						if(slotsArmures[i].contains("#poison"))
							player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 9600, 1));
						
						if(slotsArmures[i].contains("#régénération"))
							player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 9600, 1));
						
						if(slotsArmures[i].contains("#saturation"))
							player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 9600, 1));
						
						if(slotsArmures[i].contains("#lenteur"))
							player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 9600, 1));
						
						if(slotsArmures[i].contains("#fatigue"))
							player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 9600, 1));
						
						if(slotsArmures[i].contains("#vitesse"))
							player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 9600, 1));
						
						if(slotsArmures[i].contains("#malchance"))
							player.addPotionEffect(new PotionEffect(PotionEffectType.UNLUCK, 9600, 1));
					
						if(slotsArmures[i].contains("#respiration"))
							player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 9600, 1));
						
						if(slotsArmures[i].contains("#faiblesse"))
							player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 9600, 1));
						
						if(slotsArmures[i].contains("#dépérir"))
							player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 9600, 1));
						
					}
				
				}
				
				
			}
			
		}
		}, 0L, 1L); 
		// On lance le code immédiatement, on le répète tous les 1 tick (0,05 seconde). 
			
	}
	
}
