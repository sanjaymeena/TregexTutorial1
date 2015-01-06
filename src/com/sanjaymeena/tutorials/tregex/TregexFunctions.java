package com.sanjaymeena.tutorials.tregex;

import static com.sanjaymeena.tutorials.tregex.Constants.*;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.sanjaymeena.tutorials.tregex.Constants.POS;

import edu.stanford.nlp.ling.Label;
import edu.stanford.nlp.ling.Sentence;
import edu.stanford.nlp.trees.LabeledScoredTreeFactory;
import edu.stanford.nlp.trees.PennTreeReader;
import edu.stanford.nlp.trees.Tree;
import edu.stanford.nlp.trees.TreeReader;
import edu.stanford.nlp.trees.tregex.TregexMatcher;
import edu.stanford.nlp.trees.tregex.TregexPattern;

/**
 * Tregex functions for detection and extraction of Part of speechs
 * 
 * @author sanjay_meena
 * 
 */
public class TregexFunctions {

	String tregex;
	TregexPattern matchPattern;
	TregexMatcher matcher;

	
	
	private Multimap<POS, String> posMap;

	
	
	private LabeledScoredTreeFactory tree_factory;
	public TregexFunctions() {
		posMap = ArrayListMultimap.create();
		tree_factory = new LabeledScoredTreeFactory();
	}

	/**
	 * Extracts verbs from the sentence.
	 * 
	 * @param sentenceTree
	 */
	public void extractVerbsFromSentence(Tree sentenceTree) {

		tregex = all_Verbs;
		String verbNode = "verb";
		String sentence = treeToString(sentenceTree);
		matchPattern = TregexPatternFactory.getPattern(tregex);
		matcher = matchPattern.matcher(sentenceTree);

		posMap.clear();
		while (matcher.find()) {
			Tree temp = null;
			temp = matcher.getNode(verbNode);

			String v = treeToString(temp);
			posMap.put(POS.VERB, v);
		}

		// print the results

		for (POS connector : posMap.keySet()) {
			switch (connector) {
			case VERB:
				Collection<String> verbs = posMap.get(POS.VERB);
				System.out.println("Sentence: " + sentence);
				System.out.println("verbs: " + verbs.toString());
				System.out.println();
				break;

			default:
				break;
			}
		}

	}
	
	/**
	 * Extracts verbs from the sentence.
	 * 
	 * @param sentenceTree
	 */
	public void extractAdjectivesFromSentence(Tree sentenceTree) {

		tregex = all_Adjectives;
		String verbNode = "adjective";
		String sentence = treeToString(sentenceTree);
		matchPattern = TregexPatternFactory.getPattern(tregex);
		matcher = matchPattern.matcher(sentenceTree);

		posMap.clear();
		while (matcher.find()) {
			Tree temp = null;
			temp = matcher.getNode(verbNode);

			String v = treeToString(temp);
			posMap.put(POS.ADJECTIVE, v);
		}

		// print the results

		for (POS connector : posMap.keySet()) {
			switch (connector) {
			case ADJECTIVE:
				Collection<String> adjectives = posMap.get(POS.ADJECTIVE);
				System.out.println("Sentence: " + sentence);
				System.out.println("adjectives: " + adjectives.toString());
				System.out.println();
				break;

			default:
				break;
			}
		}

	}
	
	
	/**
	 * Extracts common nouns from the sentence.
	 * 
	 * @param sentenceTree
	 */
	public void extractCommonNounsFromSentence(Tree sentenceTree) {

		tregex = all_CommonNouns;
		String verbNode = "commonNoun";
		String sentence = treeToString(sentenceTree);
		matchPattern = TregexPatternFactory.getPattern(tregex);
		matcher = matchPattern.matcher(sentenceTree);

		posMap.clear();
		while (matcher.find()) {
			Tree temp = null;
			temp = matcher.getNode(verbNode);

			String v = treeToString(temp);
			posMap.put(POS.NOUN, v);
		}

		// print the results

		for (POS connector : posMap.keySet()) {
			switch (connector) {
			case NOUN:
				Collection<String> nouns = posMap.get(POS.NOUN);
				System.out.println("Sentence: " + sentence);
				System.out.println("common nouns: " + nouns.toString());
				System.out.println();
				break;

			default:
				break;
			}
		}

	}
	
	
	
	/**
	 * Extracts proper Nouns from the sentence.
	 * 
	 * @param sentenceTree
	 */
	public void extractProperNounsFromSentence(Tree sentenceTree) {

		tregex = all_ProperNouns;
		String verbNode = "properNoun";
		String sentence = treeToString(sentenceTree);
		matchPattern = TregexPatternFactory.getPattern(tregex);
		matcher = matchPattern.matcher(sentenceTree);

		posMap.clear();
		while (matcher.find()) {
			Tree temp = null;
			temp = matcher.getNode(verbNode);

			String v = treeToString(temp);
			posMap.put(POS.NOUN, v);
		}

		// print the results

		for (POS connector : posMap.keySet()) {
			switch (connector) {
			case NOUN:
				Collection<String> nouns = posMap.get(POS.NOUN);
				System.out.println("Sentence: " + sentence);
				System.out.println("properNouns: " + nouns.toString());
				System.out.println();
				break;

			default:
				break;
			}
		}

	}
	
	/**
	 * Extracts Adverbs from the sentence.
	 * 
	 * @param sentenceTree
	 */
	public void extractAdverbsFromSentence(Tree sentenceTree) {

		tregex = all_Adverbs;
		String verbNode = "adverb";
		String sentence = treeToString(sentenceTree);
		matchPattern = TregexPatternFactory.getPattern(tregex);
		matcher = matchPattern.matcher(sentenceTree);

		posMap.clear();
		while (matcher.find()) {
			Tree temp = null;
			temp = matcher.getNode(verbNode);

			String v = treeToString(temp);
			posMap.put(POS.ADVERB, v);
		}

		// print the results

		for (POS connector : posMap.keySet()) {
			switch (connector) {
			case ADVERB:
				Collection<String> adverbs = posMap.get(POS.ADVERB);
				System.out.println("Sentence: " + sentence);
				System.out.println("Adverbs: " + adverbs.toString());
				System.out.println();
				break;

			default:
				break;
			}
		}

	}
	
	

	/**
	 * Convert tree structure to string
	 * 
	 * @param tree
	 * @return
	 */
	private String treeToString(Tree tree) {

		ArrayList<String> sentenceArray = treeToArrayList(tree);

		String sentence = Sentence.listToString(sentenceArray);
		return sentence;

	}

	/**
	 * Convert form tree to ArrayList
	 * 
	 * @param tree
	 * @return Tree
	 */
	private ArrayList<String> treeToArrayList(Tree tree) {
		ArrayList<Label> test = tree.yield();
		ArrayList<String> arrayList = new ArrayList<String>();
		for (Object element : test) {
			Label label = (Label) element;
			arrayList.add(label.value());

		}

		return arrayList;

	}
	
	/**
     * Read tree from a string
     * 
     * @param parseStr
     *            input tree in form a string
     * @return tree
     */
    public Tree readTreeFromString(String parseStr) {
	// read in the input into a Tree data structure
	TreeReader treeReader = new PennTreeReader(new StringReader(parseStr),
		tree_factory);
	Tree inputTree = null;
	try {
	    inputTree = treeReader.readTree();
	    treeReader.close();
	} catch (IOException e) {
	    e.printStackTrace();
	}
	return inputTree;
    }
    
}
