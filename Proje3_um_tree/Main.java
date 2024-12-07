package Proje3_um_tree;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		UmAlani um1 = new UmAlani("Divriği Ulu Camii ve Darüşşifası","Sivas",1985,
			"Located in southwestern Turkey, in the upper valley" +
				" of the Morsynus River, the site consists of two components: the archaeological" +
				" site of Aphrodisias and the marble quarries northeast of the city." );

		UmAlani um2 = new UmAlani("Istanbul'un Tarihi Alanları","İstanbul",1985,
			"This site is located on a secluded plateau " +
				"of northeast Turkey overlooking a ravine that forms a natural border with Armenia.");

		UmAlani um3 = new UmAlani("Göreme Millî Parkı ve Kapadokya","Nevşehir",1985,
			"Troy, with its 4,000 years of history, is one of the most famous archaeological sites in the world");

		UmAlani um4  = new UmAlani("Hattuşa: Hitit Başkenti","Çorum",1986,
			"Arslantepe Mound is a 30-metre-tall archaeological tell located in the Malatya plain, 15 km south-west of the Euphrates River.");

		UmAlani um5 = new UmAlani("Nemrut Dağı","Adıyaman",1987,
			"This property is a serial nomination of" +
				" eight component sites in the City of Bursa and the nearby village of Cumalıkızık, in the southern Marmara region.");

		UmAlani um6 = new UmAlani("Hieropolis-Pamukkale","Denizli",1988,
			"From the 13th century to the advent of the railway in the early 20th century," +
				" Safranbolu was an important caravan station on the main East–West trade route.");

		UmAlani um7 = new UmAlani("Xanthos-Letoon","Antalya-Muğla",1988,
			"Located on an escarpment of the Upper Tigris River Basin that is part of the so-called Fertile Crescent,");

		UmAlani um8 = new UmAlani("Safranbolu Şehri","Karabük",1994,
			"Located within what was once the estuary of the River Kaystros, Ephesus comprises successive Hellenistic and " +
				"Roman settlements founded on new locations, which followed the coastline as it retreated westward.");

		UmAlani um9 = new UmAlani("Truva Arkeolojik Alanı","Çanakkale",1998,
			"Located in the Germuş mountains of south-eastern Anatolia, this property presents monumental round-oval and " +
				"rectangular megalithic structures erected by hunter-gatherers in the Pre-Pottery Neolithic age between 9,600 and 8,200 BCE.");

		UmAlani um10 = new UmAlani("Edirne Selimiye Camii ve Külliyesi","Edirne",2011,
			"Located in an open rural landscape, the archaeological site of Gordion is a multi-layered ancient settlement, " +
				"encompassing the remains of the ancient capital of Phrygia, an Iron Age independent kingdom.");

		UmAlani um11 = new UmAlani("Catalhöyük Neolitik Alanı","Konya",2012,
			"This region of Anatolia was conquered by the Turks at the beginning of the 11th century. " +
				"In 1228–29 Emir Ahmet Shah founded a mosque, with its adjoining hospital, at Divrigi.");

		UmAlani um12 = new UmAlani("Bursa ve Cumalıkızık: Osmanlı İmparatorluğunun Doğuşu","Bursa",2014,
			"The archaeological site of Hattusha, former capital of the Hittite Empire, is notable for its ," +
				"urban organization, the types of construction that have been preserved");

		UmAlani um13 = new UmAlani("Bergama Çok Katmanlı Kültürel Peyzaj Alanı","İzmir",2014,
			"With its strategic location on the Bosphorus peninsula between the Balkans and Anatolia, the Black Sea and the Mediterranean, " +
				"Istanbul has been associated with major political, religious and artistic events for more than 2,000 years.");

		UmAlani um14 = new UmAlani("Diyarbakır Kalesi ve Hevsel Bahçeleri Kültürel Peyzajı","Diyarbakır",2015,
			"The mausoleum of Antiochus I (69–34 B.C.), who reigned over Commagene, a kingdom founded north of Syria and the " +
				"Euphrates after the breakup of Alexander's empire, " +
				"is one of the most ambitious constructions of the Hellenistic period.");

		UmAlani um15 = new UmAlani("Efes","İzmir",2015,
			"Two hills form the 37 ha site on the Southern Anatolian Plateau. The taller eastern mound contains eighteen levels of Neolithic occupation " +
				"between 7400 bc and 6200 bc, including wall paintings, reliefs, sculptures and other symbolic and artistic features.");


		UmAlani um16 = new UmAlani("Ani Arkeolojik Alanı","Kars",2016,
			"This site rises high above the Bakirçay Plain in Turkey’s Aegean region. The acropolis of Pergamon was the capital of " +
				"the Hellenistic Attalid dynasty, a major centre of learning in the ancient world.");

		UmAlani um17 = new UmAlani("Aphrodisias","Aydın",2017,
			"The square Mosque with its single great dome and four slender minarets, dominates the skyline of the former Ottoman capital of Edirne.");

		UmAlani um18 = new UmAlani("Göbekli Tepe", "Şanlıurfa",2018,
			"This serial property is comprised of five hypostyle mosques built in Anatolia between the late " +
				"13th and mid-14th centuries, each located in a different province of present-day Türkiye.");

		UmAlani um19 = new UmAlani("Arslantepe Höyüğü", "Malatya",2021,
			"This site, which was the capital of Lycia, illustrates the blending of Lycian traditions and Hellenic influence, especially " +
				"in its funerary art. The epigraphic " +
				"inscriptions are crucial for our understanding of the history of the Lycian people and their Indo-European language.");

		UmAlani um20 = new UmAlani("Gordion","Ankara",2023,
			"In a spectacular landscape, entirely sculpted by erosion, the Göreme valley and its surroundings contain rock-hewn " +
				"sanctuaries that provide unique evidence of Byzantine art in the post-Iconoclastic period");

		UmAlani um21 = new UmAlani("Anadolu’nun Ortaçağ Dönemi Ahşap Hipostil Camiileri",
			"Konya-Kastamonu-Eskişehir-Afyon-Ankara",
			2023,
			"Deriving from springs in a cliff almost 200 m high overlooking the plain, calcite-laden waters have created at Pamukkale (Cotton Palace) " +
				"an unreal landscape, made up of mineral forests, petrified waterfalls and a series of terraced basins.");

		UmAlani [] umArray = {um1,um2,um3,um4,um5,um6,um7,um8,um9,um10,
			um11,um12,um13,um14,um15,um16,um17,um18,um19,um20,um21};


		boolean keepOn = true;
		while(keepOn){

			System.out.print("1) Type 1 to see ordered tree,the height and data of the um objects: \n" +
				"2) Type 2 to print um objects names in a specific range: \n" +
				"3) Type 3 to see balanced tree and its height: \n" +
				"4) Type 4 to change a um name at the hashTable: \n" +
				"5) Type 5 to create heap tree and see the first three values: \n" +
				"9) Type 9 to exit: \n");
			Scanner input = new Scanner(System.in);
			int value = input.nextInt();

			if(value == 1){
				BinarySearchAlphabetical binaryTree2 = new BinarySearchAlphabetical();
				for(int i = 0; i < umArray.length; i++) {
					binaryTree2.insert(umArray[i]);
				}
				System.out.println();
				System.out.println("Um Alanları:");
				binaryTree2.levelOrderTraversal();
				System.out.println("Height of ordered tree: " +( binaryTree2.height(binaryTree2.root) - 1 ));
				System.out.println("Number of node: " + umArray.length);

			}
			else if(value == 2 ){
				BinaryTree bnt = new BinaryTree();

				// Add the objects to the tree
				for(int i = 0; i < umArray.length; i++) {
					bnt.insert(umArray[i]);
				}
				System.out.println();
				System.out.println();
				bnt.searchAndPrintInRange();

				System.out.println("-----------------------");
				System.out.println("------------------------------");
			}
			else if(value == 3){
				System.out.println("BALANCED TREE");
				BalancedBinaryTree balancedTree = new BalancedBinaryTree();
				Arrays.sort(umArray, Comparator.comparing(um -> um.name));
				int middle = umArray.length / 2;
				balancedTree.root = new TreeNode(umArray[middle]);


				balancedTree.root.left = balancedTree.sortedArrayToBST(umArray, 0, middle - 1);
				balancedTree.root.right = balancedTree.sortedArrayToBST(umArray, middle + 1, umArray.length - 1);


				System.out.println("\nBalanced Tree Level-order Traversal:");
				balancedTree.levelOrderTraversal();

				System.out.println("\nHeight of the balanced Tree: " + ( balancedTree.getHeight() - 1 ));

			}
			else if(value == 4){

				//-------HASHTABLE-----

				DirectChaining dch = new DirectChaining(21);

				for (int i = 0 ; i < umArray.length; i++){
					dch.insertHashTable(umArray[i].name);
				}
				dch.displayHashTable();

				System.out.print("Please type a name you want to change : ");
				Scanner scanner = new Scanner(System.in);
				String inputStr = scanner.nextLine();
				dch.deleteKeyHashTable(inputStr);
				System.out.println("--------UPDATED HASHTABLE--------");
				dch.displayHashTable();
			}

			else if (value == 5){
				System.out.println("BINARY HEAP");
				BinaryHeapPr bh = new BinaryHeapPr(22);

				for(int i = 0; i < 3; i++){
					bh.insert(umArray[i]);
				}
				bh.levelOrder();

			}

			else if(value == 9){
				System.out.println("logged out succesfully!");
				keepOn = false;

			}

		}

	}

}












