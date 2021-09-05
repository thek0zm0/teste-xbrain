## teste-xbrain

Premissas:
Criar uma API usando Spring Boot, que faz parte da nossa stack.
Utilizar um banco de dados em memória (HSQLDB ou H2)
Não é necessário desenvolver front-end, apenas o back-end.

Teste:
Desenvolver um serviço que seja capaz de gerar uma venda.
Uma venda é composta por id, data da venda, valor, vendedor id e vendedor nome.

Sua tarefa é desenvolver os serviços REST abaixo:
- Criar uma nova venda
- Retornar a lista de vendedores com os campos: nome, total de vendas do vendedor e média de vendas diária, conforme o período informado por parâmetro 

## Solution
Datas criadas com instant padrao ISO 8601
#--Inserir nova venda--
Endpoint: /sales
Body Json (exemplo): 
    "value" : 25.0,
    "date" : "2020-08-20T06:20:00Z", 
    "seller" : { "id": 1}

#--Lista de vendededores e medias--
Endpoint: /sales/between
Parameters (exemplo): 
Key	                Value
startDate	        2020-01-01T07:20:00Z
endDate	            2020-02-22T14:50:00Z
