# Projeto Iphone
## Diagrama em UML e criação de interfaces e classes em Java de um IPhone.

Para começar este projeto eu ulitizei a Classe UML da [Lucidchart](https://lucid.app/lucidchart/17d2f4f4-7280-4ec2-9075-dcfe1562933c/edit?viewport_loc=-403%2C-12%2C2738%2C1263%2CHWEp-vi-RSFO&invitationId=inv_958e2352-e647-4d65-a1be-ff9b4b44ef52) para elaborar o diagrama do IPhone.

<img src="https://github.com/vverdum/UML-Iphone/assets/157656254/96578ac5-1932-4ed6-8d38-060c62636fe5 " style="width: 500px;">

Antes de explicar o código que estou propondo em java, gostaria de salientar que fiquei com muitas dúvidas e acabei utilizando a [Google AI Studio]( https://aistudio.google.com/app/prompts/1AetpkBVHd2BlOcm5y2b2mhLYY6-WysSh?utm_source=website&utm_medium=referral&utm_campaign=Alura&utm_content=) para me auxiliar nesse desafio. 

Utilizei o Visual Studio Code para criação do projeto. 

Então criei um pacote dispositivos com quatro pacotes: internet, musica, telefonia e Iphone.


<img src="https://github.com/vverdum/UML-Iphone/assets/157656254/30d96e17-eb6d-4b6b-aa84-5513f7325def" style="width: 200px;">

Após estabelecer esta estrutura, eu escrevi um prompt solicitando a criação de uma interface NavegadorInternet e uma classe Internet que implementasse esta interface. 
Desta forma, cada pacote contém dois arquivos uma classe e uma interface de acordo com o diagrama na UML, totalizando seis arquivos em java. 

Depois escrevi um prompt solicitando a criação de um arquivo iPhone que implementasse os métodos criados. 
Eu tive que fazer vários ajustes porque inicialmente o código implementou as classes e não as interfaces, declarou a variável musica mas não a utilizou e também não fechava o scanner. Após as correções, o código atendeu as minha expectativas. 

