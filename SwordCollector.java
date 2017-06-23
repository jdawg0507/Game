import java.util.Random;
	import java.util.Scanner;
public class SwordCollector {
	
	//First MEthod
		public static void main(String[] args) {
			// Creates all variables needed for the game early on
			int b = 0;
			int c = 0;
			
			int d = 0;
		
			int e = 0;
			
			int f = 0;
			
			int g = 0;
			
			int h = 0;
			
			int i = 0;
			
			int j = 0;
			
			int k = 0;
			
			int z = 0;
			//Makes sure its a loop until told otherwise
			while (b != 4){
			Random rand = new Random();
			Random enemy = new Random();
			Scanner scan = new Scanner(System.in);
			Scanner enter = new Scanner(System.in);
			Scanner choice = new Scanner(System.in);
		// Menu
			System.out.println("1. Find a Sword");
			System.out.println("2. Swordex");
			System.out.println("3. Fight!");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			b = scan.nextInt();
			// Sword Randomizer
			if(b == 1){
				if (z == 30){
						System.out.println("-----------------------------");
						System.out.println("You found the legendary sword");
						System.out.println("You are the ultimate sword collector");
						System.out.println("It is forged by the God of blades himself");
						System.out.println("You Win");
						System.out.println("Hit ENTER");
						enter.nextLine();
						System.out.println("But the power you hold is so strong");
						System.out.println("You completely get consumed, and you");
						System.out.println("die and lose all your swords.");
						System.out.println("Hit ENTER");
						enter.nextLine();
						System.exit(0);
				}
				else{		
				int a = rand.nextInt(100);
				if(a <= 30){
					System.out.println("-----------------------------");
					System.out.println("You found a rusty iron sword.");
					System.out.println();
					System.out.println("This sword is an old piece of");
					System.out.println("garbage that would not do");
					System.out.println("anything in a fight");
					c = c+1;
					System.out.println();
					System.out.println("Your number of rusty iron swords: " + c);
					System.out.println("Hit ENTER");
					enter.nextLine();
				}
				else if(a > 30 && a <= 50){
					System.out.println("-----------------------------");
					System.out.println("You found a shiny steel sword");
					System.out.println();
					System.out.println("Made of only the sharpest and");
					System.out.println("most lustrous of a metal, this");
					System.out.println("is common with skilled swordsmen.");
					d = d+1;
					System.out.println("Your number of shiny steel swords: " + d);
					System.out.println("Hit ENTER");
					enter.nextLine();
				}
				else if(a > 50 && a <= 65){
					System.out.println("-----------------------------");
					System.out.println("You found a golden sword.");
					System.out.println();
					System.out.println("This sword was used by the kings");
					System.out.println("of old and just used for show. It");
					System.out.println("never saw real combat.");
					e = e + 1;
					System.out.println("Your number of golden swords: " + e);
					System.out.println("Hit ENTER");
					enter.nextLine();
				}
				else if(a > 65 && a <= 75){
					System.out.println("-----------------------------");
					System.out.println("You found a carbon steel sword.");
					System.out.println();
					System.out.println("This sword is light and fast");
					System.out.println("a very good weapon for a good");
					System.out.println("swordsman, perfect in a pinch.");
					f = f + 1;
					System.out.println("Your number of carbon steel swords: " + f);
					System.out.println("Hit ENTER");
					enter.nextLine();
				}
				else if(a > 75 && a <= 85){
					System.out.println("-----------------------------");
					System.out.println("You found a crystal sword.");
					System.out.println();
					System.out.println("The crystal is transparent");
					System.out.println("and very sharp. Can cut through");
					System.out.println("armor like a knife throgh butter.");
					g = g + 1;
					System.out.println("Your number of crystal swords: " + g);
					System.out.println("Hit ENTER");
					enter.nextLine();
				}
				else if(a > 85 && a <= 90){
					System.out.println("-----------------------------");
					System.out.println("You found a amethyst sword.");
					System.out.println();
					System.out.println("A rare variant of the crystal");
					System.out.println("sword. It has a gorgeous violet");
					System.out.println("color, kill in style.");
					h = h + 1;
					System.out.println("Your number of amethyst swords: " + h);
					System.out.println("Hit ENTER");
					enter.nextLine();
				}
				else if(a > 90 && a <= 93){
					System.out.println("-----------------------------");
					System.out.println("You found a blood sword.");
					System.out.println();
					System.out.println("Forged by the ruthless tribes");
					System.out.println("with the blood of their slaughtered");
					System.out.println("enemies. You can hear their screams.");
					i = i + 1;
					System.out.println("Your number of blood swords: " + i);
					System.out.println("Hit ENTER");
					enter.nextLine();
				}
				else if(a > 93 && a <= 96){
					System.out.println("-----------------------------");
					System.out.println("You found a carbonium sword.");
					System.out.println();
					System.out.println("The hardest and lightest material");
					System.out.println("on earth, it is extremely rare,");
					System.out.println("but it is amazing in combat.");
					j = j + 1;
					System.out.println("Your number of carbonium swords: " + j);
					System.out.println("Hit ENTER");
					enter.nextLine();
				}
				else if(a > 96 && a <= 99){
					System.out.println("-----------------------------");
					System.out.println("You found a phoenix sword.");
					System.out.println();
					System.out.println("FIRE! A freaking flaming sword");
					System.out.println("that can heat up to 3000 degrees,");
					System.out.println("but does not burn the wielder.");
					k = k + 1;
					System.out.println("Your number of phoenix swords: " + k);
					System.out.println("Hit ENTER");
					enter.nextLine();
				}
			}
		}
			//Tells how many swords of type, player has, and doesn't show name until discovered.
			if (b == 2){
				System.out.println();
				if (c >= 1){
				System.out.println("You have " + c + " rusty iron swords");	
				}
				if (d >= 1){
				System.out.println("You have " + d + " shiny steel swords");	
				}
				if (e >= 1){
				System.out.println("You have " + e + " golden swords");	
				}
				if (f >= 1){
				System.out.println("You have " + f + " carbon steel swords");	
				}
				if (g >= 1){
				System.out.println("You have " + g + " crystal swords");	
				}
				if (h >= 1){
					System.out.println("You have " + h + " amethyst swords");	
					}
				if (i >= 1){
					System.out.println("You have " + i + " blood swords");	
					}
				if (j >= 1){
					System.out.println("You have " + j + " carbonium swords");	
					}
				if (k >= 1){
					System.out.println("You have " + k + " phoenix swords");	
					}
				
				System.out.println("Hit ENTER");
				enter.nextLine();
			}
			//Picks sword used in battle
			if(b == 3){
				System.out.println();
				System.out.println("You must choose a sword to take into battle");
				System.out.println("Once you have 30 wins you can get the Legendary Sword");
				if (c >= 1){
				System.out.println("1. You have " + c + " rusty iron swords");	
				}
				if (d >= 1){
				System.out.println("2. You have " + d + " shiny steel swords");	
				}
				if (e >= 1){
				System.out.println("3. You have " + e + " golden swords");	
				}
				if (f >= 1){
				System.out.println("4. You have " + f + " carbon steel swords");	
				}
				if (g >= 1){
				System.out.println("5. You have " + g + " crystal swords");	
				}
				if (h >= 1){
					System.out.println("6. You have " + h + " amethyst swords");	
					}
				if (i >= 1){
					System.out.println("7. You have " + i + " blood swords");	
					}
				if (j >= 1){
					System.out.println("8. You have " + j + " carbonium swords");	
					}
				if (k >= 1){
					System.out.println("9. You have " + k + " phoenix swords");	
					}
				System.out.println();
				System.out.println("Choose the number of the weapon you will use");
				System.out.println("If you lose you get nothing in return.");
				System.out.print("The sword will be consumed so choose wisely: ");
				int l = choice.nextInt();
				int y = enemy.nextInt(100) + 1;
				//Starts the win/loss random chance
				if (l == 1){
					if (c == 0){
						System.out.println("You don't have that sword.");
						System.out.println("Hit ENTER");
						enter.nextLine();
					}
					else{
						c = c-1;
						if(y < 25){
							System.out.println("You Win");
							z = z + 1;
							System.out.println("You have " + z + " wins");
							System.out.println("Hit ENTER");
							enter.nextLine();
						}
						else{
							System.out.println("You Lose");
						System.out.println("Hit ENTER");
						enter.nextLine();
						}
					}}
					
				
				else if (l == 2){
					if (d == 0){
						System.out.println("You don't have that sword.");
						System.out.println("Hit ENTER");
						enter.nextLine();
					}
					else{
						d = d-1;
						if(y < 40){
							System.out.println("You Win");
							z = z + 1;
							System.out.println("You have " + z + " wins");
							System.out.println("Hit ENTER");
							enter.nextLine();
						}
						else
							System.out.println("You Lose");
						System.out.println("Hit ENTER");
						enter.nextLine();
					}
					
						
					}
				
				else if (l == 3){
					if (e == 0){
						System.out.println("You don't have that sword.");
						System.out.println("Hit ENTER");
						enter.nextLine();
					}
					else{
						e = e-1;
						if(y < 50){
							System.out.println("You Win");
							z = z + 1;
							System.out.println("You have " + z + " wins");
							System.out.println("Hit ENTER");
							enter.nextLine();
						}
						else
							System.out.println("You Lose");
						System.out.println("Hit ENTER");
						enter.nextLine();
					}
					
						
					}
				//
				else if (l == 4){
					if (f == 0){
						System.out.println("You don't have that sword.");
						System.out.println("Hit ENTER");
						enter.nextLine();
					}
					else{
						f = f-1;
						if(y < 65){
							System.out.println("You Win");
							z = z + 1;
							System.out.println("You have " + z + " wins");
							System.out.println("Hit ENTER");
							enter.nextLine();
						}
						else{
							System.out.println("You Lose");
						System.out.println("Hit ENTER");
						enter.nextLine();
							}
						}
				}
					
					//
					else if (l == 5){
						if (g == 0){
							System.out.println("You don't have that sword.");
							System.out.println("Hit ENTER");
							enter.nextLine();
						}
						else{
							g = g-1;
							if(y < 65){
								System.out.println("You Win");
								z = z + 1;
								System.out.println("You have " + z + " wins");
								System.out.println("Hit ENTER");
								enter.nextLine();
							}
							else
								System.out.println("You Lose");
							System.out.println("Hit ENTER");
							enter.nextLine();
						}
						
							
						}
						//
					else if (l == 6){
						if (h == 0){
							System.out.println("You don't have that sword.");
							System.out.println("Hit ENTER");
							enter.nextLine();
						}
						else{
							h = h-1;
							if(y < 65){
								System.out.println("You Win");
								z = z + 1;
								System.out.println("You have " + z + " wins");
								System.out.println("Hit ENTER");
								enter.nextLine();
							}
							else
								System.out.println("You Lose");
							System.out.println("Hit ENTER");
							enter.nextLine();
						}
						
							
						}
					//
					else if (l == 7){
						if (i == 0){
							System.out.println("You don't have that sword.");
							System.out.println("Hit ENTER");
							enter.nextLine();
						}
						else{
							i = i-1;
							if(y < 85){
								System.out.println("You Win");
								z = z + 1;
								System.out.println("You have " + z + " wins");
								System.out.println("Hit ENTER");
								enter.nextLine();
							}
							else
								System.out.println("You Lose");
							System.out.println("Hit ENTER");
							enter.nextLine();
						}
						
							
						}
					//
					else if (l == 8){
						if (j == 0){
							System.out.println("You don't have that sword.");
							System.out.println("Hit ENTER");
							enter.nextLine();
						}
						else{
							j = j -1;
							if(y < 95){
								System.out.println("You Win");
								z = z + 1;
								System.out.println("You have " + z + " wins");
								System.out.println("Hit ENTER");
								enter.nextLine();
							}
							else
								System.out.println("You Lose");
							System.out.println("Hit ENTER");
							enter.nextLine();
						}
						
							
						}
					//
					else if (l == 9){
						if (k == 0){
							System.out.println("You don't have that sword.");
							System.out.println("Hit ENTER");
							enter.nextLine();
						}
						else{
							k = k-1;
							if(y < 95){
								System.out.println("You Win");
								z = z + 1;
								System.out.println("You have " + z + " wins");
								System.out.println("Hit ENTER");
								enter.nextLine();
							}
							else
								System.out.println("You Lose");
							System.out.println("Hit ENTER");
							enter.nextLine();
						}	
					}
		}

			//Dont touch
			}
		}
	}
		


