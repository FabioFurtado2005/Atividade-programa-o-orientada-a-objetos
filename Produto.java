����   = S  Questão1/Produto  java/lang/Object nome Ljava/lang/String; preco D quantidadeNoEstoque I <init> (Ljava/lang/String;DI)V Code
     ()V	    	    	   	 
 LineNumberTable LocalVariableTable this LQuestão1/Produto; getNome ()Ljava/lang/String; setNome (Ljava/lang/String;)V getPreco ()D setPreco (D)V getQuantidadeNoEstoque ()I setQuantidadeNoEstoque (I)V mostrarDados	 ) + * java/lang/System , - out Ljava/io/PrintStream; / 
Nome: %s%n
 1 3 2 java/io/PrintStream 4 5 printf <(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream; 7 Preço: %.2f%n
 9 ; : java/lang/Double < = valueOf (D)Ljava/lang/Double; ? Quantidade no estoque: %d%n
 A C B java/lang/Integer < D (I)Ljava/lang/Integer; F Valor total no estoque: %.2f%n valorTotalNoEstoque adicionarEstoque 
quantidade removerEstoque L AQuantidade solicitada excede a quantidade disponível no estoque.
 1 N O  println StackMapTable 
SourceFile Produto.java !                    	 
   
        m     *� *+� *(� *� �             	 	 
        *                        	 
         /     *� �                               >     *+� �       
                                 /     *� �                         ! "     >     *'� �       
                          # $     /     *� �                         % &     >     *� �       
    #  $                	 
   '      �     b*� *� �kH� (.� Y*� S� 0W� (6� Y*� � 8S� 0W� (>� Y*� � @S� 0W� (E� Y'� 8S� 0W�           '  (  ) 6 * M + a ,        b      W G    H &     C     *Y� `� �       
    / 
 0                I 
   J &     l     *� � � (K� M� *Y� d� �           3  4  5  6  8                I 
  P    	  Q    R