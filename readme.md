# 📝 Sobre este projeto
Neste repositório você encontrará um projeto utilizado no vídeo do canal para explicar sobre classes abstratas. Nele, modelamos um problema onde uma classe cliente precisa do cálculo de área de diferentes figuras geométricas. Para cada figura geométrica, é gerado então um acoplamento na classe cliente. 

Uma forma de lidarmos com essa situação, seria criando uma classe mãe das diferentes figuras geométricas que possuiria a implementação do cálculo da área de cada figura. Contudo, isso não garante que alguém que herde a classe de figuras geométricas faça a implementação do método de cálculo de área.

É aí que entram as `classes abstratas`. Com elas podemos forçar o comportamento para quaisquer classes que tenham a classe abstrata como mãe. Dessa forma, podemos garantir melhor extensibilidade em nossa aplicação e menor acoplamento.

## O Problema

Para entender melhor o problema, considere a situação da figura abaixo:

![figura1](https://github.com/doutorwaka/abstract-class/assets/107580593/39b866e5-7a36-402b-a5f9-6ab63ad55892)

Nela, temos uma classe cliente que deseja saber a área de cada figura geométrica. Se implementarmos sem utilizar nenhum mecanismo, a classe cliente deveria conhecer cada figura geométrica para ter acesso ao cálculo de área de cada figura. Isso significa que estaríamos criando um acoplamento direto entre a classe cliente e cada uma das figuras.

## A Solução

Para começarmos a solucionar o problema, deveríamos criar uma classe acima de cada figura, quer dizer, mãe de cada figura geométrica, como na imagem abaixo:

![figura2](https://github.com/doutorwaka/abstract-class/assets/107580593/538d22ff-d83b-45fd-92e9-30ec78d4b654)

Na imagem, a classe cliente agora só precisa conhecer a classe `figura geométrica` uma vez que ela já possui a implementação do cálculo de área. Contudo, se esse método não for sobreposto pelas suas filhas, a classe cliente estaria de fato chamando a implementação da classe mãe, o que ainda é indesejado.

Para solucionar isso e forçar com que qualquer um que herde a classe `figura geométrica`, podemos utilizar uma classe abstrata. Para entender melhor sobre isso, assista o vídeo: (Entenda de vez Classe Abstrata)[http://www.youtube.com/@doutorwaka].
