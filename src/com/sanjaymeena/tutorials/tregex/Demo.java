package com.sanjaymeena.tutorials.tregex;

import edu.stanford.nlp.trees.Tree;

public class Demo {

public static void main(String args[]){	
	
TregexFunctions tregexFunctions=new TregexFunctions();	
String sentence1="(ROOT (S (NP (NNP Diane)) (VP (VBD felt) (VP (VBN manipulated) (PP (IN by) (NP (NP (PRP$ her) (NN beagle) (NNP Santana)) (, ,) (SBAR (WP$ whose) (S (NP (JJ big) (, ,) (JJ brown) (NNS eyes)) (VP (VBD pleaded) (PP (IN for) (NP (DT another) (NN cookie)))))))))) (. .)))";
String sentence2="(ROOT (SINV (VP (VBG Chewing) (PP (IN with) (NP (PRP$ her) (NN mouth)))) (VP (ADVP (JJ open)) (VBZ is) (NP (NP (CD one) (NN reason)) (SBAR (WHADVP (WRB why)) (S (NP (NNP Fred)) (VP (MD can) (RB not) (VP (VB stand) (S (VP (VBG sitting) (PP (IN across) (PP (IN from) (NP (PRP$ his) (NN sister)))))))))))) (NP (NNP Melanie)) (. .)))"; 
String sentence3="(ROOT (S (PP (IN In) (NP (NNP Britain))) (NP (NP (DT the) (JJS hottest) (NN month)) (PP (IN of) (NP (DT the) (NN year)))) (VP (VBZ is) (NP (NP (NNP July)) (, ,) (SBAR (IN whereas) (S (PP (IN in) (NP (NNP Australia))) (NP (PRP it)) (VP (VBZ is) (ADVP (RB usually)) (NP (DT the) (JJS coldest))))))) (. .)))";


	Tree tree=null;
	
	/**
	 * Demo for verbs extraction
	 */
	
	 //Read the Stanford parse tree from the string 
	tree=tregexFunctions.readTreeFromString(sentence1);
	//extract verbs from sentence
	tregexFunctions.extractVerbsFromSentence(tree);

	
	/**
	 * Demo for adverbs extraction
	 */
	
	 //Read the Stanford parse tree from the string 
	tree=tregexFunctions.readTreeFromString(sentence1);
	//extract adverbs from sentence
	tregexFunctions.extractAdverbsFromSentence(tree);
	
	
	/**
	 * Demo for common noun  extraction
	 */
	
	 //Read the Stanford parse tree from the string 
	tree=tregexFunctions.readTreeFromString(sentence1);
	//extract adverbs from sentence
	tregexFunctions.extractCommonNounsFromSentence(tree);
	
	
	
	/**
	 * Demo for proper noun  extraction
	 */
	
	 //Read the Stanford parse tree from the string 
	tree=tregexFunctions.readTreeFromString(sentence1);
	//extract adverbs from sentence
	tregexFunctions.extractProperNounsFromSentence(tree);
	
	/**
	 * Demo for adjectives  extraction
	 */
	
	 //Read the Stanford parse tree from the string 
	tree=tregexFunctions.readTreeFromString(sentence1);
	//extract adverbs from sentence
	tregexFunctions.extractAdjectivesFromSentence(tree);
	
}
}
