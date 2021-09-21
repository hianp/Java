package Exercicios;

import java.util.Scanner;


public class Atividade_1 {

	public static void main(String[] args) {
		int onoff = 0;
		boolean debitoAuto = false;
		boolean statusEnergia = true;
		while(onoff == 0) {			
			System.out.println("\n");
			System.out.println("=-=-=-=-==-=-=-=-= Menu =-=-=-=-==-=-=-=-=");
			System.out.println("|1 - Média de gastos no Trimestre");
			System.out.println("|2 - Nova ligação");
			System.out.println("|3 - Desligar energia");
			System.out.println("|4 - Ligar energia");
			System.out.println("|5 - Status da minha energia");
			System.out.println("|6 - Debito automatico");
			System.out.println("|7 - Compartilhar fatura");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|0 - Encerrar programa\n");

			Scanner entrada = new Scanner(System.in);
			System.out.println("O que deseja fazer? (Somente números)");
			int usuario= entrada.nextInt();

			//								Entrada 1
			if (usuario == 1) {
				System.out.println("=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				System.out.print("Gastos do primeiro mês: ");
				float m1 = entrada.nextFloat();
				System.out.print("Gastos do segundo mês: ");
				float m2 = entrada.nextFloat();
				System.out.print("Gastos do terceiro mês: ");
				float m3 = entrada.nextFloat();
				float consumoDinheiro = (m1 + m2 + m3) / 3;
				System.out.printf("A sua média de consumo no último Trimestre foi de R$%.2f%n", consumoDinheiro);
				System.out.println("Deseja continuar? (1-Sim e 2-Não)");
				int escolha = entrada.nextInt();
				if (escolha == 2) {
					onoff = 1;
				}	
			}
			
			//								Entrada 2
			if (usuario == 2) {
				System.out.println("Foi aberta uma solicitação. Por favor, aguarde retorno\nno seu número ou e-mail.");
				System.out.println("Ligue para (xx)x xxxx-xxxx para mais informações");
				System.out.println("Deseja continuar? (1-Sim e 2-Não)");
				int escolha2 = entrada.nextInt();
				if (escolha2 == 2) {
					onoff = 1;
				}
			}
			
			//								Entrada 3

			if (usuario == 3) {
				if (statusEnergia == true) {
					System.out.println("Foi aberta uma solicitação para desligar sua energia.\nPor favor, aguarde retornono seu número ou e-mail.");
					System.out.println("Ligue para (xx)x xxxx-xxxx para mais informações\n");
					statusEnergia = false;
					System.out.println("Deseja continuar? (1-Sim e 2-Não)");
					int escolha2 = entrada.nextInt();
					if (escolha2 == 2) {
						onoff = 1;
					}
					System.out.println(statusEnergia);
				}
				else if (statusEnergia == false) {
					System.out.println("Sua energia já está desligada ou foi aberto um processo\npara desligar.");
					System.out.println("Deseja continuar? (1-Sim e 2-Não)");
					int escolha2 = entrada.nextInt();
					if (escolha2 == 2) {
						onoff = 1;
					}
				}
			}
			
			//								Entrada 4
			if (usuario == 4) {
				if (statusEnergia == false) {
					System.out.println("Foi aberta uma solicitação para ligar sua energia.\nPor favor, aguarde retorno no seu número ou e-mail.");
					System.out.println("Ligue para (xx)x xxxx-xxxx para mais informações\n");
					statusEnergia = true;
					System.out.println("Deseja continuar? (1-Sim e 2-Não)");
					int escolha2 = entrada.nextInt();
					if (escolha2 == 2) {
						onoff = 1;
					}
				}
				else if (statusEnergia == true) {
					System.out.println("Sua energia já está ligada ou foi aberto um processo para ligar.");
					System.out.println("Deseja continuar? (1-Sim e 2-Não)");
					int escolha2 = entrada.nextInt();
					if (escolha2 == 2) {
						onoff = 1;
					}
				}
			}
			
			//								Entrada 5
			if (usuario == 5) {
				if (statusEnergia == true) {
					System.out.println("Sua energia está ligada");
					System.out.println("Deseja continuar? (1-Sim e 2-Não)");
					int escolha2 = entrada.nextInt();
					if (escolha2 == 2) {
						onoff = 1;
					}
				}else {
					System.out.println("Sua energia está desligada");
					System.out.println("Deseja continuar? (1-Sim e 2-Não)");
					int escolha2 = entrada.nextInt();
					if (escolha2 == 2) {
						onoff = 1;
					}
				}
			}
			
			//								Entrada 6
			if (usuario ==6) {
				if (debitoAuto == false) {
					System.out.println("O débito automatico está desligado.\nDeseja ligar? (1-Sim e 2-Não)");
					int escolha2 = entrada.nextInt();
					if (escolha2 == 1) {
						debitoAuto = true;
						System.out.println("O débito automatico foi ligado");
						}
				}else {
					System.out.println("O débito automatico está ligado.\nDeseja desligar? (1-Sim e 2-Não)");
					int escolha2 = entrada.nextInt();
					if (escolha2 == 1) {
						debitoAuto = false;
						System.out.println("O débito automatico foi ligado");
						}
				}
			}
			
			//								Entrada 7
			if (usuario == 7) {
				System.out.println("Sua fatura foi enviada no seu email.\nDeseja enviar no seu WhatsApp? (1-Sim e 2-Não)");
				int escolha2 = entrada.nextInt();
				if (escolha2 == 1) {
					System.out.println("A fatura foi enviada");
					}
			}
			
			//								Entrada 0

			if (usuario == 0) {
				entrada.close();
				onoff = 1;
				}
		}
		System.out.println("\nVolte sempre!");	
	}
}
