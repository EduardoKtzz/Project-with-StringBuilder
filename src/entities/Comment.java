package entities;

public class Comment {

	//ATRUBUTOS
	private String text;

	//CONSTRUTORES
	public Comment(){

	}

	public Comment(String text) {
		this.text = text;
	}

	//GET E SET
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
