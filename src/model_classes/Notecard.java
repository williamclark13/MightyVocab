package model_classes;

public class Notecard {

	private String term;
	private String definition;

	/**
	 * Instantiates an instance of a Notecard
	 * 
	 * @precondition term != null || !term.isEmpty() && description != null ||
	 *               !description.isEmpty()
	 * @postcondition none
	 * 
	 * @param term
	 * @param definition
	 */
	public Notecard(String term, String definition) {
		this.setTerm(term);
		this.setDefinition(definition);
	}

	/**
	 * Get notecard term
	 * 
	 * @return notecard term
	 */
	public String getTerm() {
		return this.term;
	}

	/**
	 * Set the notecard term
	 * 
	 * @param term
	 */
	public void setTerm(String term) {
		if (term == null) {
			throw new IllegalArgumentException("Term cannot be null.");
		}
		if (term.isEmpty()) {
			throw new IllegalArgumentException("Term cannot be empty.");
		}
		this.term = term;
	}

	/**
	 * Get notecard definition
	 * 
	 * @return notecard definition
	 */
	public String getDefinition() {
		return this.definition;
	}

	/**
	 * Set the notecard description
	 * 
	 * @param description
	 */
	public void setDefinition(String definition) {
		if (definition == null) {
			throw new IllegalArgumentException("Definition cannot be null.");
		}
		if (definition.isEmpty()) {
			throw new IllegalArgumentException("Definition cannot be empty.");
		}
		this.definition = definition;
	}

	@Override
	public String toString() {
		return "Term: " + this.term + System.lineSeparator() + "Definition: " + this.definition;
	}
}
