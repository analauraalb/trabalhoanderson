
public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	public void estadoAtual() {
		System.out.println("-------------------------------");
		System.out.println("Conta:" +this.getNumConta());
		System.out.println("tipo:" +this.getTipo());
		System.out.println("dono:" +this.getDono());
		System.out.println("saldo:" +this.getSaldo());
		System.out.println("status:"+this.getStatus());
		
	}
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {
			this.saldo = 50;
		}else if (t == "CP") {
			this.saldo = 150;
		}
		System.out.println("Conta aberta com sucesso!");
		
	}
	public void fecharConta() {
		if (this.getSaldo()>0) {
		System.out.println("Conta n�o pode ser fechada,pois ainda tem dinheiro");
		}else if (this.getSaldo() < 0) {
		System.out.println("Conta n�o pode ser fechada,pois ainda tem d�bito");		
	}else {
		this.setStatus(false);
		System.out.println("Conta fechada com sucesso!");
	}
	}
	public void depositar(float v) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + v);
		System.out.println("Dep�sito feito com suscesso" + this.getDono());	
		}else {
			System.out.println("N�o � poss�vel depositar em conta fechada");
		}
		
	}
	public void sacar(float v) {
		if (this.getStatus()) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo()-v);
				System.out.println("saque realizado na conta" + this.getDono());
			}else {
				System.out.println("saldo insuficiente para saque");
			}
		}else {
			System.out.println("Imposs�vel de saccar em uma conta fechada");
		}
	}
	public void pagarmensal() {
		int v = 0;
		if (this.getTipo()== "CC") {
			v =12;
		}else if (this.getTipo() == "CP") {
			v = 20;
		}
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo()- v);
			System.out.println("Mensalidade paga com sucesso!" + this.getDono());
			
		}else {
			System.out.println("Imposs�vel pagar uma conta fechada");
		}
		
	}
	
	public ContaBanco() {
		this.saldo = 0;
		this.status = false;
		
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
