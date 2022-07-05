
public class StringMethodsSample {

    public static void main(String[] args) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        // chartAt

        char letter = alphabet.charAt(5);        
        System.out.println(letter); // imprime o valor 'f'
        
        // concat
        
        String vowels = "aeiou";
        String invertedVowels = "uoiea";
	String newVowels = vowels.concat(invertedVowels); // Imprime o valor "aeiouuoiea"	
	System.out.println(newVowels);	
	System.out.println("2".concat("2")); // Imprime o valor "22"	 
	System.out.println("".concat("Name").concat(" Lastname")); // Imprime o valor "Name Lastname"
	
	// contains
	
	boolean result1 = vowels.contains("ei");
	boolean result2 = vowels.contains("eo");
	boolean result3 = vowels.contains("EI");

	System.out.println(result1); // Imprime o valor true
	System.out.println(result2); // Imprime o valor false
	System.out.println(result3); // Imprime o valor false, pois "ei" é DIFERENTE de "EI"

	if(!vowels.contains("iu")){ // Compara o resultado false, por meio da NEGAÇÃO de um resultado true
	    System.out.println("Não contêm a sequência");
	} else {
	    System.out.println("Contêm a sequência");
	}
	
	// endsWith
	
	System.out.println(alphabet.endsWith("vwxyz")); // Imprime o valor true
	System.out.println(alphabet.endsWith("yz")); // Imprime o valor true
	System.out.println(alphabet.endsWith("vwyz")); // Imprime o valor false
	System.out.println(alphabet.endsWith("zya")); // Imprime o valor false
	System.out.println(vowels.endsWith("aei")); // Imprime o valor false
	System.out.println(vowels.endsWith("aeiou")); // Imprime o valor true
	System.out.println(vowels.endsWith("u")); // Imprime o valor true
	System.out.println("bcaeiou".endsWith(vowels)); // Imprime o valor true
	System.out.println("aeioubcd".endsWith(vowels)); // Imprime o valor false
	
	// equals
	
	boolean c1 = vowels.equals("aeiou"); 
	boolean c2 = vowels.equals("AeIou"); 
	boolean c3 = vowels.equals("aeio");

	System.out.println(c1); // Imprime o valor true
	System.out.println(c2); // Imprime o valor false
	System.out.println(c3); // Imprime o valor false

	// equalsIgnoreCase
	
	System.out.println(vowels.equalsIgnoreCase("aeiou")); // Imprime o valor true
	System.out.println(vowels.equalsIgnoreCase("AEIOU"));  // Imprime o valor true
	System.out.println(vowels.equalsIgnoreCase("aEiOu"));  // Imprime o valor true
	System.out.println(vowels.equalsIgnoreCase(null));  // Imprime o valor false
	System.out.println(vowels.equalsIgnoreCase("A Eiou"));  // Imprime o valor false
	System.out.println(vowels.equalsIgnoreCase("AEioU "));  // Imprime o valor false
	System.out.println(vowels.equalsIgnoreCase("AEióU"));  // Imprime o valor false
	
	// hashCode
	
	String password = "yourPassword";
	int hashedPassword = password.hashCode();
	System.out.println(hashedPassword); // Imprime o valor 714009582
	System.out.println("".hashCode()); // Imprime o valor 0
	
	// indexOf
	
	String text1 = "asdfa2dfa2df";
	String text2 = "fdsafdsafdsa";
	int res1 = text1.indexOf('d');
	int res2 = text2.indexOf('f');
	int res3 = text1.indexOf('2');
	int res4 = text2.indexOf('m');
	System.out.println(res1); // Imprime o valor 2
	System.out.println(res2); // Imprime o valor 0
	System.out.println(res3); // Imprime o valor 5
	System.out.println(res4); // Imprime o valor -1 (nenhuma ocorrência)
	
	System.out.println(text1.indexOf('d', 0)); // Imprime o valor 2
	System.out.println(text1.indexOf('d', 2)); // Imprime o valor 2
	System.out.println(text1.indexOf('d', 3)); // Imprime o valor 6
	System.out.println(text1.indexOf('d', 6)); // Imprime o valor 6
	System.out.println(text1.indexOf('d', 11)); // Imprime o valor -1 (nenhuma ocorrência)
	
	System.out.println(text1.indexOf("dfa")); // Imprime o valor 2
	System.out.println(text1.indexOf("dfad")); // Imprime o valor -1 (nenhuma ocorrência)
	
	System.out.println(text1.indexOf("dfa", 1)); // Imprime o valor 2
	System.out.println(text1.indexOf("dfa", 5)); // Imprime o valor 6
	System.out.println(text1.indexOf("dfa", 9)); // Imprime o valor -1 (nenhuma ocorrência)
	
	// isEmpty
	
	String s1 = ""; // String com valor vazio (comprimento: 0)
	String s2 = " "; // String com espaço em branco como valor (comprimento: 1)
	String s3 = "abc";

	System.out.println(s1.isEmpty()); // Imprime o valor true
	System.out.println(s2.isEmpty()); // Imprime o valor false
	System.out.println(s3.isEmpty()); // Imprime o valor false
	
	// lastIndexOf
	
	int index = "hahahaha".lastIndexOf('h');
	System.out.println(index); // Imprime o valor 6
	System.out.println("hahahaha".lastIndexOf('g')); // Imprime o valor -1 (nenhuma ocorrência)
	
	System.out.println("hahah".lastIndexOf('a', 3)); // Imprime o valor 3
	System.out.println("hahah".lastIndexOf('a', 0)); // Imprime o valor -1 (nenhuma ocorrência)
	
	System.out.println("haha".lastIndexOf("ha")); // Imprime o valor 2
	System.out.println("haha".lastIndexOf("h a")); // Imprime o valor -1 (nenhuma ocorrência)
	
	System.out.println("haaah".lastIndexOf("aa", 2)); // Imprime o valor 2
	System.out.println("haaah".lastIndexOf("aa", 0)); // Imprime o valor -1
	
	// length
	
	String str1 = "";
	String str2 = " ";
	String str3 = "Rio de Janeiro";
	String str4 = "São Gonçalo";
	String str5 = "âáàãa";
	String str6 = "52º 30' 00\" N / 13º 25' 48\" E"; // Aspas duplas (dentro da String) sendo escapadas com o caractere '\'
	String str7 = "\\"; // Barra invertida sendo escapada por '\\'
	String str8 = "\\\\"; // 2 Barras invertidas sendo escapadas por '\\'
	
	System.out.println(str1.length()); // Imprime o valor 0
	System.out.println(str2.length()); // Imprime o valor 1
	System.out.println(str3.length()); // Imprime o valor 14
	System.out.println(str4.length()); // Imprime o valor 11
	System.out.println(str5.length()); // Imprime o valor 5
	System.out.println(str6.length()); // Imprime o valor 29, o caractere '\' não é contado, pois é usado como símbolo de escape
	System.out.println(str7.length()); // Imprime o valor 1
	System.out.println(str8.length()); // Imprime o valor 2
	
        // matches
        
        String regex = "ab(b*|c)a+"; // Contêm "ab", seguido por 0 ou mais "b", ou 1 "c" e depois 1 ou mais "a"
        
        String t1 = "aabaa";
        String t2 = "abbbba";
        String t3 = "aba";
        String t4 = "abca";
        String t5 = "abbaa";
        String t6 = "abb";
        String t7 = "abcca";
        
        System.out.println(t1.matches(regex)); // Imprime o valor false
        System.out.println(t2.matches(regex)); // Imprime o valor true
        System.out.println(t3.matches(regex)); // Imprime o valor true
        System.out.println(t4.matches(regex)); // Imprime o valor true
        System.out.println(t5.matches(regex)); // Imprime o valor true
        System.out.println(t6.matches(regex)); // Imprime o valor false
        System.out.println(t7.matches(regex)); // Imprime o valor false
        
        // repeat
        
        System.out.println(t1.repeat(1)); // Imprime o valor "aabaa"
	System.out.println(t1.repeat(3)); // Imprime o valor "aabaaaabaaaabaa"
	System.out.println(t1.repeat(0)); // Imprime o valor ""
	
	// replace
	
	String t8 = t1.replace('a','A');
	String t9 = t1.replace('b','$');
	String t10 = t2.replace('a','2').replace('b','@');
	String t11 = t2.replace('c','a');

	System.out.println(t8); // Imprime o valor "AAbAA"
	System.out.println(t9);  // Imprime o valor "aa$aa"
	System.out.println(t10); // Imprime o valor "2@@@@2"
	System.out.println(t11); // Imprime o valor "abbbba", isto é, a própria String, já que oldChar informado não existe na String.
        
        String t12 = t1.replace("aab","abababa");
        String t13 = t2.replace("bb",""); // Substituir por vazio, é equivalente à remover todas as ocorrências "bb"
        String t14 = t3.replace("abb","abab");
        String t15 = t4.replace("ab","ba").replace("ba","BA"); // Substituição combinada. Veja que "ab" é substituído por "ba", que por sua vez também é substituído.
        String t16 = t2.replace("bbb","aaa");
        
        System.out.println(t12); // Imprime o valor "abababaaa"
        System.out.println(t13); // Imprime o valor "aa"
        System.out.println(t14); // Imprime o valor "aba", que é o valor da String t3, já que o parâmetro informado não existe.
        System.out.println(t15); // Imprime o valor "BAca"
        System.out.println(t16); // Imprimeo valor "aaaaba"
 
 	// replaceAll
 	
        String regex2 = "\\d+";  // Corresponde à sequências de dígitos
        String regex3 = "(-|/)+"; // Corresponde à sequências dos operadores aritméticos '-' ou '/'
        
        System.out.println("adrew452kjsl902a1@".replaceAll(regex2, "*")); // Imprime o valor "adrew*kjsl*a*@"
        System.out.println("2+(-1*3)5///+".replaceAll(regex3, "#")); // Imprime o valor "2+(#1*3)5#+"
        
        // split
        
        String expression = "2-2/3*5+23.59-12-26/2";
	String[] partString = expression.split(regex3);

	System.out.println(partString[0]); // Imprime o valor "2"
	System.out.println(partString[1]); // Imprime o valor "2"
	System.out.println(partString[2]); // Imprime o valor "3*5+23.59"
	System.out.println(partString[3]); // Imprime o valor "12"
	System.out.println(partString[4]); // Imprime o valor "26"
	System.out.println(partString[5]); // Imprime o valor "2"
	
	String test = "abc;;abc;abc;abc;abc;;";
		
	String[] partes1 = test.split(";", 2);
 	for(int i = 0; i < partes1.length; i++){
            System.out.println(partes1[i]); // Imprime os valores: {"abc",";abc;abc;abc;abc;;"}
        }        
        
        String[] partes2 = test.split(";", 4);
        for(int i = 0; i < partes2.length; i++){
            System.out.println(partes2[i]); // Imprime os valores: {"abc","","abc","abc;abc;abc;;"}
        }
        
        String[] partes3 = test.split(";", -1);
        for(int i = 0; i < partes3.length; i++){
            System.out.println(partes3[i]); // Imprime os valores: {"abc","","abc","abc","abc","abc","",""}
        }
        
        String[] partes4 = test.split(";", 0);
        for(int i = 0; i < partes4.length; i++){
            System.out.println(partes4[i]); // Imprime os valores: {"abc","","abc","abc","abc","abc"}
        }
                
        String[] partes5 = test.split(";b", 2);
        for(int i = 0; i < partes5.length; i++){
            System.out.println(partes5[i]); // Imprime o valor da própria String test, já que a regex não se aplica à String. 
            // O valor ocupará o índice 0 do Array, isto é: {"abc;;abc;abc;abc;abc;;"}
        }      
        
        // startsWidth
        
        boolean r1 = test.startsWith("abc");
        boolean r2 = test.startsWith("ab;");
        
 	System.out.println(r1); // Imprime o valor true
 	System.out.println(r2); // Imprime o valor false
 	
 	System.out.println(test.startsWith("abc", 5)); // Imprime o valor true
 	System.out.println(test.startsWith("abc", 6)); // Imprime o valor false
 	
 	// substring
 	
 	String sub1 = "qwertyu".substring(4);
	String sub2 = "zxcvbnm".substring(2);

	System.out.println(sub1); // Imprime o valor "tyu"
	System.out.println(sub2); // Imprime o valor "cvbnm"
	
	System.out.println("qwertyuiop".substring(2, 5)); // Imprime o valor "ert"
	System.out.println("asdfghjklç".substring(3, 4)); // Imprime o valor "f"
	
	// toLowerCase
	
	String city = "MancHESteR".toLowerCase();
	System.out.println(city); // Imprime o valor "manchester"
	
	// toString
	
	// toUpperCase
	
	System.out.println("MancHESteR".toUpperCase()); // Imprime o valor "MANCHESTER"
	
	// trim
	
	String city2 = " New York ";
	String city3 = "  ";

	System.out.println(city2.trim()); // Importa o valor "New York";
	System.out.println(city3.trim()); // Importa o valor (vazio) "";
        
    }

}
