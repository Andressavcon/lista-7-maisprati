package listaDuplamenteEncadeada.cardGame;

public class PlayerHand {
    private Card firstCard;
    private Card lastCard;
    private int cardCount;

    public PlayerHand() {
        this.firstCard = null;
        this.lastCard = null;
        this.cardCount = 0;
    }

    public void addCard(String cardName) {
        Card newCard = new Card(cardName);

        if (firstCard == null) {
            firstCard = newCard;
            lastCard = newCard;
        } else {
            lastCard.setNext(newCard);
            newCard.setPrev(lastCard);
            lastCard = newCard;
        }
        cardCount++;
        System.out.println("Carta adicionada: " + cardName);
    }

    public void removeCard(String cardName) {
        Card current = firstCard;

        while (current != null) {
            if (current.getCardName().equals(cardName)) {
                if (current == firstCard) {
                    firstCard = current.getNext();
                    if (firstCard != null) {
                        firstCard.setPrev(null);
                    }
                } else if (current == lastCard) {
                    lastCard = current.getPrev();
                    if (lastCard != null) {
                        lastCard.setNext(null);
                    }
                } else {
                    current.getPrev().setNext(current.getNext());
                    current.getNext().setPrev(current.getPrev());
                }

                cardCount--;
                System.out.println("Carta removida: " + cardName);
                return;
            }
            current = current.getNext();
        }

        System.out.println("Carta não encontrada.");
    }

    public void moveCard(String cardName, int newPosition) {
        if (newPosition < 1 || newPosition > cardCount) {
            System.out.println("Posição inválida.");
            return;
        }

        Card current = firstCard;
        Card cardToMove = null;

        int index = 1;
        while (current != null) {
            if (current.getCardName().equals(cardName)) {
                cardToMove = current;
                break;
            }
            current = current.getNext();
            index++;
        }

        if (cardToMove == null) {
            System.out.println("Carta não encontrada.");
            return;
        }

        if (cardToMove == firstCard) {
            firstCard = cardToMove.getNext();
            if (firstCard != null) {
                firstCard.setPrev(null);
            }
        } else if (cardToMove == lastCard) {
            lastCard = cardToMove.getPrev();
            if (lastCard != null) {
                lastCard.setNext(null);
            }
        } else {
            cardToMove.getPrev().setNext(cardToMove.getNext());
            cardToMove.getNext().setPrev(cardToMove.getPrev());
        }

        if (newPosition == 1) {
            cardToMove.setNext(firstCard);
            if (firstCard != null) {
                firstCard.setPrev(cardToMove);
            }
            firstCard = cardToMove;
            cardToMove.setPrev(null);
        } else {
            Card target = firstCard;
            int i = 1;
            while (i < newPosition - 1 && target.getNext() != null) {
                target = target.getNext();
                i++;
            }
            cardToMove.setNext(target.getNext());
            cardToMove.setPrev(target);
            if (target.getNext() != null) {
                target.getNext().setPrev(cardToMove);
            }
            target.setNext(cardToMove);

            if (newPosition == cardCount) {
                lastCard = cardToMove;
            }
        }

        System.out.println("Carta movida para a posição " + newPosition + ": " + cardName);
    }

    public void displayHand() {
        if (firstCard == null) {
            System.out.println("A mão está vazia.");
            return;
        }

        System.out.print("Mão do jogador: ");
        Card current = firstCard;
        while (current != null) {
            System.out.print(current.getCardName() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}