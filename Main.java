����   = f  Questão1/Main  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LQuestão1/Main; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   Digite o nome do produto: 
 " $ # java/io/PrintStream % & print (Ljava/lang/String;)V
  ( ) * nextLine ()Ljava/lang/String; , Digite o preço do produto: 
  . / 0 
nextDouble ()D 2  Digite a quantidade no estoque: 
  4 5 6 nextInt ()I 8 Questão1/Produto
 7 :  ; (Ljava/lang/String;DI)V = 
Dados iniciais do produto:
 " ? @ & println
 7 B C  mostrarDados E 2
Digite a quantidade a ser adicionada ao estoque: 
 7 G H I adicionarEstoque (I)V K +
Dados do produto após entrada no estoque: M 0
Digite a quantidade a ser removida do estoque: 
 7 O P I removerEstoque R *
Dados do produto após saída do estoque:
  T U  close args [Ljava/lang/String; scanner Ljava/util/Scanner; nome Ljava/lang/String; preco D quantidadeNoEstoque I produto LQuestão1/Produto; quantidadeEntrada quantidadeSaida 
SourceFile 	Main.java !               /     *� �    
                    	      Z  	   �� Y� � L� � !+� 'M� +� !+� -J� 1� !+� 36� 7Y,)� 9:� <� >� A� D� !+� 36� F� J� >� A� L� !+� 36� N� Q� >� A+� S�    
   Z      	  
      %  -  3  @  H  M  U  [  b  j  o  w  }   � " � # � % � &    R    � V W    � X Y   ~ Z [  % q \ ]  3 c ^ _  @ V ` a  [ ; b _  }  c _   d    e