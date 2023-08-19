# Atividade-Exames

## Atividade desenvolvida para o curso de Análise e Desenvolvimento de Sistemas, sendo o enunciado fornecido pelo professor da disciplina de Programação 1 o seguinte:
<br>
A tecnologia e a saúde andam cada vez mais próximas, com o poder da tecnologia é possível apoiar e melhorar os mais diversos processos da medicina. Hoje através de um dispositivo conectado ao corpo é possível por exemplo controlar índices de glicemia de forma online. Tais parâmetros podem ser lidos todos através do smartphone. Fora os smartwatches que conseguem monitorar batimentos cardiácos, oxigenação do sangue, entre outras funcionalidades que salvam vidas.
<br><br>
Sabendo disso um laboratório quer criar um dispositivo de monitoramento de 3 tipos de exames, o de glicemia, colesterol e triglicerídeo. Todos exames devem armazenar algumas características em comum como por exemplo, nome do paciente, tipo sanguíneo e ano de nascimento. Já para cada tipo de exame é necessário características específicas como:
  <br><br>  - Glicemia: precisa armazenar além dos dados do exame a quantidade de glicose por mg/l
  <br>  - Colesterol: precisa armazenar além dos dados do exame a quantidade de LDL e HDL por mg/l e o risco do paciente (B - baixo, M - medio e A - alto)
  <br>  - Triglicerídeos: precisa armazenar além dos dados do exame a quantidade de triglicerídeo por mg/l
   <br><br> 
Todos esses exames devem possuir três métodos, são eles:
   <br> - Classificar Resultado: Responsável por aplicar a conclusão a partir da quantidade obtida, deve olhar a quantidade e classificar como:
     <br>  <br> - Para Glicemia: Normoglicemia: Inferior a 100 mg/dL
              <br>           Pré-diabetes: Superior ou igual a 100 mg/dL eles Inferior a 126 mg/dL
               <br>          Diabetes estabelecido: Superior ou igual a 126 mg/dL
     <br><br>   - Para Colesterol HDL: De 0 a 19 anos..: superior a 45 mg/dL (HDL - BOM)
       <br>                        Acima de 20 anos: superior a 40 mg/dL (HDL - BOM)
      <br><br>  - Para Colesterol LDL: Se o paciente for risco baixo, o colesterol LDL deve estar abaixo de 100 mg/dL
          <br>                     Se o paciente for risco médio, o colesterol LDL deve estar abaixo de 70 mg/dL    
                            Se o paciente for risco alto, o colesterol LDL deve estar abaixo de 50 mg/dL
      <br>  Obs.: Como são dois parâmetros a classificação deve trazer as duas informações.
      <br> <br> - Para Triglicerídeos: De 0 a 9 anos: Com jejum: inferior a 75 mg/dL
           <br>                    De 10 a 19 anos: Com jejum: inferior a 90 mg/dL
               <br>                Acima de 20 anos: Com Jejum: inferior a 150 mg/dL
                   <br>          
   <br>     Obs.: Considere o campo ano de nascimento para calcular a idade, não importando o dia e mês do nascimento.
          <br>                  
  <br>  - Mostrar resultado: escrever na tela o valor do exame + a classificação obtida.
   <br> - Cadastrar Exame: no cadastro de exame, deve ser lido os dados do exame, bem como a quantidade em mg/dL já examinado pelo laboratório
