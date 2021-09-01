package examples.patterns.behavioral.state;

public abstract class DocumentState implements State {
	
	protected Document document;
	
	public DocumentState(Document document) {
		this.document = document;
	}

}
