package com.sanjaymeena.tutorials.tregex;

public class Constants {

	public static final String all_Verbs = "VP < (VBP|VBD|VB|VBN|VBG|VBZ=verb) ";
	public static final String all_Adjectives = "ADVP|NP < (JJ|JJR|JJS=adjective)";
	public static final String all_Adverbs = "RB|ADVP|NP < (RB|RBR|RBS=adverb) ";
	public static final String all_CommonNouns = "NP < (NN|NNS=commonNoun)";
	public static final String all_ProperNouns = "NP < (NNP|NNPS=properNoun)";
	public static final String all = "S [<< (VP < (VBP|VBD|VB|VBN|VBG|VBZ=verb)) | << (ADVP|NP <(JJ|JJR|JJS=adjective)) |<< (NP < NNP|NNPS=properNoun) |<< (NP <(NN|NNS=commonNoun)) |<< (RB|ADVP|NP < (RB|RBR|RBS=adverb))]";

	/**
	 * Enum for Part of speech
	 */
	public enum POS {
		/**
	     *  
	     */
		NOUN(1),
		/**
	     * 
	     */
		VERB(2),
		/**
	     * 
	     */
		ADJECTIVE(3),
		/**
	     * 
	     */
		ADVERB(4);

		@Override
		public String toString() {

			String string = "";
			if (this == NOUN) {
				string = "noun";
			} else if (this == VERB) {
				string = "verb";

			} else if (this == ADJECTIVE) {
				string = "adjective";
			} else if (this == ADVERB) {
				string = "adverb";
			}
			return string;
		}

		public int id;

		POS(int id) {
			this.id = id;
		}

		/**
		 * @return id
		 */
		public int getValue() {
			return id;
		}
	}

}
