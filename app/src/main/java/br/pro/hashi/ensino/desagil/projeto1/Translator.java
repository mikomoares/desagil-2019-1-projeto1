package br.pro.hashi.ensino.desagil.projeto1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

// Não é permitido mudar nada nessa classe
// exceto o recheio dos três métodos.

public class Translator {
    private final Node root;
    private final HashMap<Character, Node> map;


    // Você deve mudar o recheio deste construtor,
    // de acordo com os requisitos não-funcionais.
    public Translator() {
        // dash = right
        // dot = left
        root = new Node('*');
        map = new HashMap<>();
        map.put('*', root);

        //--> Esquerda para direira
        //Nivel 1
        Node nodeE = new Node('e');
        nodeE.setParent(root);
        Node nodeT = new Node('t');
        nodeT.setParent(root);
        root.setLeft(nodeE);
        root.setRight(nodeT);
        map.put('e', nodeE);
        map.put('t', nodeT);

        //Nivel 2

            //left
            Node nodeI = new Node('i');
            nodeI.setParent(nodeE);
            Node nodeA = new Node('a');
            nodeA.setParent(nodeE);
            nodeE.setLeft(nodeI);
            nodeE.setRight(nodeA);
            map.put('i', nodeI);
            map.put('a', nodeA);

            //right
            Node nodeN = new Node('n');
            nodeN.setParent(nodeT);
            Node nodeM = new Node('m');
            nodeM.setParent(nodeT);
            nodeT.setLeft(nodeN);
            nodeT.setRight(nodeM);
            map.put('n', nodeN);
            map.put('m', nodeM);


        //Nivel 3

            //left

                //left
                Node nodeS = new Node('s');
                nodeS.setParent(nodeI);
                Node nodeU = new Node('u');
                nodeU.setParent(nodeI);
                nodeI.setLeft(nodeS);
                nodeI.setRight(nodeU);
                map.put('s', nodeS);
                map.put('u', nodeU);

                //right
                Node nodeR = new Node('r');
                nodeR.setParent(nodeA);
                Node nodeW = new Node('w');
                nodeW.setParent(nodeA);
                nodeA.setLeft(nodeR);
                nodeA.setRight(nodeW);
                map.put('r', nodeR);
                map.put('w', nodeW);

            // right

                //left
                Node nodeD = new Node('d');
                nodeD.setParent(nodeN);
                Node nodeK = new Node('k');
                nodeK.setParent(nodeN);
                nodeN.setLeft(nodeD);
                nodeN.setRight(nodeK);
                map.put('d', nodeD);
                map.put('k', nodeK);

                //right
                Node nodeG = new Node('g');
                nodeG.setParent(nodeM);
                Node nodeO = new Node('o');
                nodeO.setParent(nodeM);
                nodeM.setLeft(nodeG);
                nodeM.setRight(nodeO);
                map.put('g', nodeG);
                map.put('o', nodeO);

        //Nivel 4

            //left

                //left

                    //left
                    Node nodeH = new Node('h');
                    nodeH.setParent(nodeS);
                    Node nodeV = new Node('v');
                    nodeV.setParent(nodeS);
                    nodeS.setLeft(nodeH);
                    nodeS.setRight(nodeV);
                    map.put('h', nodeH);
                    map.put('v', nodeV);

                    //right
                    Node nodeF = new Node('f');
                    nodeF.setParent(nodeU);
                    Node nodeBlank1 = new Node(' ');
                    nodeBlank1.setParent(nodeU);
                    nodeU.setLeft(nodeF);
                    nodeU.setRight(nodeBlank1);
                    map.put('f', nodeF);

                // right

                    //left
                    Node nodeL = new Node('l');
                    nodeL.setParent(nodeR);
                    Node nodeBlank2 = new Node(' ');
                    nodeBlank2.setParent(nodeR);
                    nodeR.setLeft(nodeL);
                    nodeR.setRight(nodeBlank2);
                    map.put('l', nodeL);

                    //right
                    Node nodeP = new Node('p');
                    nodeP.setParent(nodeW);
                    Node nodeJ = new Node('j');
                    nodeJ.setParent(nodeW);
                    nodeW.setLeft(nodeP);
                    nodeW.setRight(nodeJ);
                    map.put('p', nodeP);
                    map.put('j', nodeJ);



            //right

                //left

                    //left
                    Node nodeB = new Node('b');
                    nodeB.setParent(nodeD);
                    Node nodeX = new Node('x');
                    nodeX.setParent(nodeD);
                    nodeD.setLeft(nodeB);
                    nodeD.setRight(nodeX);
                    map.put('b', nodeB);
                    map.put('x', nodeX);

                    //right
                    Node nodeC = new Node('c');
                    nodeC.setParent(nodeK);
                    Node nodeY = new Node('y');
                    nodeY.setParent(nodeK);
                    nodeK.setLeft(nodeC);
                    nodeK.setRight(nodeY);
                    map.put('c', nodeC);
                    map.put('y', nodeY);

                // right

                    //left
                    Node nodeZ = new Node('z');
                    nodeZ.setParent(nodeG);
                    Node nodeQ = new Node('q');
                    nodeQ.setParent(nodeG);
                    nodeG.setLeft(nodeZ);
                    nodeG.setRight(nodeQ);
                    map.put('z', nodeZ);
                    map.put('q', nodeQ);

                    //right
                    Node nodeBlank3 = new Node(' ');
                    nodeBlank3.setParent(nodeO);
                    Node nodeBlank4 = new Node(' ');
                    nodeBlank4.setParent(nodeO);
                    nodeO.setLeft(nodeBlank3);
                    nodeO.setRight(nodeBlank4);

        //Nivel 5

            //left

                //left

                    //left

                        //left
                        Node node5 = new Node('5');
                        node5.setParent(nodeH);
                        Node node4 = new Node('4');
                        node4.setParent(nodeH);
                        nodeH.setLeft(node5);
                        nodeH.setRight(node4);
                        map.put('5', node5);
                        map.put('4', node4);

                        //right
                        Node nodeBlank5 = new Node(' ');
                        nodeBlank5.setParent(nodeV);
                        Node node3 = new Node('3');
                        node3.setParent(nodeV);
                        nodeV.setLeft(nodeBlank5);
                        nodeV.setRight(node3);
                        map.put('3', node3);

                    // right

                        //left
                        Node nodeBlank6 = new Node(' ');
                        nodeBlank6.setParent(nodeF);
                        Node nodeBlank7 = new Node(' ');
                        nodeBlank7.setParent(nodeF);
                        nodeF.setLeft(nodeBlank6);
                        nodeF.setRight(nodeBlank7);

                        //right
                        Node nodeBlank8 = new Node(' ');
                        nodeBlank8.setParent(nodeBlank1);
                        Node node2 = new Node('2');
                        node2.setParent(nodeBlank1);
                        nodeBlank1.setLeft(nodeBlank8);
                        nodeBlank1.setRight(node2);
                        map.put('2', node2);



                //right

                    //left

                        //left
                        Node nodeBlank9 = new Node(' ');
                        nodeBlank9.setParent(nodeL);
                        Node nodeBlank10 = new Node(' ');
                        nodeBlank10.setParent(nodeL);
                        nodeL.setLeft(nodeBlank9);
                        nodeL.setRight(nodeBlank10);

                        //right
                        Node nodePlus = new Node('+');
                        nodePlus.setParent(nodeBlank2);
                        Node nodeBlank11 = new Node(' ');
                        nodeBlank11.setParent(nodeBlank2);
                        nodeBlank2.setLeft(nodePlus);
                        nodeBlank2.setRight(nodeBlank11);
                        map.put('+', nodePlus);

                    // right

                        //left
                        Node nodeBlank12 = new Node(' ');
                        nodeBlank12.setParent(nodeP);
                        Node nodeBlank13 = new Node(' ');
                        nodeBlank13.setParent(nodeP);
                        nodeP.setLeft(nodeBlank12);
                        nodeP.setRight(nodeBlank13);

                        //right
                        Node nodeBlank14 = new Node(' ');
                        nodeBlank14.setParent(nodeJ);
                        Node node1 = new Node('1');
                        node1.setParent(nodeJ);
                        nodeJ.setLeft(nodeBlank14);
                        nodeJ.setRight(node1);
                        map.put('1', node1);

            //Right

                //left

                    //left

                        //left
                            Node node6 = new Node('6');
                            node6.setParent(nodeB);
                            Node nodeEquals = new Node('=');
                            nodeEquals.setParent(nodeB);
                            nodeB.setLeft(node6);
                            nodeB.setRight(nodeEquals);
                            map.put('6', node6);
                            map.put('=', nodeEquals);

                        //right
                            Node nodeSlash = new Node('/');
                            nodeSlash.setParent(nodeX);
                            Node nodeBlank15 = new Node(' ');
                            nodeBlank15.setParent(nodeX);
                            nodeX.setLeft(nodeSlash);
                            nodeX.setRight(nodeBlank15);
                            map.put('/', nodeSlash);

                    // right

                        //left
                            Node nodeBlank16 = new Node(' ');
                            nodeBlank16.setParent(nodeC);
                            Node nodeBlank17 = new Node(' ');
                            nodeBlank17.setParent(nodeC);
                            nodeC.setLeft(nodeBlank16);
                            nodeC.setRight(nodeBlank17);

                        //right
                            Node nodeBlank18 = new Node(' ');
                            nodeBlank18.setParent(nodeY);
                            Node nodeBlank19 = new Node(' ');
                            nodeBlank19.setParent(nodeY);
                            nodeY.setLeft(nodeBlank18);
                            nodeY.setRight(nodeBlank19);


                //right

                     //left

                         //left
                            Node node7 = new Node('7');
                            node7.setParent(nodeZ);
                            Node nodeBlank20 = new Node(' ');
                            nodeBlank20.setParent(nodeZ);
                            nodeZ.setLeft(node7);
                            nodeZ.setRight(nodeBlank20);
                            map.put('7', node7);


                        //right
                            Node nodeBlank21 = new Node(' ');
                            nodeBlank21.setParent(nodeQ);
                            Node nodeBlank22 = new Node(' ');
                            nodeBlank22.setParent(nodeQ);
                            nodeQ.setLeft(nodeBlank21);
                            nodeQ.setRight(nodeBlank22);

                    // right

                        //left
                            Node node8 = new Node('8');
                            node8.setParent(nodeBlank3);
                            Node nodeBlank23 = new Node(' ');
                            nodeBlank23.setParent(nodeBlank3);
                            nodeBlank3.setLeft(node8);
                            nodeBlank3.setRight(nodeBlank23);
                            map.put('8', node8);

                    //right
                            Node node9 = new Node('9');
                            node9.setParent(nodeBlank4);
                            Node node0 = new Node('0');
                            node0.setParent(nodeBlank4);
                            nodeBlank4.setLeft(node9);
                            nodeBlank4.setRight(node0);
                            map.put('9', node9);
                            map.put('0', node0);
//        // Linha1
//        Node nodeE = new Node('e');
//        nodeE.setParent(root);
//        Node nodeT = new Node('t');
//        nodeT.setParent(root);
//        root.setLeft(nodeE);
//        root.setRight(nodeT);
//        map.put('e', nodeE);
//        map.put('t', nodeT);
//
//        // Linha 2
//        Node nodeI = new Node('i');
//        Node nodeA = new Node('a');
//        nodeI.setParent(nodeE);
//        nodeA.setParent(nodeE);
//        nodeE.setLeft(nodeI);
//        nodeE.setRight(nodeA);
//        Node nodeN = new Node('n');
//        Node nodeM = new Node('m');
//        nodeN.setParent(nodeT);
//        nodeM.setParent(nodeT);
//        nodeT.setLeft(nodeN);
//        nodeT.setRight(nodeM);
//        map.put('i', nodeI);
//        map.put('a', nodeA);
//        map.put('n', nodeN);
//        map.put('m', nodeM);
//
//
//        // Linha 3
//        Node nodeS = new Node('s');
//        Node nodeU = new Node('u');
//        nodeS.setParent(nodeI);
//        nodeU.setParent(nodeI);
//        nodeI.setLeft(nodeS);
//        nodeI.setRight(nodeU);
//        Node nodeR = new Node('r');
//        Node nodeW = new Node('w');
//        nodeR.setParent(nodeA);
//        nodeW.setParent(nodeA);
//        nodeA.setLeft(nodeR);
//        nodeA.setRight(nodeW);
//        Node nodeD = new Node('d');
//        Node nodeK = new Node('k');
//        nodeD.setParent(nodeN);
//        nodeK.setParent(nodeN);
//        nodeN.setLeft(nodeD);
//        nodeN.setRight(nodeK);
//        Node nodeG = new Node('g');
//        Node nodeO = new Node('o');
//        nodeG.setParent(nodeM);
//        nodeO.setParent(nodeM);
//        nodeM.setLeft(nodeG);
//        nodeM.setRight(nodeO);
//        map.put('s', nodeS);
//        map.put('u', nodeU);
//        map.put('r', nodeR);
//        map.put('w', nodeW);
//        map.put('d', nodeD);
//        map.put('k', nodeK);
//        map.put('g', nodeG);
//        map.put('o', nodeO);
//
//        // Linha 4
//        Node nodeH = new Node('h');
//        Node nodeV = new Node('v');
//        nodeH.setParent(nodeS);
//        nodeV.setParent(nodeS);
//        nodeS.setLeft(nodeH);
//        nodeS.setRight(nodeV);
//        Node nodeF = new Node('f');
//        Node node4blank = new Node('!');
//        nodeF.setParent(nodeU);
//        node4blank.setParent(nodeU);
//        nodeU.setLeft(nodeF);
//        nodeU.setRight(node4blank);
//        Node nodeL = new Node('l');
//        Node node4blank1 = new Node('!');
//        nodeL.setParent(nodeR);
//        node4blank1.setParent(nodeR);
//        nodeR.setLeft(nodeL);
//        nodeR.setRight(node4blank1);
//        Node nodeP = new Node('p');
//        Node nodeJ = new Node('j');
//        nodeP.setParent(nodeW);
//        nodeJ.setParent(nodeW);
//        nodeW.setLeft(nodeP);
//        nodeW.setRight(nodeJ);
//        Node nodeB = new Node('b');
//        Node nodeX =new Node('x');
//        nodeB.setParent(nodeD);
//        nodeX.setParent(nodeD);
//        nodeD.setLeft(nodeB);
//        nodeD.setRight(nodeX);
//        Node nodeC = new Node('c');
//        Node nodeY = new Node('y');
//        nodeC.setParent(nodeK);
//        nodeY.setParent(nodeK);
//        nodeK.setLeft(nodeC);
//        nodeK.setRight(nodeY);
//        Node nodeZ = new Node('z');
//        Node nodeQ = new Node('q');
//        nodeZ.setParent(nodeG);
//        nodeQ.setParent(nodeG);
//        nodeG.setLeft(nodeZ);
//        nodeG.setRight(nodeQ);
//        Node node4blank2 = new Node('!');
//        Node node4blank3 = new Node('!');
//        node4blank2.setParent(nodeO);
//        node4blank3.setParent(nodeO);
//        nodeO.setLeft(node4blank2);
//        nodeO.setRight(node4blank3);
//        map.put('h', nodeH);
//        map.put('v', nodeV);
//        map.put('f', nodeF);
//        map.put('l', nodeL);
//        map.put('p', nodeP);
//        map.put('j', nodeJ);
//        map.put('b', nodeB);
//        map.put('x', nodeX);
//        map.put('c', nodeC);
//        map.put('y', nodeY);
//        map.put('z', nodeZ);
//        map.put('q', nodeQ);
//
//
//        // Linha 5
//        Node node5 = new Node('5');
//        Node node4 = new Node('4');
//        node5.setParent(nodeH);
//        node4.setParent(nodeH);
//        nodeH.setLeft(node5);
//        nodeH.setRight(node4);
//        Node node5blank = new Node('!');
//        Node node3 = new Node ('3');
//        node5blank.setParent(nodeV);
//        node3.setParent(nodeV);
//        nodeV.setLeft(node5blank);
//        nodeV.setRight(node3);
//        Node node5blank1 = new Node('!');
//        Node node5blank2 = new Node('!');
//        node5blank1.setParent(nodeF);
//        node5blank2.setParent(nodeF);
//        nodeF.setLeft(node5blank1);
//        nodeF.setRight(node5blank2);
//        Node node5blank3 = new Node('!');
//        Node node2 = new Node('2');
//        node5blank3.setParent(node4blank);
//        node2.setParent(node4blank);
//        node4blank.setLeft(node5blank3);
//        node4blank.setRight(node2);
//        Node node5blank4 = new Node('!');
//        Node node5blank5 = new Node('!');
//        node5blank4.setParent(nodeL);
//        node5blank5.setParent(nodeL);
//        nodeL.setLeft(node5blank4);
//        nodeL.setRight(node5blank5);
//        Node nodeplus = new Node('+');
//        Node node5blank6 = new Node('!');
//        nodeplus.setParent(node4blank1);
//        node5blank6.setParent(node4blank1);
//        node4blank1.setLeft(nodeplus);
//        node4blank1.setRight(node5blank6);
//        Node node5blank7 = new Node('!');
//        Node node5blank8 = new Node('!');
//        node5blank7.setParent(nodeP);
//        node5blank8.setParent(nodeP);
//        nodeP.setLeft(node5blank7);
//        nodeP.setRight(node5blank8);
//        Node node5blank9 = new Node('!');
//        Node node1 = new Node('1');
//        node5blank9.setParent(nodeJ);
//        node1.setParent(nodeJ);
//        nodeJ.setLeft(node5blank9);
//        nodeJ.setRight(node1);
//        Node node6 = new Node('6');
//        Node nodeequal = new Node('=');
//        node6.setParent(nodeB);
//        nodeequal.setParent(nodeB);
//        nodeB.setLeft(node6);
//        nodeB.setRight(nodeequal);
//        Node nodebar = new Node('/');
//        Node node5blank10 = new Node('!');
//        nodebar.setParent(nodeX);
//        node5blank10.setParent(nodeX);
//        nodeX.setLeft(nodebar);
//        nodeX.setRight(node5blank10);
//        Node node5blank11 = new Node('!');
//        Node node5blank12 = new Node('!');
//        node5blank11.setParent(nodeC);
//        node5blank12.setParent(nodeC);
//        nodeC.setLeft(node5blank11);
//        nodeC.setRight(node5blank12);
//        Node node5blank13 = new Node('!');
//        Node node5blank14 = new Node('!');
//        node5blank13.setParent(nodeY);
//        node5blank14.setParent(nodeY);
//        nodeY.setLeft(node5blank13);
//        nodeY.setRight(node5blank14);
//        Node node7 = new Node('7');
//        Node node5blank15 = new Node('!');
//        node7.setParent(nodeZ);
//        node5blank15.setParent(nodeZ);
//        nodeZ.setLeft(node7);
//        nodeZ.setRight(node5blank15);
//        Node node5blank16 = new Node('!');
//        Node node5blank17 = new Node('!');
//        node5blank16.setParent(nodeQ);
//        node5blank17.setParent(nodeQ);
//        nodeQ.setLeft(node5blank16);
//        nodeQ.setRight(node5blank17);
//        Node node8 = new Node('8');
//        Node node5blank18 = new Node('!');
//        node8.setParent(node4blank2);
//        node5blank18.setParent(node4blank2);
//        node4blank2.setLeft(node8);
//        node4blank2.setRight(node5blank18);
//        Node node9 = new Node('9');
//        Node node0 = new Node('0');
//        node9.setParent(node4blank3);
//        node0.setParent(node4blank3);
//        node4blank3.setLeft(node9);
//        node4blank3.setRight(node0);
//        map.put('5', node5);
//        map.put('4', node4);
//        map.put('3', node3);
//        map.put('2', node2);
//        map.put('+', nodeplus);
//        map.put('1', node1);
//        map.put('6', node6);
//        map.put('=', nodeequal);
//        map.put('/', nodebar);
//        map.put('7', node7);
//        map.put('8', node8);
//        map.put('9', node9);
//        map.put('0', node0);
    }

    // Você deve mudar o recheio deste método, de
    // acordo com os requisitos não-funcionais.
    public char morseToChar(String code) {
        Node no = root;
        for (int i = 0; i < code.length(); i++) {
            char letter = code.charAt(i);

            if (letter == '-') {
                no = no.getRight();
            } else {
                no = no.getLeft();
            }
        }
        return no.getValue();
    }


    // Você deve mudar o recheio deste método, de
    // acordo com os requisitos não-funcionais.
    public String charToMorse(char c) {
        StringBuilder morse = new StringBuilder();
        Node no = map.get(c);

        while (no != root) {
            if (no.getParent().getLeft() == no) {
                morse.insert(0, '.');
            } else if (no.getParent().getRight() == no) {
                morse.insert(0, '-');
            }
            no = no.getParent();
        }
        return morse.toString();
    }



    // Você deve mudar o recheio deste método, de
    // acordo com os requisitos não-funcionais.
    public LinkedList<String> getCodes() {
        Queue<Node> fila = new LinkedList<>();
        LinkedList<String> lista = new LinkedList<>();
        fila.add(root);

        while (!fila.isEmpty()) {
            Node no = fila.element();
            Node left = no.getLeft();
            Node right = no.getRight();
            if (left != null) {
                fila.add(left);
            }
            if (right != null) {
                fila.add(right);
            }
            if (no.getValue() != ' ' && no.getValue() != '/' && no.getValue() != '+' && no.getValue() != '=') {
                lista.add(charToMorse(no.getValue()));
            }
            fila.remove();
        }
        return lista;
    }
}
