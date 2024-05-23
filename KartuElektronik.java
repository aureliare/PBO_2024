package latihan11;

import latihan11.Kartu.kartu;

public class KartuElektronik implements kartu {
	private String kodeBank;
	private String pin;
	
	public KartuElektronik(String kodeBank, String pin) {
		super();
		this.kodeBank = kodeBank;
		this.pin = pin;
	}

	public boolean otentikasi(String pinInput) {
		if (pin.equals(pinInput))
			return true;
		else
			return false;
	}

	@Override
	public String encode(String pin) {
		// TODO Auto-generated method stub
		return null;
	}
}
